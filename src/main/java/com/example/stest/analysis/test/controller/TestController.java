package com.example.stest.analysis.test.controller;

import com.example.stest.analysis.StestApplication;
import com.example.stest.common.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@Controller
@Api(tags = "demo")
public class TestController extends BaseController {

    @Value("${test.test.name}")
    private String name;

    private static Logger logger = LoggerFactory.getLogger(StestApplication.class);

    @ApiOperation(value = "遍历json")
    @PostMapping("/test001")
    //事务
    @Transactional
    @ResponseBody
    public void test1(){
        System.out.println("hello");
    }


}
