package com.chess.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chess.dao.SeriesDao;
import com.chess.entity.Series;
import com.chess.service.SeriesService;

@Service
@Transactional
public class SeriesServiceImpl implements SeriesService {
	@Resource
	private SeriesDao seriesDao;

	@Override
	public void save(Series entity) {
		seriesDao.save(entity);
	}
}
