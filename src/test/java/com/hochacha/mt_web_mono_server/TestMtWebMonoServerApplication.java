package com.hochacha.mt_web_mono_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestMtWebMonoServerApplication {

	public static void main(String[] args) {
		SpringApplication.from(MtWebMonoServerApplication::main).with(TestMtWebMonoServerApplication.class).run(args);
	}

}
