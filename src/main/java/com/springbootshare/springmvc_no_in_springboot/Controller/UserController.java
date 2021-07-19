package com.springbootshare.springmvc_no_in_springboot.Controller;

import com.springbootshare.springmvc_no_in_springboot.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

  @RequestMapping("/hello")
  public ModelAndView hello(@RequestParam("name") String name) {
    ModelAndView result = new ModelAndView();
    result.setViewName("welcome");
    result.addObject("user", new User(name));
    return result;
  }
}
