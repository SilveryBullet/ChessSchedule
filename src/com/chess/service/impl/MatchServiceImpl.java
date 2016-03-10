package com.chess.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chess.dao.MatchDao;
import com.chess.entity.Match;
import com.chess.service.MatchService;

@Service
@Transactional
public class MatchServiceImpl implements MatchService {
	@Resource
	private MatchDao matchDao;

	@Override
	public void save(Match entity) {
		matchDao.save(entity);
	}
}
