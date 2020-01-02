package com.compass.basic2.config;

import javax.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.compass.basic2.filter.IPCheckFilter;

@Configuration


public class FilterConfig {

	@Bean
	public FilterRegistrationBean<Filter> getFilterRegistrationBean() {
	FilterRegistrationBean<Filter> bean =
	new FilterRegistrationBean<>(new IPCheckFilter());
	bean.addUrlPatterns("/visitor");
	return bean;
	}

	
}
