package com.xy.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class MainWebService {

    @ResponseBody
    // 如果返回Json（或XML）等类型的数据不需要ResponseBody注解
    @RequestMapping("/greeting")
    public HashMap greeting() {
//        return "hello, world.";
        HashMap json = new HashMap();
        json.put("ver", "1.0.0");
        json.put("method", "greeting");

        return json;
    }

}
