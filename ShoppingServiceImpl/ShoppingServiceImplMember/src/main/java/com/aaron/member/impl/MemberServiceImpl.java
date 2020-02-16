package com.aaron.member.impl;

import com.aaron.member.feign.WeChatServiceFeign;
import com.aaron.memberservice.MemberService;
import com.aaron.wechatentity.WeChatEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lfl
 * @description: 会员接口实现
 * @date: Create in 2020/2/13 下午 03:37
 */
@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private WeChatServiceFeign weChatServiceFeign;

    @Override
    public WeChatEntity getWeChat()  {
        return weChatServiceFeign.getWeChat();
    }
}
