package com.chess.dao;

import com.chess.base.BaseDao;
import com.chess.entity.Admin;

public interface AdminDao extends BaseDao<Admin> {

	public Admin findByLoginNameAndPassword(String loginName, String password);

}
