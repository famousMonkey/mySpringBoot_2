package com.song.demo2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
@Slf4j
public class TestController {


    @GetMapping(value = "/helloworld")
    public void test(){
        log.info("=====helloWorld=====");
    }

}
