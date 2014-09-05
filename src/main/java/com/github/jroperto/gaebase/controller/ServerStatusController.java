package com.github.jroperto.gaebase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ServerStatusController extends BaseController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String get() {
        return "server OK";
    }
}
