package main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"device"})
public class MainApplication extends SpringBootServletInitializer  {
	public static void main(String args[]) {
		System.out.println("!!!1"+MainApplication.class.getName());
		SpringApplication.run(MainApplication.class, args);
	}
}
