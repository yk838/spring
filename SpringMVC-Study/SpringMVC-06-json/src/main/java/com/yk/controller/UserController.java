package com.yk.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.yk.pojo.User;
import com.yk.utils.JsonUtils;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yk
 * @date 2021/6/23  22:10
 */
/*@RestController 统一处理json返回字符串*/
@RestController
public class UserController {
    ////produces:指定响应体返回类型和编码
    //@RequestMapping(value = "/json1",produces = "application/json;charset=utf-8" 等价于@RestController + @RequestMapping("/j1")
    @RequestMapping("/j1")
    public String json() throws JsonProcessingException {
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("杨凯",22,"男");
        //将我们的对象解析成为json格式
        String s = mapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping("/json2")
    public String json2() throws JsonProcessingException {

        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user1 = new User("秦疆1号", 3, "男");
        User user2 = new User("秦疆2号", 3, "男");
        User user3 = new User("秦疆3号", 3, "男");
        User user4 = new User("秦疆4号", 3, "男");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(list);
        return str;
    }

    @RequestMapping("/json3")
    public String json3() throws JsonProcessingException {
    //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();

        //创建时间一个对象，java.util.Date
        Date date =  new Date();
        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(date);
        return str;
        /*默认日期格式会变成一个数字，是1970年1月1日到当前日期的毫秒数！ str = "1624465395986",
        * Jackson 默认是会把时间转成timestamps形式*/
    }
    @RequestMapping("/json4")
    public String json4() throws JsonProcessingException {
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //自定义日期格式对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //指定日期格式
        mapper.setDateFormat(sdf);

        Date date = new Date();//当前时间对象
        String str = mapper.writeValueAsString(date);

        return str;
    }

    //我们使用工具类，代码就更加简洁了
    @RequestMapping("/json5")
    public String json5() throws JsonProcessingException {
        Date date = new Date();
        String json = JsonUtils.getJson(date);
        return json;
    }
}