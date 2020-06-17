package cg.wbd.grandemonstration.controller;

import cg.wbd.grandemonstration.service.CustomerService;
import cg.wbd.grandemonstration.service.impl.SimpleCustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("cg.wbd.grandemonstration")
public class WebConfig {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
        resourceViewResolver.setPrefix("/WEB-INF/customers/");
        resourceViewResolver.setSuffix(".jsp");
        return resourceViewResolver;
    }
    @Bean
    public CustomerService customerService(){
        return new SimpleCustomerServiceImpl();
    }
}
