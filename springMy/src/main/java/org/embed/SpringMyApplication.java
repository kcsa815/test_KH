package org.embed;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMyApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringMyApplication.class, args);
		SpringApplication application = new SpringApplication(SpringMyApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.setAdditionalProfiles("myprofile");
		application.run(args);
	}

}
