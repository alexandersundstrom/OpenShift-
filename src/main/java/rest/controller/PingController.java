package rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PingController {

    @RequestMapping
    public ResponseEntity<String> getPing() {
        return ResponseEntity.ok("Ping");
    }
}
