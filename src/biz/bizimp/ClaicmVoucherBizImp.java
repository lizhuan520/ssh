package biz.bizimp;

import dao.ClaicmVoucherDao;
import entity.BizClaimVoucher;
import biz.ClaicmVoucherBiz;

public class ClaicmVoucherBizImp implements ClaicmVoucherBiz {
	public ClaicmVoucherDao claicmVoucherDao ;
	public void setClaicmVoucherDao(ClaicmVoucherDao claicmVoucherDao) {
		this.claicmVoucherDao = claicmVoucherDao;
	}
	@Override
	public void addNewClaimVoucher(BizClaimVoucher claimVoucher) {
		// TODO Auto-generated method stub
		claicmVoucherDao.save(claimVoucher);	
	}

}
