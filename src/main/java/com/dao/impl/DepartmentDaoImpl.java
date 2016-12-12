package com.dao.impl;

import com.dao.DepartmentDao;
import com.entity.Department;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2016/12/1.
 */
public class DepartmentDaoImpl extends BaseDao implements DepartmentDao {

    @Override
    public List<Department> findByPage(int beginNum, int pageSize) {
        Query query = getSession().createQuery("From Department");
        query.setFirstResult(beginNum);
        query.setMaxResults(pageSize);
        return query.list();
    }

    @Transactional
    @Override
    public int findTotalNum() {
        String sql = "select count(*) from department";
        SQLQuery query = getSession().createSQLQuery(sql);
        List list = query.list();
        if (list != null && list.size() > 0) {
            return Integer.parseInt(list.get(0).toString());
        }
        return 0;
    }

    @Override
    public void save(Department department) {
        getSession().save(department);
    }

    @Override
    public Department getDepartmentById(Integer departmentId) {
        return (Department) getSession().get(Department.class, departmentId);
    }

    @Override
    public void updateDepartment(Department department) {
        getSession().update(department);
    }

    @Override
    public void delete(Department department) {
        getSession().delete(department);
    }
}
