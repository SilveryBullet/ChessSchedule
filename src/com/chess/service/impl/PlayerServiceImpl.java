package com.chess.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chess.dao.PlayerDao;
import com.chess.entity.Player;
import com.chess.service.PlayerService;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {
	@Resource
	private PlayerDao playerDao;

	@Override
	public void save(Player entity) {
		playerDao.save(entity);
	}

	@Override
	public void update(Player entity) {
		playerDao.update(entity);
	}

	@Override
	public List<Player> findAll() {
		return playerDao.findAll();
	}

	@Override
	public Player findById(Long id) {
		return playerDao.findById(id);
	}

	@Override
	public void delete(Player model) {
		playerDao.delete(model.getId());
	}
	
}
