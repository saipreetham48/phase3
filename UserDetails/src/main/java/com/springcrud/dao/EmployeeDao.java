package com.springcrud.dao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import com.springcrud.beans.Employee;

public class EmployeeDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int update(Employee emp) {
		String sql = "update Employee set name=?, designation=?, salary=? where eid=?";
		int ans = template.update(sql, emp.getName(), emp.getDesignation(), emp.getSalary(), emp.getEid());
		return ans;
	}

	public Employee getEmpId(int id) {
		String sql = "select * from Employee where eid=?";
		@SuppressWarnings("deprecation")
		Employee emp = template.queryForObject(sql, new Object[] { id }, new EmployeeMapper());
		return emp;
	}

	public List<Employee> getEmployeesDetails() {
		String sql = "select * from Employee";
		List<Employee> empList = template.query(sql, new EmployeeMapper());
		return empList;
	}
}
