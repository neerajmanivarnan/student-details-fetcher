package com.neeraj.springrest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "http://localhost:3000") // 
public class ControllerService {
    @RequestMapping("/")
    public String getHome(){
        return "home.html";
    }
}
