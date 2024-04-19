package gmc.learning.bean.injectionapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import gmc.learning.bean.injectionpackage.config.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ComponentScan("gmc.learning.bean")
@SpringBootApplication
public class InjectionAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjectionAppApplication.class, args);
	}
	
	@Bean
	User navinUser() {
		User usr = new User();
		usr.setName("Navin");
		usr.setAge(12);
		return usr;
	}

	@Bean 
	String run(String textCommingFromLibrary) throws Exception {
		log.error(textCommingFromLibrary);
		return "OK";
	}

}
