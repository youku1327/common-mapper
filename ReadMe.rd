-- 数据库类型 mysql jdk 版本 1.8
-- 建表语句

CREATE TABLE `tabple_emp` (
`emp_id` int NOT NULL AUTO_INCREMENT ,
`emp_name` varchar(500) NULL ,
`emp_salary` double(15,5) NULL ,
`emp_age` int NULL ,
PRIMARY KEY (`emp_id`)
);

INSERT INTO `tabple_emp` (`emp_name`, `emp_salary`, `emp_age`) VALUES ('tom', '1254.37', '27');
INSERT INTO `tabple_emp` (`emp_name`, `emp_salary`, `emp_age`) VALUES ('jerry', '6635.42', '38');
INSERT INTO `tabple_emp` (`emp_name`, `emp_salary`, `emp_age`) VALUES ('bob', '5560.11', '40');
INSERT INTO `tabple_emp` (`emp_name`, `emp_salary`, `emp_age`) VALUES ('kate', '2209.11', '22');
INSERT INTO `tabple_emp` (`emp_name`, `emp_salary`, `emp_age`) VALUES ('justin', '4203.15', '30');

CREATE TABLE `country` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `countryname` varchar(255) DEFAULT NULL COMMENT '名称',
  `countrycode` varchar(255) DEFAULT NULL COMMENT '代码',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=10011 DEFAULT CHARSET=utf8 COMMENT='国家信息';

--mbg 详细

https://blog.csdn.net/isea533/article/details/42102297

-- mbg生成命令

mvn mybatis-generator:generate
