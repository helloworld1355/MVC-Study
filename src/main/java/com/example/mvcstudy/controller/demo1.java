package com.example.mvcstudy.controller;

import com.example.mvcstudy.entity.User;
import org.springframework.web.bind.annotation.*;

//有Restcontroller可以不要Controller
@RestController
public class demo1 {

//    映射一个字符串--test1
    @ResponseBody
    @RequestMapping("/test1")
    public String test1(){
        return "test1";
    }

//    返回一个html网页--无RespoonseBody
//    html存放在--template--下
    @RequestMapping("/test2")
    public String test2(){
        return "test2";
    }


//    从后端接收一个json格式的数据到前端
//    使用类--User--返回User
//    需要ResponseBody
//    value用来匹配一个路径，method对应请求方法，常用GET和POST
    @RequestMapping(value = "/test3",method = RequestMethod.GET)
    public User test3(){
    User user = new User();
        user.setId(202105);
        user.setName("薄荷巧克力");
        user.setNum("2021051228");
        return user;
    }

//  value可以用一个简单表达式
//    在路径上打入id传给后端
    @ResponseBody
    @RequestMapping("/test4/{id}")
    public String getById(@PathVariable("id") Long id){
        System.out.println(id);
        return id.toString();
    }

}