package com.bolic.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String mainView() {
        return "page/home";
    }

    @GetMapping("/test")
    public String testView() {
        return "page/test";
    }
}
