package com.service;

import com.entity.Department;
import com.entity.PageBean;

/**
 * Created by admin on 2016/12/1.
 */
public interface DepartmentService {
    /**
     * 分页查询
     * @param current 当前页
     * @return
     */
    public PageBean<Department> findByPage(int current);

    /**
     * 保存
     * @param department
     */
    void save(Department department);

    /**
     * 根据id查询
     * @param departmentId
     * @return
     */
    Department getDepartmentById(Integer departmentId);

    /**
     * 更新
     * @param department
     */
    void updateDepartment(Department department);

    /**
     * 删除
     * @param department
     */
    void deleteDepartment(Department department);
}
