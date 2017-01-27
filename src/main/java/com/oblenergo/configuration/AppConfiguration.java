package com.oblenergo.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
@ComponentScan("com.oblenergo")
@PropertySource("classpath:application.properties")
@EnableWebMvc
public class AppConfiguration extends WebMvcConfigurerAdapter {

  @Autowired
  private Environment environment;

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {

    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
  }

  @Bean
  public MessageSource messageSource() {

    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
    messageSource.setBasename("validationMessage");
    return messageSource;
  }

  @Override
  public void configureViewResolvers(ViewResolverRegistry registry) {

    UrlBasedViewResolver urlBasedViewResolver = new UrlBasedViewResolver();
    urlBasedViewResolver.setViewClass(TilesView.class);
    registry.viewResolver(urlBasedViewResolver);

  }

  @Bean
  public TilesConfigurer tilesConfigurer() {

    TilesConfigurer tilesConfigurer = new TilesConfigurer();
    String[] str = { "/WEB-INF/tiles/layouts.xml", "/WEB-INF/tiles/login.xml", "/WEB-INF/tiles/workType.xml",
            "/WEB-INF/tiles/orders.xml", "/WEB-INF/tiles/cashier.xml" };
    tilesConfigurer.setDefinitions(str);
    return tilesConfigurer;
  }

}
