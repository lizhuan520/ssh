package dao.daoimp;

import java.io.Serializable;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.SysEmployeeDao;
import entity.SysEmployee;

public class SysEmployeeImp extends HibernateDaoSupport implements
		SysEmployeeDao {

	@Override
	public SysEmployee findById(Serializable sn) {
		return this.getHibernateTemplate().get(SysEmployee.class, sn);
	}

}
