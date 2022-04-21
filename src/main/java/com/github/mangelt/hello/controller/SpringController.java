package com.github.mangelt.controller;

import com.github.mangelt.beans.SpringBean1;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SpringController {

    private SpringBean1 springBean1;

    public void setSpringBean1(SpringBean1 springBean1) {
        this.springBean1 = springBean1;
    }

    @GetMapping( produces = MediaType.TEXT_PLAIN_VALUE)
    public String index() {
        return springBean1.getHello();
    }
}
