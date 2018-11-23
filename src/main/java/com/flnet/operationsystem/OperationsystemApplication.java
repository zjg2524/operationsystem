package com.flnet.operationsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.flnet.operationsystem.dao"})
@EnableElasticsearchRepositories(basePackages = "com.flnet.operationsystem.common.es")
public class OperationsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperationsystemApplication.class, args);
	}
}
