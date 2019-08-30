package com.kingboya.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @Author lsc
 * @Description
 * @Date 2019/8/21 10:33
 * @Param
 * @return
 **/
@Table(name="tabple_emp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empId;//emp_id
	
	private String empName;//emp_name
	
	//@Column(name="emp_salary_apple")
	private Double empSalary;//emp_salary_apple
	
	private Integer empAge;//emp_age

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAge=" + empAge
				+ "]";
	}


}
