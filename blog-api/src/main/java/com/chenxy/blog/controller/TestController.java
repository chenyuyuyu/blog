package com.chenxy.blog.controller;

import com.chenxy.blog.dao.pojo.SysUser;
import com.chenxy.blog.utils.UserThreadLocal;
import com.chenxy.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping
    public Result test(){
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}
