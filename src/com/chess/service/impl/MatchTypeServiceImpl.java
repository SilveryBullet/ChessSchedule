package com.chess.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chess.dao.MatchTypeDao;
import com.chess.entity.MatchType;
import com.chess.service.MatchTypeService;

@Service
@Transactional
public class MatchTypeServiceImpl implements MatchTypeService {
	@Resource
	private MatchTypeDao matchTypeDao;

	@Override
	public List<MatchType> findAll() {
		return matchTypeDao.findAll();
	}

	@Override
	public void save(MatchType entity) {
		matchTypeDao.save(entity);
	}

	@Override
	public MatchType findById(Long id) {
		return matchTypeDao.findById(id);
	}

	@Override
	public void update(MatchType entity) {
		matchTypeDao.update(entity);
	}
	
}
