package com.example.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by robertson on 10/12/2016.
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public ResponseEntity<String> HelloWorld()
    {
        return new ResponseEntity<>("Hello World !", HttpStatus.OK);
    }
}
