package com.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by admin on 2016/12/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml","classpath:struts.xml"})
public class DepartmentDaoTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    DepartmentDao departmentDao;

    @Test
    public void findTotalNum() throws Exception {
        departmentDao.findTotalNum();
    }

}