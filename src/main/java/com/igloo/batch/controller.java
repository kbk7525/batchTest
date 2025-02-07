package com.igloo.batch;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    private final service service;

    public controller(com.igloo.batch.service service) {
        this.service = service;
    }

    @PostMapping("/check")
    public Integrity save(@RequestBody Integrity integrity) {
        return service.saveIntegrity(integrity);
    }
}
