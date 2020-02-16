package com.aaron.wechatservice;

import com.aaron.wechatentity.WeChatEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: lfl
 * @description: 微信接口
 * @date: Create in 2020/2/13 下午 12:05
 */
@Api(tags = "微信服务接口")
public interface WeChatService {

    /**
     * @return WeChatEntity
     * @description: 获取微信基本信息
     */
    @ApiOperation(value = "获取微信基本信息")
    @GetMapping("/getWeChat")
    public WeChatEntity getWeChat();
}
