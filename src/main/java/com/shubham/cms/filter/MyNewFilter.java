package com.shubham.cms.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

// Spring Component annotation (@Component) is used to denote a class as Component.
//  It means that Spring framework will autodetect these classes for dependency injection when annotation-based configuration and
// classpath scanning is used.
@Component
public class MyNewFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("The new filter is called...");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
