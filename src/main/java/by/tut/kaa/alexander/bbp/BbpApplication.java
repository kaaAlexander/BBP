package by.tut.kaa.alexander.bbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BbpApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbpApplication.class, args);
		System.setProperty("tomcat.util.http.parser.HttpParser.requestTargetAllow", "{}");
	}
}
