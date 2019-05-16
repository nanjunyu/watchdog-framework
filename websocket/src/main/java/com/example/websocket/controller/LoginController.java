package com.example.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/LoginController")
    public ModelAndView login(@RequestParam("username") String username,
                              Map<String,Object> map){
        map.put("username",username);
        return new ModelAndView("chat",map);

    }

    @GetMapping("/login")
    public ModelAndView client(){
        return new ModelAndView("login");
    }
}
