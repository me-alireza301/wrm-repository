package pe.com.wrm.spring.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;

import pe.com.wrm.spring.hibernate.dao.DepartamentoDao;
import pe.com.wrm.spring.hibernate.dao.common.GenericDaoHibernate;

public class DepartamentoDaoImpl extends GenericDaoHibernate implements DepartamentoDao {

	public <T> void delete(T entity) {
		
	}

	public <T> T findById(Class<T> entityClass, Serializable id) {
		return null;
	}

	public void save(Object entity) {
		super.save(entity);
		
	}

	public Object update(Object entity) {
		return null;
	}

	public <T> List<T> find(Class<T> entityClass, String queryString,
			Object[] params) {
		return null;
	}

	public <T> List<T> find(Class<T> entityClass, String queryString) {
		return null;
	}

	public <T> List<T> findByExample(T exampleEntity) {
		return null;
	}

}
