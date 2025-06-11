package com.alder_r.springboot_board.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class IndexController {

    @GetMapping("/")
    public String index(){
        // log.info("index메서드 call");
        return "index.html";
    }
}