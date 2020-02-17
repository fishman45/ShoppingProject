package com.aaron;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lfl
 * @description: 网关
 * @date: Create in 2020/2/12 下午 11:35
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableSwagger2Doc
@EnableApolloConfig
public class ShoppingZuulApplication {

    /**
     * 获取配置文件信息
     */
    @ApolloConfig
    private Config config;

    public static void main(String[] args) {
        SpringApplication.run(ShoppingZuulApplication.class, args);
    }

    /**
     * @description: 添加文档来源（每次访问页面的时候加载）
     */
    @Component
    @Primary
    class DocumentationConfig implements SwaggerResourcesProvider {
        @Override
        public List<SwaggerResource> get() {
            // 网关使用服务别名获取远程服务的SwaggerApi(方法一)
            // List resources = new ArrayList<>();
            // resources.add(swaggerResource("WeChatService", "/api-wechat/v2/api-docs", "2.0"));
            // resources.add(swaggerResource("MemberService", "/api-member/v2/api-docs", "2.0"));
            return resources();
        }

        /**
         * 从阿波罗服务器中获取resources
         *
         * @return
         */
        private List<SwaggerResource> resources() {
            // 网关使用服务别名获取远程服务的SwaggerApi
            List resources = new ArrayList<>();
            String swaggerDocJson = swaggerDocument();
            JSONArray jsonArray = JSONArray.parseArray(swaggerDocJson);
            for (Object object : jsonArray) {
                JSONObject jsonObject = (JSONObject) object;
                String name = jsonObject.getString("name");
                String location = jsonObject.getString("location");
                String version = jsonObject.getString("version");
                resources.add(swaggerResource(name, location, version));
            }
            return resources;
        }

        /**
         * 获取swaggerDocument配置
         *
         * @return
         */
        private String swaggerDocument() {
            String property = config.getProperty("zuul.swaggerDocument", "");
            return property;
        }

        /**
         * 网关使用服务别名获取远程服务的SwaggerApi
         *
         * @param name
         * @param location
         * @param version
         * @return
         */
        private SwaggerResource swaggerResource(String name, String location, String version) {
            SwaggerResource swaggerResource = new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }
    }
}
