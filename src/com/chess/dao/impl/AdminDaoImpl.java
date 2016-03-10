package com.chess.dao.impl;

import org.springframework.stereotype.Repository;

import com.chess.base.BaseDaoImpl;
import com.chess.entity.Admin;
import com.chess.entity.RoundCount;
import com.chess.dao.AdminDao;

@Repository
public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao {

	@Override
	public Admin findByLoginNameAndPassword(String loginName, String password) {
		return (Admin)getSession().createQuery(
				"FROM Admin WHERE loginName='" + loginName + 
				"' AND password='" + password + "'").uniqueResult();
	}
	
}
