package com.zhuc;

import com.github.pagehelper.PageInfo;
import com.zhuc.mybatis.entity.CountryExample;
import com.zhuc.mybatis.entity.Log;
import com.zhuc.mybatis.service.CountryService;
import com.zhuc.mybatis.utils.RequestBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.zhuc.mybatis.entity.Country;
import com.zhuc.mybatis.mapper.CountryMapper;
import org.springframework.data.domain.Page;

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


		PageInfo<Country> page2 = countryService.page2(2, 20);
		System.out.println(JSON.toJSONString(page2));


		Country c = countryService.findById(194);
		System.out.println(JSON.toJSONString(c));
//		c.setCountryName("中国");
//		countryService.update(c);

		int count = countryService.count2();
		System.out.println(count);

		Country cc = new Country();
		cc.setCountryCode("CN");
		cc.setCountryName("China");
		countryService.insert2(cc);
		System.out.println(cc.getId());


		Log log = countryService.findLogById(1);
		System.out.println(log.getTime());

		System.out.println("-------------------------");



		List<Country> page = countryService.page(9, 20);
		System.out.println(JSON.toJSONString(page));

		int n = countryService.count3();
		System.out.println("count3: "+n);

		CountryExample example = new CountryExample();
		example.createCriteria().andCountryCodeEqualTo("CN");
		countryService.delete(example);

	}

	@Test
	public void page(){
		RequestBean bean = new RequestBean();
		bean.setPageNumber(9);
		bean.setNumPerPage(20);
		bean.setSortName("country_Name");
		bean.setSortType("desc");

		Page<Country> pageSpring = countryService.pageSpring(bean);
		System.out.println(JSON.toJSONString(pageSpring));

		System.out.println("===================");
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
