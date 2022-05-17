package com.example.springbootwebsocketdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author xiuchen lang 22920192204222
 * @date 2022/05/17 20:21
 */
@Configuration
public class WebMvcConfig  extends WebMvcConfigurerAdapter {
    //为ws.HTML 提供便捷的路径映射。
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/ws").setViewName("ws");
    }
}
