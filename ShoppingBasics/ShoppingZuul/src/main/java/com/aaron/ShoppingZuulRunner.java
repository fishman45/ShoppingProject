package com.aaron;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigChangeListener;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: lfl
 * @description:
 * @date: Create in 2020/2/18 上午 10:29
 */
@Component
@Slf4j
public class ShoppingZuulRunner implements CommandLineRunner {

    @ApolloConfig
    private Config config;

    @Override
    public void run(String... args) throws Exception {
        config.addChangeListener(new ConfigChangeListener() {
            @Override
            public void onChange(ConfigChangeEvent changeEvent) {
                log.info("更改前端口值:" + changeEvent.getChange("server.port").getOldValue() +
                        "更改后端口值:" + changeEvent.getChange("server.port").getNewValue());
            }
        });
    }
}
