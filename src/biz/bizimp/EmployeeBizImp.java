package biz.bizimp;

import dao.SysEmployeeDao;
import entity.SysEmployee;
import biz.EmployeeBiz;

public class EmployeeBizImp implements EmployeeBiz {
	private SysEmployeeDao employeeDao;
	@Override
	public SysEmployee checkLogin(SysEmployee employee) {
		SysEmployee result = employeeDao.findById(employee.getSn());
		if(result !=null && result.getPassword().equals(employee.getPassword())){
			return result;
		}
		return null;
	}
	public SysEmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	public void setEmployeeDao(SysEmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
