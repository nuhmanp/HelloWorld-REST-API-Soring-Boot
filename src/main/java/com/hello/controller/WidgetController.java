package com.hello.controller;

import com.hello.beans.Widget;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nuhma on 2017-01-07.
 */
@RequestMapping("/api")
@RestController
public class WidgetController {
    @RequestMapping(method= RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
    public Widget index(){
        return new Widget("green", 10,7);
    }

}
