package com.wcc.swagger.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wangcc
 * @create 2020-03-04 16:45
 **/
@Data
public class User {
    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("用户年龄")
    private Integer age;
}
