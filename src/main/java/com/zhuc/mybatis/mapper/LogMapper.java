package com.zhuc.mybatis.mapper;

import com.github.abel533.mapper.Mapper;
import com.zhuc.mybatis.entity.Log;
import com.zhuc.mybatis.entity.LogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogMapper extends Mapper<Log> {
    int countByExample(LogExample example);

    int deleteByExample(LogExample example);

    List<Log> selectByExample(LogExample example);

    int updateByExampleSelective(@Param("record") Log record, @Param("example") LogExample example);

    int updateByExample(@Param("record") Log record, @Param("example") LogExample example);
}