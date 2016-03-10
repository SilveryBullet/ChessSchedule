package com.chess.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chess.dao.AdminDao;
import com.chess.entity.Admin;
import com.chess.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	@Resource
	private AdminDao adminDao;

	@Override
	public Admin findByLoginNameAndPassword(String loginName, String password) {
		return adminDao.findByLoginNameAndPassword(loginName,password);
	}
	
}
