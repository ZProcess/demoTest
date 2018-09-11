package com;

import java.util.List;


import org.apache.ibatis.annotations.SelectProvider;


public interface SysMapper<T>{

    //查询整张表

    @SelectProvider(type = SysMapperProvider.class,
                   method = "dynamicSQL")
    List<T> findAll();



}
