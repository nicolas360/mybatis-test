package com.zhuc.mybatis.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhuc.mybatis.entity.Country;
import com.zhuc.mybatis.entity.CountryExample;
import com.zhuc.mybatis.entity.Log;
import com.zhuc.mybatis.mapper.CountryMapper;
import com.zhuc.mybatis.mapper.CountryMapper2;
import com.zhuc.mybatis.mapper.CountryMapper3;
import com.zhuc.mybatis.mapper.LogMapper;
import com.zhuc.mybatis.utils.DaoPlusHelper;
import com.zhuc.mybatis.utils.RequestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ZHUC on 2015/3/18.
 */
@Service
@Transactional
public class CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private CountryMapper2 countryMapper2;

    @Autowired
    private CountryMapper3 countryMapper3;

    @Autowired
    private LogMapper logMapper;

    public Log findLogById(Integer id){
        return logMapper.selectByPrimaryKey(id);
    }

    public Country findById(Integer id){
        return countryMapper.selectByPrimaryKey(id);
    }

    public void delete(Integer id){
        countryMapper.deleteByPrimaryKey(id);
        throw new RuntimeException("123123"); //有事务可回滚
    }

    public void delete(CountryExample example){
        countryMapper.deleteByExample(example);
    }

    public List<Country> select(){
        CountryExample example = new CountryExample();
        example.createCriteria().andCountryCodeEqualTo("CL");

        return countryMapper.selectByExample(example);
    }

    /**
     * 不返回ID
     * @param c
     */
    public void insert(Country c){
        countryMapper.insert(c);
    }

    /**
     * 可返回ID
     * @param c
     */
    public void insert2(Country c){
        countryMapper2.insert(c);
    }

    public void update(Country c){
        countryMapper.updateByPrimaryKey(c);
    }

    public PageInfo<Country> page2(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        CountryExample example = new CountryExample();
        example.setOrderByClause("country_Name desc");
        List<Country> list = countryMapper.selectByExample(example);
        return new PageInfo(list);
    }

    public List<Country> page(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        CountryExample example = new CountryExample();
        example.setOrderByClause("country_Name desc");
        return countryMapper.selectByExample(example);
    }

    public int count2(){
        return countryMapper2.count();
    }

    public int count3(){
        return countryMapper3.selectCountByExample(null);
    }

    public Page<Country> pageSpring(RequestBean bean){
        PageHelper.startPage(bean.getPageNumber(), bean.getNumPerPage());

        String obc = bean.getSortName()+" "+bean.getSortType();
        CountryExample example = new CountryExample();
        example.setOrderByClause(obc);
        List<Country> list = countryMapper.selectByExample(example);

        int total = countryMapper.countByExample(null);

        PageRequest req = DaoPlusHelper.build(bean);
        return new PageImpl<Country>(list, req, total);
    }
}
