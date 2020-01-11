package com.chao.activtidemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableSwagger2
@Api(tags = "swagger_demo")
@RestController
@RequestMapping("/swagger/")
public class SwaggerDemo {
    @ApiModelProperty(value="part 的 描述")
    private String partDesc;

    @ApiOperation(value="上传excel的方法")
    @PostMapping("/uploadExcel")
    public void uploadOrderExcel(@RequestParam("ePlusExcel") MultipartFile ePlusExcel) {

    }
    @ApiOperation(value="查询Inventory")
    @GetMapping("/queryInventory")
    public void queryInventory(@ApiParam(value="客户编码")String customerCode) {

    }
}
