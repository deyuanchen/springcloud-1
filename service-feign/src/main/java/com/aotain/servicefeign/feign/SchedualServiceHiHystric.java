package com.aotain.servicefeign.feign;

import org.springframework.stereotype.Component;

/**
 * Demo class
 *
 * @author HP
 * @date 2018/06/28
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
