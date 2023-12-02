package com.example.eurekaclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/main")
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("/test")
    public String test() {
        log.info("!!test controller - " + instanceId);
        return instanceId;
    }
}
