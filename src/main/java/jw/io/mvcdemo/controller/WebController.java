package jw.io.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    public String login() {
        return "user/login";
    }

    @RequestMapping("/success")
    public String login_success() {
        return "user/success";
    }

}
