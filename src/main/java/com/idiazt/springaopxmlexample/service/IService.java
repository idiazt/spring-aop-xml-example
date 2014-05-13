package com.idiazt.springaopxmlexample.service;

import java.util.Collection;

import com.idiazt.springaopxmlexample.entities.BaseEntity;

public interface IService<E extends BaseEntity> {
	public E persist(E entity) throws Exception;

	public Collection<E> list();

	public E findById(Long id);

	public boolean delete(Long id);
}
