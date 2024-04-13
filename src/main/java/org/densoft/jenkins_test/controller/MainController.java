package org.densoft.jenkins_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/path")
public class MainController {

    @GetMapping
    public String sayHello() {
        return "Hello user";
    }
}
