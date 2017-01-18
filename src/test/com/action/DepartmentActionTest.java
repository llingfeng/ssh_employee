package com.action;

import com.entity.Department;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by admin on 2017/1/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml","classpath:struts.xml"})
public class DepartmentActionTest {
    @Autowired
    private DepartmentAction departmentAction;
    @org.junit.Test
    public void getAllDepartment() throws Exception {
        List<Department> departmentList = departmentAction.getAllDepartment();
        for (Department department : departmentList) {
            System.out.println(department.toString());
        }
    }

}