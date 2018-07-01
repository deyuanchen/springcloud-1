package com.aotain.customautoconfiguration;

/**
 * @author bang
 * @date 2018/7/1 17:12
 */
public class HelloService {

    private String msg;

    public String sayHello(){
        return "Hello "+msg;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
}
