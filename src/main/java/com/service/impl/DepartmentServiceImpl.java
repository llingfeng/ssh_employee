package com.service.impl;

import com.dao.DepartmentDao;
import com.entity.Department;
import com.entity.PageBean;
import com.service.DepartmentService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2016/12/1.
 */
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDao departmentDao;

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public PageBean<Department> findByPage(int current) {
        PageBean<Department> pageBean = new PageBean<Department>();
        //当前页
        pageBean.setCurrentPage(current);
        int pageSize = 3;
        //每页显示数据条数
        pageBean.setPageSize(pageSize);
        int totalSize = departmentDao.findTotalNum();
        pageBean.setTotalSize(totalSize);
        double tn = totalSize;
        Double totalPage = Math.ceil(tn/pageSize);
        //总页数
        pageBean.setTotalPage(totalPage.intValue());
        int beginNum = pageSize*(current-1);
        List<Department> departmentList = departmentDao.findByPage(beginNum,pageSize);
        pageBean.setList(departmentList);
        return pageBean;
    }

    @Override
    public void save(Department department) {
        departmentDao.save(department);
    }

    @Override
    public Department getDepartmentById(Integer departmentId) {
        return departmentDao.getDepartmentById(departmentId);
    }

    @Override
    public void updateDepartment(Department department) {
        departmentDao.updateDepartment(department);
    }

    @Override
    public void deleteDepartment(Department department) {
        departmentDao.delete(department);
    }
}
