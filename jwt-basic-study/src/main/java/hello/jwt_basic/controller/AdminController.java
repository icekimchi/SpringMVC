package hello.jwt_basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class AdminController {
    @GetMapping
    public String adminP(){

        return "Admin Controller";
    }
}
