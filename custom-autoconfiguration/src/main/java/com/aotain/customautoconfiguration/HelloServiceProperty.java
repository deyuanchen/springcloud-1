package com.aotain.customautoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author bang
 * @date 2018/7/1 17:10
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperty {
    private static final String MSG = "world";
    private String msg = MSG;

    public static String getMSG() {
        return MSG;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
