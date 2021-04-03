package org.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName org.example.controller
 * Description TODO
 * Date 2021-03-30
 * Time 21:03
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //指定服务的请求方法
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(){
        return "redirect:/index.html";//重定向的方式能够正确访问
       // return "/index.html";//转发的，请求的路径不变，访问不到index.html中引入的js代码
    }

    @RequestMapping("/XXX")
    @ResponseBody
    public String xxx(){
        return "/login";
    }

    @RequestMapping("/t1")
    @ResponseBody
    //返回的是一个json的数据格式，返回的是Object类型的对象，自动进行序列化，准换为json字符串
    public Object t1(){
        Map<String,String> map = new HashMap<>();
        map.put("1","高老庄");
        map.put("2","花果山");
        return map;
    }

    @RequestMapping("/t2")
    public ResponseEntity test7(){
        Map<String ,String> map = new HashMap<>();
        map.put("1","张三");
        return ResponseEntity.status(200).body(map);
    }

    @RequestMapping("/query/{id}")
    @ResponseBody
    public Object t2(@PathVariable Integer id){
        Map<String,String> map = new HashMap<>();
        map.put("1","高老庄"+id);
        map.put("2","花果山");
        return map;
    }

    @RequestMapping("/login2")
    @ResponseBody
    public Object login2(@RequestParam String username,@RequestParam String  password){
        Map<String,String> map = new HashMap<>();
        map.put("1",username);
        map.put("2",password);
        return map;

    }
}
