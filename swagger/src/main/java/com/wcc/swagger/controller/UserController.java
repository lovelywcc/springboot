package com.wcc.swagger.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wcc.swagger.domain.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author wangcc
 * @create 2020-03-04 16:37
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "查询用户信息", notes = "查询用户信息")
    @GetMapping (value = "/query")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "userId", paramType = "query", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "age", value = "age",required = true, paramType = "query", dataType = "Integer")})
    public User query(HttpServletResponse response, Integer id, Integer age) {
        User user = new User();
        user.setId(1);
        user.setAge(12);
        user.setName("王小子");
        String s = JSON.toJSONString(user);
        System.out.println(s);
        User object = JSON.parseObject(s, User.class);
        System.out.println(object);
        String toString = object.toString();
        System.out.println(toString);
        return user;
    }
}
