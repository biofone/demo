package com.chao.activtidemo.controller;

import com.chao.activtidemo.common.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.*;

//@EnableSwagger2
@Api(tags = "流程控制案例")
@RestController
@RequestMapping("/user/")
public class LeaveController {

    static Map<Long,User> users=new HashMap<Long,User>();
    @ApiOperation(value="获取用户列表",notes = "获取用户信息" )
    @RequestMapping(value="",method = RequestMethod.GET)
    public List<User> getUserList() {
        List<User> r=new ArrayList<User>(users.values());
        return r;
    }
    @ApiOperation(value="创建用户",notes="根据User对象创建用户")
    @ApiImplicitParam(name="user",value="用户详细实体",required = true,dataType="User")
    @RequestMapping(value="",method = RequestMethod.POST)
    public String postUser(User user) {
        users.put(user.getId(),user);
        return "success";
    }
}
