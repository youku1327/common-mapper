package com.kingboya.common.mapper;

import com.kingboya.common.entity.Country;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author 林 lsc
 * @Description
 * @Date 2019/8/21 10:11
 * @Version 1.0
 */
public interface CountryMapper extends Mapper<Country> {

    // 也可以使用 CountryMapper.xml 方式
    @Select("select * from country where countryname = #{countryname}")
    Country selectByCountryName(String countryname);
}
