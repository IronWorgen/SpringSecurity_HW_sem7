package hw.SpringSecurity_HW_sem7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    /**
     * страница доступная только админам
     * @return
     */
    @GetMapping("/private-data")
    public  String privateData(){
        return  "privateData";
    }

    /**
     * страница доступная только админам
     * @return
     */
    @GetMapping("/public-data")
    public  String publicData(){
        return  "publicData";
    }

}
