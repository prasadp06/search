package com.smartsearch.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smartsearch.dao.hibernate.data.*;
import com.smartsearch.dao.hibernate.repositories.SearchRepository;

@Repository
public class SearchServiceDaoImpl implements SearchRepository {

	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Transactional
	public List<SearchDao> findAll() {
		
		return this.sessionFactory.openSession().createCriteria(SearchDao.class).list();
	}

	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public void deleteInBatch(Iterable<SearchDao> arg0) {
		// TODO Auto-generated method stub
		
	}

	public List<SearchDao> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public <S extends SearchDao> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public SearchDao saveAndFlush(SearchDao arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<SearchDao> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	public void delete(SearchDao arg0) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends SearchDao> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<SearchDao> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public SearchDao findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends SearchDao> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
