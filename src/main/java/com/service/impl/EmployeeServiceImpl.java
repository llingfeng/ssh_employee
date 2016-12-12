package com.service.impl;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.service.EmployeeService;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2016/12/1.
 */
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }


    @Override
    public Employee existEmployee(Employee employee) {
        return employeeDao.existEmployee(employee);
    }
}
