package julianportfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Portfolio")
public class HomeController {

    //Context etc. may go here.

    public HomeController(){

    }

    @GetMapping("/getStuff")
    public void getStuff(){
        System.out.println("It works.");
    }
}
