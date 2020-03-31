package com.propertiesplay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${messages-to-override.hello}")
    private String hellloMessage;

    @Value("${global-messages.project}")
    private String projectName;

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok(projectName + " - Message: " + hellloMessage);
    }
}
