package com.entity;

import java.util.Date;

/**
 * Created by admin on 2016/11/30.
 */
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private String employeeSex;
    private Date birthday;
    private Date joinDate;
    private String employeeNo;
    //用户名和登录秘密
    private String username;
    private String password;
    //所属部门
    private Department department;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSex='" + employeeSex + '\'' +
                ", birthday=" + birthday +
                ", joinDate=" + joinDate +
                ", employeeNo='" + employeeNo + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", department=" + department +
                '}';
    }
}
