package prototype.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootExampleApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(SpringBootExampleApplication.class).web(true).run(args);
  }

}
