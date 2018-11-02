package com.chengxiaoxiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: HelloHandler
 * @description:
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2018-11-01
 */
@Controller
@RequestMapping("/hello")
public class HelloHandler {

    @RequestMapping("/world")
    public String world(Model model) {
        model.addAttribute("message", "this is hello world1111");
        return "index";
    }

}
