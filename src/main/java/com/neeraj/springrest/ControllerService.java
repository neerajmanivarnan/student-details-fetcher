package com.neeraj.springrest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerService {
    @RequestMapping("/")
    public String getHome(){
        return "home.html";
    }
}
