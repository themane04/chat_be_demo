package ch.postfinance.chatprototype.ccyp.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping("/health")
    public String healthCheck() {
        return "Backend is running";
    }
}
