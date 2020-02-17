package com.aaron.wechat.impl;

import com.aaron.wechatentity.WeChatEntity;
import com.aaron.wechatservice.WeChatService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lfl
 * @description: 微信接口实现
 * @date: Create in 2020/2/13 下午 12:10
 */
@RestController
public class WeChatServiceImpl implements WeChatService {

    @Value("${WeChatService.name}")
    private String Name;

    @Override
    public WeChatEntity getWeChat() {
        return new WeChatEntity("13710864544",Name);
    }
}
