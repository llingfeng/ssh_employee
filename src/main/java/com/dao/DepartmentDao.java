package com.dao;

import com.entity.Department;
import com.entity.PageBean;

import java.util.List;

/**
 * Created by admin on 2016/12/1.
 */
public interface DepartmentDao {

    /**
     * 分页查询
     * @param beginNum
     * @param pageSize
     * @return
     */
    public List<Department> findByPage(int beginNum, int pageSize);

    /**
     * 查询总记录数
     * @return
     */
    public int findTotalNum();

    /**
     * 保存
     * @param department
     */
    void save(Department department);

    Department getDepartmentById(Integer departmentId);

    void updateDepartment(Department department);

    void delete(Department department);
}
