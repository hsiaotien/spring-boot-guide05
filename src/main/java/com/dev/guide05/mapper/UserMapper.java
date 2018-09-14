package com.dev.guide05.mapper;

import com.dev.guide05.pojo.User;

/**
 * 说明: @Mapper可以将UserMapper动态实现类注入spring
 * 其次还可以用spring的包扫描机制方式,即在启动类上添加注解@MapperScan即可
 */
//@Mapper
public interface UserMapper{

    User getUserById(Long id);
}
