package com.wsl.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Set;

/**
 * @author wangcc
 * @create 2020-03-03 12:30
 **/
@Data
@AllArgsConstructor
public class User {
    private String id;
    private String userName;
    private String password;
    /**
     * 用户对应的角色集合
     */
    private Set<Role> roles;
    //省略set、get方法等.....
}