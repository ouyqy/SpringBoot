package com.avalon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ouyqy
 * @Created 2017/11/10.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model){
        //跳转的URL
        model.addAttribute("thymeleaf","thymeleaf/hello");
        return "index";
    }
}
