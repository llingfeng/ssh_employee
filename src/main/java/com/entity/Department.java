package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 2016/11/30.
 */
public class Department {
    private Integer departmentId;
    private String departmentName;
    private String departmentDesc;
    //部门内员工
    private Set<Employee> employees = new HashSet<>();

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public void setDepartmentDesc(String departmentDesc) {
        this.departmentDesc = departmentDesc;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentDesc='" + departmentDesc + '\'' +
                '}';
    }
}
