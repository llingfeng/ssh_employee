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

    /**
     * 根据部门id查询
     * @param departmentId
     * @return
     */
    Department getDepartmentById(Integer departmentId);

    /**
     * 更新部门
     * @param department
     */
    void updateDepartment(Department department);

    /**
     * 删除部门
     * @param department
     */
    void delete(Department department);

    /**
     * 查询所有部门
     * @return
     */
    List<Department> queryAllDepartment();
}
