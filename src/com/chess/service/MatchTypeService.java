package com.chess.service;

import java.util.List;

import com.chess.entity.MatchType;

public interface MatchTypeService {

	public List<MatchType> findAll();

	public void save(MatchType entity);

	public MatchType findById(Long id);

	public void update(MatchType entity);

}
