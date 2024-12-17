package se.roger;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.*;

@SpringBootApplication
@RestController
@EnableAutoConfiguration

public class App {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String ping() {
        log.info("Request on ping endpoint");
        log.debug("DEBUG: Request on ping endpoint22");
        return "pong";
    }
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
