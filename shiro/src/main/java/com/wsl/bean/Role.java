package com.wsl.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Set;
/**
 * @author wangcc
 * @create 2020-03-03 12:31
 **/
@Data
@AllArgsConstructor
public class Role {
    private String id;
    private String roleName;
    /**
     * 角色对应权限集合
     */
    private Set<Permissions> permissions;
    //省略set、get方法等.....
}
