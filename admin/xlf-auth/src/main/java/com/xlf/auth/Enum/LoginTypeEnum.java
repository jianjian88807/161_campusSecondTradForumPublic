package com.xlf.auth.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 登录方式枚举
 *
 */
@Getter
@AllArgsConstructor
public enum LoginTypeEnum {
    /**
     * 用户名登录
     */
    USERNAME(1, "用户名登录", ""),

    /**
     * QQ登录
     */
    QQ(2, "QQ登录", "qqLoginStrategyImpl"),

    /**
     * 微信登录
     */
    WX(3,"微信登录", "wxLoginStrategyImpl");

    /**
     * 登录方式
     */
    private final Integer type;

    /**
     * 描述
     */
    private final String desc;

    /**
     * 策略
     */
    private final String strategy;


}
