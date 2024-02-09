package webappHtml.taxAPP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("webappHtml.taxAPP")

public class TaxAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxAppApplication.class, args);
	}

}
