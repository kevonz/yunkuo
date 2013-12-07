package com.yunkuo.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class DefaultController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        return "index";
    }

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello yunkuo!");
		return "hello";
	}
/*
    @RequestMapping("/user")
    public ModelAndView  user(HttpServletRequest request, HttpServletResponse response) {
        User u1=new User();
        u1.setName("jin");
        u1.setSex("male1");
        User u2=new User();
        u2.setName("guang");
        u2.setSex("male2");
        List a=new ArrayList();
        a.add(u1);
        a.add(u2);
        System.out.println(a);
        return new ModelAndView("user","userList",a);
    }*/

}