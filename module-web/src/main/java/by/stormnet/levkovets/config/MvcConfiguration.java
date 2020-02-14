package by.stormnet.levkovets.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Import({DaoConfiguration.class, SecurityConfiguration.class})

@Configuration
@EnableWebMvc
@ComponentScan("by.stormnet.levkovets.controllers")
public class MvcConfiguration implements WebMvcConfigurer {


    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

   /* @Bean
    WebMvcConfigurer myWebMvcConfigurer() {
        return new WebMvcConfigurerAdapter() {

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                ViewControllerRegistration r = registry.addViewController("/login");
                r.setViewName("login");
            }
        };
    }*/


    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}
