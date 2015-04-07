package com.zhuc.mybatis.mapper;

import com.github.abel533.mapper.Mapper;
import com.zhuc.mybatis.entity.Country;
import com.zhuc.mybatis.entity.CountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountryMapper extends Mapper<Country> {
    int countByExample(CountryExample example);

    int deleteByExample(CountryExample example);

    List<Country> selectByExample(CountryExample example);

    int updateByExampleSelective(@Param("record") Country record, @Param("example") CountryExample example);

    int updateByExample(@Param("record") Country record, @Param("example") CountryExample example);
}