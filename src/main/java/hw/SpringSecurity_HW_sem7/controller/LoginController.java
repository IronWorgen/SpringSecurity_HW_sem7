package hw.SpringSecurity_HW_sem7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LoginController {
    /**
     * форма входа
     * @return
     */
    @GetMapping("/loginForm")
    public String login(){
        return  "login";
    }

}
