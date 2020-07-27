package com.example.demo.config;

import com.example.demo.listener.myListener;
import com.example.demo.servlet.MyServlet;
import com.example.demo.filter.myFilter;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class servletConfiguration {
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new MyServlet(),"/servlet");
        registrationBean.setLoadOnStartup(1);
        return registrationBean;
    }
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new myFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/hello","/servlet"));
        return filterRegistrationBean;
    }
    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        ServletListenerRegistrationBean<myListener> registrationBean = new ServletListenerRegistrationBean<myListener>(new myListener());
        return registrationBean;
    }
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(8083);
            }
        };
    }
}
