package dao;

import java.io.Serializable;

import entity.SysEmployee;

public interface SysEmployeeDao {
	public SysEmployee findById(Serializable sn);
}
