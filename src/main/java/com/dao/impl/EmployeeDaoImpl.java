package com.dao.impl;

import com.dao.EmployeeDao;
import com.entity.Employee;
import org.hibernate.SQLQuery;

import java.util.List;

/**
 * Created by admin on 2016/12/1.
 */
public class EmployeeDaoImpl extends BaseDao implements EmployeeDao {
    @Override
    public Employee existEmployee(Employee employee) {
        SQLQuery query = getSession().createSQLQuery("select * from employee where username = :username and password = :password");
        query.setString("username",employee.getUsername());
        query.setString("password",employee.getPassword());
        List<Employee> employeeList = query.addEntity(Employee.class).list();
        if(employeeList != null && employeeList.size()>0){
            return employeeList.get(0);
        }
        return null;
    }

    public void test(){
        System.out.println("sss");
    }
}
