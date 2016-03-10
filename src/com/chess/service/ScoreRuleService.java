package com.chess.service;

import java.util.List;

import com.chess.entity.ScoreRule;

public interface ScoreRuleService {

	public List<ScoreRule> findAll();

	public void save(ScoreRule entity);

	public ScoreRule findById(Long id);

	public void update(ScoreRule entity);

}
