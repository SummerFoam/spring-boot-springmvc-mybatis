package com.springbootspringmvcmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springbootspringmvcmybatis.dao")//扫描mybatis的mapper接口
public class SpringBootSpringmvcMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpringmvcMybatisApplication.class, args);
	}
}
