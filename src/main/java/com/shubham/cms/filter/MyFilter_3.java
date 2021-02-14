package com.shubham.cms.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

// Spring Component annotation (@Component) is used to denote a class as Component.
//  It means that Spring framework will autodetect these classes for dependency injection when annotation-based configuration and
// classpath scanning is used.
@Component
@Order(3)
public class MyFilter_3 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 3 is called");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
