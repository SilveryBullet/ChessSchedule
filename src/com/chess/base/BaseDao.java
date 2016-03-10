package com.chess.base;

import java.util.List;

public interface BaseDao<T> {
	/**
	 * 保存一个对象到数据库
	 * 
	 * @param entity
	 */
	public void save(T entity);

	/**
	 * 删除一个存在于数据库中的对象
	 * 
	 * @param id
	 */
	public void delete(Long id);

	/**
	 * 更新一个对象的信息到数据库
	 * 
	 * @param entity
	 */
	public void update(T entity);

	/**
	 * 根据id从数据库表中查找一个对象
	 * 
	 * @param id
	 * @return
	 */
	public T findById(Long id);

	/**
	 * 查找一个表中的所有信息
	 * 
	 * @return
	 */
	public List<T> findAll();

	/**
	 * 根据多个id查找信息
	 * 
	 * @param ids
	 * @return
	 */
	
	public List<T> findByIds(Long[] ids);
}
