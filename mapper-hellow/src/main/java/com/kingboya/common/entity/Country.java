package com.kingboya.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.StringTypeHandler;
import tk.mybatis.mapper.annotation.ColumnType;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @Author 林 lsc
 * @Description 国家信息
 * @Date 2019/8/21 10:04
 * @Version 1.0
 */
@Data
//通用 Mapper 中，默认情况下是将实体类字段按照驼峰转下划线形式的表名列名进行转换。
// @Table 注解可以配置 name,catalog 和 schema 三个属性，配置 name 属性后，直接使用提供的表名，不再根据实体类名进行转换。
// 其他两个属性中，同时配置时，catalog 优先级高于 schema，也就是只有 catalog 会生效
@Table(name = "country")
@NoArgsConstructor
@AllArgsConstructor
@NameStyle(value = Style.normal)
public class Country {

    /*
     * normal,                     //原值
    camelhump,                  //驼峰转下划线
    uppercase,                  //转换为大写
    lowercase,                  //转换为小写
    camelhumpAndUppercase,      //驼峰转下划线大写形式
    camelhumpAndLowercase,      //驼峰转下划线小写形式
     **/

    //一个实体类中至少需要一个标记 @Id 注解的字段，存在联合主键时可以标记多个。
    //当类中没有存在标记 @Id 注解的字段时，你可以理解为类中的所有字段是联合主键。使用所有的 ByPrimaryKey 相关的方法时，有 where 条件的地方，会将所有列作为条件。
    @Id
    @KeySql(useGeneratedKeys = true)
    //<insert id="insert" useGeneratedKeys="true" keyProperty="id">
    //insert into country (id, countryname, countrycode)
    //values (#{id},#{countryname},#{countrycode})
    //</insert>
    private Integer id;
    // @Column 注解支持 name, insertable 和 updateable 三个属性。name 配置映射的列名。insertable 对提供的 insert 方法有效，如果设置 false 就不会出现在 SQL 中。
    //updateable 对提供的 update 方法有效，设置为 false 后不会出现在 SQL 中。
    @Column(name = "countryname")
    //@ColumnType 这个注解提供的 column属性和 @Column 中的 name 作用相同。但是 @Column 的优先级更高。除了 name 属性外，这个注解主要提供了 jdbcType 属性和 typeHandler 属性。
    //jdbcType 用于设置特殊数据库类型时指定数据库中的 jdbcType。typeHandler 用于设置特殊类型处理器，常见的是枚举。
    @ColumnType(
            column = "countryname",
            jdbcType = JdbcType.VARCHAR,
            typeHandler = StringTypeHandler.class)
    private String  countryname;
    private String  countrycode;
    @Transient
    private String otherThings; //非数据库表中字段
}
