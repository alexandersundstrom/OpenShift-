package rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class PingController {

    private final Logger log = LoggerFactory.getLogger(PingController.class);

    @RequestMapping()
    public ResponseEntity<String> getPing() {
        log.info("Endpoint was pinged");
        return ResponseEntity.ok("Ping");
    }

    @RequestMapping("/healthcheck")
    public ResponseEntity<String> healthchec() {
        log.info("Healtcheck ok");
        return ResponseEntity.ok("Healthcheck");
    }

}
