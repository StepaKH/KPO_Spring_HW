package hse.ru.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello-all")
    public String hello(){
        return "<b>Hello, people!</b>";
    }

    @GetMapping("/hello-user")
    public String user(){
        return "<b>Hello, registered user!</b>";
    }

    @GetMapping("/hello-admin")
    public String admin(){
        return "<b>Hello, admin!</b>";
    }
}
