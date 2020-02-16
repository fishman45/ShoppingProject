package com.aaron.wechat.impl;

import com.aaron.wechatentity.WeChatEntity;
import com.aaron.wechatservice.WeChatService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lfl
 * @description: 微信接口实现
 * @date: Create in 2020/2/13 下午 12:10
 */
@RestController
public class WeChatServiceImpl implements WeChatService {

    @Override
    public WeChatEntity getWeChat() {
        return new WeChatEntity("123","李飞龙");
    }
}
