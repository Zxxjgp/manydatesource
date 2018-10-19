package com.example.manydatesource.dao.second;

import com.example.manydatesource.entity.SysUser;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * @program:hope
 * @author:aodeng
 * @create:2018-09-02 17:25
 **/
@org.apache.ibatis.annotations.Mapper
public interface TestMapper{
    @Select("SELECT * FROM sys_user")
    @Results({
            @Result(property = "user_id", column = "id"),
            @Result(property = "login_name", column = "name")
    })
    List<SysUser> getAll();
}