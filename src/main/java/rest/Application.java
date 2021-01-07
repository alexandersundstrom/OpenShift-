package rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rest.controller.PingController;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(PingController.class);

    public static void main(String[] args) {
        String environment = System.getenv("environment");
        String user = System.getenv("user");
        String psw = System.getenv("psw");
        SpringApplication.run(Application.class, args);
        log.info("User: {} started application with environment: {} and password: {} and following arguments {}", user, environment, psw, args);
    }
}
