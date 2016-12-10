package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by robertson on 10/12/2016.
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String Hello()
    {
        return "Hello World !";
    }
}
