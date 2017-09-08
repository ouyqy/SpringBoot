package com.avlaon.config;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by ouyqy on 2017/9/8.
 * Servlet3.0及以上
 */
public class WebInit implements WebApplicationInitializer{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("spring.profiles.default","dev");
    }
}
