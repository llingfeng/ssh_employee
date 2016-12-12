package com.action;

import com.dao.DepartmentDao;
import com.dao.EmployeeDao;
import com.dao.impl.EmployeeDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2016/12/9.
 */
public class Test {

    public static void main(String args[]){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DepartmentDao departmentDao = (DepartmentDao) applicationContext.getBean("departmentDao");
        System.out.println(departmentDao.findTotalNum());
    }
}
