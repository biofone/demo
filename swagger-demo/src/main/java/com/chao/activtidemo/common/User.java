package com.chao.activtidemo.common;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@ApiModel(description = "用户类")
public class User {
    private Long id;
    private String name;
    private Integer age;
}
