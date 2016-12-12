package com.dao;

import com.entity.Employee;

/**
 * Created by admin on 2016/12/1.
 */
public interface EmployeeDao {

    /**
     * 判断用户是否存在
     * @param employee
     * @return
     */
    public Employee existEmployee(Employee employee);

}
