package personal.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HomeController {

    // localhost:8088
    @GetMapping
    public String homeView(HttpServletRequest request){
        return "index";
    }

    @GetMapping("/404.html")
    public String error404(){
        return "error/404";
    }

    @GetMapping("/throw")
    public String testControllerException(){
        throw new RuntimeException("Home Controller Error 발생");
    }

}
