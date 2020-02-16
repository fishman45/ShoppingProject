package com.aaron.memberservice;

import com.aaron.wechatentity.WeChatEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: lfl
 * @description: 会员api
 * @date: Create in 2020/2/13 下午 03:28
 */
@Api(tags = "会员服务接口")
public interface MemberService {

    /**
     * @return WeChatEntity
     * @description: 会员调用微信服务
     */
    @ApiOperation(value = "会员服务调用微信服务")
    @GetMapping("/getWeChat")
    public WeChatEntity getWeChat();
}
