package ar.edu.unju.fi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Enzo Sandoval
 *
 */
@Controller
@SpringBootApplication
public class HelloWorldApplication {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	/**
	 * 
	 * @return Hello World! in HTML
	 */
	@ResponseBody
	@RequestMapping("/")
	public String getPage() {
		return "<h1>Hello World!</h1>";
	}

}