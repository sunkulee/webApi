package com.rainycube.petAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    	return application.sources(Application.class);
	    }
		
		public static void main(String[] args) throws Exception {
			ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		}
}





// something..... 
//some1111111


// some22222
// some3333


//s



