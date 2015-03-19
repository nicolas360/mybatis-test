package com.zhuc;

import com.github.pagehelper.PageInfo;
import com.zhuc.mybatis.service.CountryService;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.zhuc.mybatis.entity.Country;
import com.zhuc.mybatis.mapper.CountryMapper;

import java.util.List;

/**
 * Created by ZHUC on 2015/3/18.
 */
public class Test1 extends BasicTest {

//	@Autowired
//	private SqlSessionTemplate sqlSessionTemplate;
//
//	@Autowired
//	private CountryMapper countryMapper;

	@Autowired
	private CountryService countryService;

	@Test
	public void service(){
//		countryService.delete(35);

		List<Country> list = countryService.select();
		System.out.println(JSON.toJSONString(list));

		Country cc = new Country();
		cc.setCountryCode("CN");
		cc.setCountryName("China");
//		countryService.insert(cc);


		List<Country> page = countryService.page(1, 20);
		System.out.println(JSON.toJSONString(page));

		PageInfo<Country> page2 = countryService.page2(2, 20);
		System.out.println(JSON.toJSONString(page2));


		Country c = countryService.findById(194);
		System.out.println(JSON.toJSONString(c));
		c.setCountryName("中国");
		countryService.update(c);

		int count = countryService.count2();
		System.out.println(count);

	}

//	@Test
//	public void sql() {
//		CountryMapper cm = sqlSessionTemplate.getMapper(CountryMapper.class);
//		Country c = cm.selectByPrimaryKey(35);
//		System.out.println(JSON.toJSONString(c));
//
//		Country c2 = countryMapper.selectByPrimaryKey(35);
//		System.out.println(JSON.toJSONString(c2));
//	}

}
