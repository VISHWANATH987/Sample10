package com.example10.demo10;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class Controller {
	
	@GetMapping("/StartServer")
	public String StartServer()
	{
		System.out.println("KLS GIT STARTING SERVER......");
		return "KLS GIT";
	}

}
