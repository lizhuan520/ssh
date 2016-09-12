package dao.daoimp;

import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ClaicmVoucherDao;
import entity.BizClaimVoucher;

public class ClaicmVoucherDaoImp extends HibernateDaoSupport implements
		ClaicmVoucherDao {

	@Override
	public void save(BizClaimVoucher claimVoucher) {
		this.getHibernateTemplate().save(claimVoucher);
		
	}
}
