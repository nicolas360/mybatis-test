package com.zhuc.mybatis.mapper;

import com.github.abel533.mapper.Mapper;
import com.zhuc.mybatis.entity.UserLogin;
import com.zhuc.mybatis.entity.UserLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoginMapper extends Mapper<UserLogin> {
    int countByExample(UserLoginExample example);

    int deleteByExample(UserLoginExample example);

    List<UserLogin> selectByExample(UserLoginExample example);

    int updateByExampleSelective(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    int updateByExample(@Param("record") UserLogin record, @Param("example") UserLoginExample example);
}