package com.fujitsu.book_app.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.fujitsu.book_app")
public class BookConfig {
	@Bean
	public  JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate;
	}

	// @Bean
	// public DataSource dataSource() {
	// BasicDataSource dataSource = new BasicDataSource();
	// dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	// dataSource.setUrl("jdbc:mysql://localhost:3306/course_db");
	// dataSource.setUsername("root");
	// dataSource.setPassword("password");
	// return dataSource;
	// }
}
