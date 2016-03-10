package com.chess.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;

public class BaseDaoImpl<T> implements BaseDao<T> {
	@Resource
	protected SessionFactory sessionFactory;
	
	protected static Session session = null;
	
	private Class<T> clazz;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
		
		/*if(session == null){
			session = sessionFactory.openSession();
		}
		else{
		}
		
		return session;*/
	}

	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		ParameterizedType pt = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}

	/**
	 * 保存一个实体
	 */
	public void save(T entity) {
		getSession().save(entity);
		
		/*Session session = sessionFactory.openSession();
		
		session.save(entity);
		
		session.close();*/
	}

	/**
	 * 删除一个实体
	 */
	public void delete(Long id) {
		T obj = findById(id);
		getSession().delete(obj);
		
		/*Session session = sessionFactory.openSession();
		
		T obj = findById(id);
		session.delete(obj);	
		
		session.close();*/
		
	}

	/**
	 * 更新一个实体
	 */
	public void update(T entity) {
		getSession().update(entity);
		
		/*Session session = sessionFactory.openSession();
		
		session.update(entity);	
		
		session.close();*/
	}

	/**
	 * 通过id查找一个实体
	 */
	@SuppressWarnings("unchecked")
	public T findById(Long id) {
		return (T) getSession().get(clazz, id);
		
		/*Session session = sessionFactory.openSession();
		
		T t = (T) session.get(clazz, id);
		
		session.close();

		
		return t;*/
	}

	/**
	 * 查找全部实体
	 */
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return getSession().createQuery("FROM " + clazz.getSimpleName()).list();
		/*Session session = sessionFactory.openSession();
		
		List<T> t = (List<T>) session.createQuery
				("FROM " + clazz.getSimpleName())
				.list();
		
		session.close();
		
		return t;*/
	}

	/**
	 * 通过多个id查找多个实体
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByIds(Long[] ids) {
		return (List<T>) getSession().createQuery(
				"FROM " + clazz.getSimpleName() + " WHERE id IN (:ids)")
				.setParameterList("ids", ids).list();
		
		/*Session session = sessionFactory.openSession();
		
		List<T> t = (List<T>) session.createQuery(
				"FROM " + clazz.getSimpleName() + " WHERE id IN (:ids)")
				.setParameterList("ids", ids).list();
		
		session.close();
		
		return t;*/
	}
}
