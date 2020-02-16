package com.aaron.member.feign;

import com.aaron.wechatservice.WeChatService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: lfl
 * @description:
 * @date: Create in 2020/2/13 下午 03:43
 */
@FeignClient("WeChatService")
public interface WeChatServiceFeign extends WeChatService {
}
