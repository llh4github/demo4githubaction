package com.llh.demo4githubaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * <p>Created At 2023/3/16 22:28
 *
 * @author llh
 */
@RestController
public class HelloController {

    @GetMapping({"", "hello"})
    public Map<String, LocalDateTime> index() {
        return Map.of("Hello", LocalDateTime.now());
    }
}
