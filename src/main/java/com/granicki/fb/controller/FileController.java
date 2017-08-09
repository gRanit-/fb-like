package com.granicki.fb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wojciechgranicki on 09.08.2017.
 */
@Controller
public class FileController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public void upload() {

    }
}
