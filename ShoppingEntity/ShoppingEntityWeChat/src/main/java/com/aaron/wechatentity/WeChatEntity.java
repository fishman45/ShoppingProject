package com.aaron.wechatentity;

import lombok.Data;

/**
 * @author: lfl
 * @description:
 * @date: Create in 2020/2/13 上午 11:50
 */
@Data
public class WeChatEntity {

    /**
     * @description: WeChatId
     */
    private String WeChatId;

    /**
     * @description: WeChatName
     */
    private String WeChatName;

    public WeChatEntity(String weChatId, String weChatName) {
        super();
        this.WeChatId = weChatId;
        this.WeChatName = weChatName;
    }
}
