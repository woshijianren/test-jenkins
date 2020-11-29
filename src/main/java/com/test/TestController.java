package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "test, 用来sdf测sdf试jenkins, 这是一个后端项目test";
    }

    @GetMapping("/test2")
    public String test1() {
        return "jenkins的kksdf钩sd子是否kk生dsfjk效了?";
    }
}
