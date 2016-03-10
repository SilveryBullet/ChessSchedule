package com.chess.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chess.dao.ScoreRuleDao;
import com.chess.entity.ScoreRule;
import com.chess.service.ScoreRuleService;

@Service
@Transactional
public class ScoreRuleServiceImpl implements ScoreRuleService {
	@Resource
	private ScoreRuleDao scoreRuleDao;

	@Override
	public List<ScoreRule> findAll() {
		return scoreRuleDao.findAll();
	}

	@Override
	public void save(ScoreRule entity) {
		scoreRuleDao.save(entity);
	}

	@Override
	public ScoreRule findById(Long id) {
		return scoreRuleDao.findById(id);
	}

	@Override
	public void update(ScoreRule entity) {
		scoreRuleDao.update(entity);
	}
}
