package gmc.learning.bean.injectionpackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class InjectionPackageApplication {
	
	@Bean
	String data() {
		return "hi from Navin...";
	}

}
