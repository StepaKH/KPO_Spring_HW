package ru.hse.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hse.demo.Dodge;
import ru.hse.demo.Planes.Plane;


@RestController
public class Controller {
    @Autowired
    public Dodge dodge;
    @Autowired
    public Plane plane;

    @GetMapping("/get-dodge-voice")
    public String getDodgeVoice(){
        return dodge.voice();
    }

    @GetMapping("/get-plane-boarding")
    public String getBoeingBoarding(){
        return plane.boarding();
    }
}
