package com.example.manydatesource.web;

import com.example.manydatesource.dao.first.TestInterface;
import com.example.manydatesource.dao.second.TestMapper;
import com.example.manydatesource.entity.SysUser;
import com.example.manydatesource.entity.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeseController {

    @Autowired
    private TestInterface testInterface;

    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/login")
    public String login(Model model){
        //数据源first测试
        List<TestVo> list=testInterface.getAll();

        //数据源second测试
        List<SysUser> user=testMapper.getAll();

        return "admin/system_login";
    }
}