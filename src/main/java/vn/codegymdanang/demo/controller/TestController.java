package vn.codegymdanang.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/test/test")
    public String home(){
        return "test";
    }
}
