package com.video.videocall;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner commandLineRunner(
//			UserService service
//	) {
//		return args ->{
//			service.register(User.builder()
//					         .username("Sak1")
//					         .email("sak1@gmail.com")
//					         .password("aaa")
//					         .build());
//			                
//			
//			 service.register(User.builder()
//					         .username("John")
//					         .email("john@email.com")
//					         .password("aaa")
//					         .build()); 
//			 
//			 service.register(User.builder()
//					          .username("Anna")
//					          .email("anna@email.com")
//					          .password("aaa")
//					          .build());
//			                
//		};
//		
//	}
	

}
