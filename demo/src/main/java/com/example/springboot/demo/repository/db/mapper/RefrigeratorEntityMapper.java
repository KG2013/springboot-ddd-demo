package com.example.springboot.demo.repository.db.mapper;

import com.codingapi.simplemybatis.mapper.SimpleMapper;
import com.example.springboot.demo.repository.db.entity.RefrigeratorEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Update Mapper 是对资源的写操作
 */
@Mapper
public interface RefrigeratorEntityMapper extends SimpleMapper<RefrigeratorEntity> {

    @Update("TRUNCATE T_REFRIGERATOR")
    void truncate();

    @Select("SELECT * FROM T_REFRIGERATOR WHERE STATE = 0 LIMIT 1 ")
    RefrigeratorEntity findSpace();
}
