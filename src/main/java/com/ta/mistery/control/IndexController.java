package com.ta.mistery.control;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest httpServletRequest, ModelAndView modelAndView) {
        modelAndView.setViewName("md/index");
        return modelAndView;
    }
}
