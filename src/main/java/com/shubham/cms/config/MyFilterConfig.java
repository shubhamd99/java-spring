package com.shubham.cms.config;

import com.shubham.cms.filter.MyNewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration annotation indicates that a class declares one or more @Bean methods,
// and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.
@Configuration
public class MyFilterConfig {

    // @Bean annotation tells that a method produces a bean to be managed by the Spring container.
    // A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.
    @Bean
    public FilterRegistrationBean<MyNewFilter> registrationBean() {
        FilterRegistrationBean<MyNewFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyNewFilter());
        registrationBean.addUrlPatterns("/customers/*");

        return registrationBean;
    }
}
