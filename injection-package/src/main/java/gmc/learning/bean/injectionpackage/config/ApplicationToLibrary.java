package gmc.learning.bean.injectionpackage.config;

import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ApplicationToLibrary {
		
	public ApplicationToLibrary(User data) {
		log.error(data.toString());
	}

}
