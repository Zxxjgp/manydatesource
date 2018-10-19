package com.example.manydatesource.dao.first;

import com.example.manydatesource.entity.TestVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestInterface {

    @Select("SELECT * FROM temp")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name")
    })
    List<TestVo> getAll();
}