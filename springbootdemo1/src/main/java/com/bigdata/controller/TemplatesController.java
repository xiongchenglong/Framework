package com.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/templates")
public class TemplatesController {

   @RequestMapping("/hello")
   public String hello(Map<String, Object> map) {
      //返回的是ModelAndView对象;
      //ModelAndView mv = new ModelAndView("hello");
      //return mv;
      map.put("name", "jack");
      return "hello";
   }

   @RequestMapping("/helloftl")
   public String helloFtl(Map<String,Object> map){
      map.put("name","jackma");
      return "helloftl";
   }
}