package com.te.employeeproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class EmployeeConfig {
	@Bean
	public LocalEntityManagerFactoryBean getFactory() {
		LocalEntityManagerFactoryBean bean= new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("springdb");
		return bean;
		
	}

}
