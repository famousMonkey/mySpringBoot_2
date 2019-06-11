package com.song.demo2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {


    @GetMapping(value = "/helloworld")
    public String test(){
        log.info("=====helloWorld=====");
        return "helloWorld";
    }

}
