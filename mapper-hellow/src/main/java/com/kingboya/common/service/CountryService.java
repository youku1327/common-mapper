package com.kingboya.common.service;

import com.kingboya.common.entity.Country;
import com.kingboya.common.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 林 lsc
 * @Description
 * @Date 2019/8/21 10:12
 * @Version 1.0
 */
@Service
public class CountryService {

    @Autowired
    private CountryMapper countryMapper;

    public void testSelect(){
        //从 MyBatis 或者 Spring 中获取 countryMapper，然后调用 selectAll 方法
        List<Country> countries = countryMapper.selectAll();
        System.out.println("无条件查询所有"+countries);
        //根据主键查询
        Country country = countryMapper.selectByPrimaryKey(1);
        System.out.println("根据主键查询"+country);
        //或者使用对象传参，适用于1个字段或者多个字段联合主键使用
        Country query = new Country();
        query.setId(1);
        country = countryMapper.selectByPrimaryKey(query);
    }


}
