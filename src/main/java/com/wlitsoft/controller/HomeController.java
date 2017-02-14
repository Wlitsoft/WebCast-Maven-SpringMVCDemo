package com.wlitsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liliang on 2017/2/14.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/hello")
    public ModelAndView Hello(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("text","hello");
        mv.setViewName("hello");
        return  mv;
    }

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return  "test";
    }
}
