package com.example.multimodule.application;

import com.example.multimodule.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example.multimodule")
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private MyService myService;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Message from library :" + myService.message());
		System.out.println("Message from library :" + myService.urlData());
	}
}
