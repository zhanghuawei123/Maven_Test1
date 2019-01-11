package com.qianfeng.controller;

import com.qianfeng.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 学生的增删改查
 * @author 5.19
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public void update(){
        System.out.println("看git的update功能");
    }

    public void add(){
        System.out.println("查看commit功能");
    }

}
