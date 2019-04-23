package net.cc.demo_springboot_first.web.interceptor;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @classname WebConfig
 * @author: zhonghua.zhi
 * @date: 2019-04-23 14:04
 * @version: 1.0
 * @description: TODO
 */
@SpringBootConfiguration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);

        /** 自定义拦截器 **/
        registry.addInterceptor(new HelloInterceptor());
    }
}