package pl.cloth.shop.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
@Slf4j
@RequiredArgsConstructor
public class IndexController {

    @GetMapping("")
    public String index(){
        return "index/index";
    }

    @GetMapping("/register")
    public String register(){
        return "index/register";
    }
}
