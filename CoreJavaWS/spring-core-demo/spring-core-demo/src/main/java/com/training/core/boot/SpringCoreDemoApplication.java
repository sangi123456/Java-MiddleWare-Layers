package com.training.core.boot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration //scans classpath jars to create required bean objects at runtime
@ComponentScan //scans the current package and its subpackage to find @Component annotation
@Configuration//register some explicit beans in the container
public class SpringCoreDemoApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context; //spring container is created at runtime
	
   public static void main(String[] args) {
	SpringApplication.run(SpringCoreDemoApplication.class, args);
	System.out.println("****Welcome to spring boot****");
	}

    @Override
    public void run(String... args) throws Exception {
     String[] beanNames = context.getBeanDefinitionNames();
     
       Arrays.sort(beanNames);
       for(String bean : beanNames) {
       System.out.println("bean in the container - " + bean);
}
       }
}
