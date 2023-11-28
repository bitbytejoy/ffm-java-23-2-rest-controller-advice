package de.neuefische.ffmjava232restcontrolleradvice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {
    @GetMapping
    public String get() {
        throw new IllegalArgumentException("Test");
    }
}
