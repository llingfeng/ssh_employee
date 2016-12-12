package com.action;

import com.entity.Employee;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.EmployeeService;
import org.apache.struts2.ServletActionContext;

/**
 * Created by admin on 2016/12/1.
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
    //模型驱动要使用的类
    private Employee employee = new Employee();
    @Override
    public Employee getModel() {
        return employee;
    }

    private EmployeeService employeeService;

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * 登录
     * @return
     */
    public String login(){
        Employee existEmployee = employeeService.existEmployee(employee);
        if(existEmployee == null){
            ServletActionContext.getRequest().setAttribute("error","用户或密码错误");
            return INPUT;
        }else {
            ActionContext.getContext().getSession().put("existEmployee",existEmployee);
            return SUCCESS;
        }
    }

}
