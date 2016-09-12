package action;

import biz.EmployeeBiz;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.SysEmployee;
import entity.SysPosition;

public class EmployeeAction extends ActionSupport {
	private SysEmployee employee;
    private EmployeeBiz employeeBiz;
    private SysPosition sysPosition;
    public String login(){
    	SysEmployee result = employeeBiz.checkLogin(employee);
		if(result !=null){
			ActionContext.getContext().getSession().put("employee", result);
		//	ActionContext.getContext().getSession().put("sysDepartment",result.getSysPosition().getNameCn());
			
			return SUCCESS;
		}
		return INPUT;
	}

	public SysPosition getSysPosition() {
		return sysPosition;
	}

	public void setSysPosition(SysPosition sysPosition) {
		this.sysPosition = sysPosition;
	}

	public SysEmployee getEmployee() {
		return employee;
	}

	public void setEmployee(SysEmployee employee) {
		this.employee = employee;
	}

	public EmployeeBiz getEmployeeBiz() {
		return employeeBiz;
	}

	public void setEmployeeBiz(EmployeeBiz employeeBiz) {
		this.employeeBiz = employeeBiz;
	}
    
	
	
}
