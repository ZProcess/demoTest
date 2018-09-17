package com;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

public interface SysMapper<T>{

    //查询整张表

    @SelectProvider(type = SysMapperProvider.class,
                   method = "dynamicSQL")
    List<T> findAll();



}
