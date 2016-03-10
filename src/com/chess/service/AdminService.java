package com.chess.service;

import com.chess.entity.Admin;

public interface AdminService {

	public Admin findByLoginNameAndPassword(String loginName, String password);

}
