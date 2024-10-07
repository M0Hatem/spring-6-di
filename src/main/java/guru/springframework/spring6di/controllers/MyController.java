package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting() ;
    }
}
