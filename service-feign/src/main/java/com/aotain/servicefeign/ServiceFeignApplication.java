package com.aotain.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
// 启动断路器，如果要监控hystrix的流必须开启此注解，即使fegin已经通过属性
@EnableCircuitBreaker
public class ServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFeignApplication.class, args);
	}
}
