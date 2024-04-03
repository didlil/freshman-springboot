/**
 * 機能：
 * 作成者：kaise
 * 期日：2024/01/18 17:01
 */

package com.example.freshmanspringboot.common;

import org.springframework.web.filter.CorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    //当前跨域请求最大有效时长。这里是默认是1天
    private static final long MAX_AGE = 24 *60 *60;

    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");//1,设置访问源地址
        corsConfiguration.addAllowedHeader("*");//2,设置访问源请求头
        corsConfiguration.addAllowedMethod("*");//3,设置访问源请求方法
        corsConfiguration.setMaxAge(MAX_AGE);
        source.registerCorsConfiguration("/**",corsConfiguration);//4,对接口配置跨域设置
        return new CorsFilter(source);
    }
}
