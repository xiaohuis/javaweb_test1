package com.xiaohui.web;

import com.alibaba.fastjson.JSON;
import com.xiaohui.pojo.User;

public class FastJsonDemo {
    public static void main(String[] args) {

        User user = new User();
        user.setId(1);
        user.setUsername("root");
        user.setPassword("123");

        String s = JSON.toJSONString(user);
        System.out.println(s);

        User user1 = JSON.parseObject("{\"id\":1,\"password\":\"123\",\"username\":\"root\"}", User.class);
        System.out.println(user1);
    }
}
