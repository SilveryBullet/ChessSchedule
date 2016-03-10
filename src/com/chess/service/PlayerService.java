package com.chess.service;

import java.util.List;

import com.chess.entity.Player;

public interface PlayerService {

	public void save(Player entity);

	public void update(Player entity);

	public List<Player> findAll();

	public Player findById(Long id);

	public void delete(Player entity);

}
