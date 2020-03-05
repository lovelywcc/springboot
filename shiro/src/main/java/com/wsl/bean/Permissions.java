package com.wsl.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wangcc
 * @create 2020-03-03 12:32
 **/
@Data
@AllArgsConstructor
public class Permissions {
    private String id;
    private String permissionsName;
    //省略set、get方法等.....
}
