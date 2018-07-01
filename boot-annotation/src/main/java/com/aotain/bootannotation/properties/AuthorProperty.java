package com.aotain.bootannotation.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author bang
 * @date 2018/7/1 11:01
 */

@Getter
@Setter
@ConfigurationProperties(prefix = "book")
@Component
public class AuthorProperty {
    private String name;
    private String author;
}
