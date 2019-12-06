package com.wcc.corsone.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wangcc
 * @create 2019-12-07 0:28
 **/
@Configuration
public class CrosConfig implements WebMvcConfigurer{
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("http://localhost:8081")
                    .allowedMethods("*")
                    .allowedHeaders("*");
        }
}
