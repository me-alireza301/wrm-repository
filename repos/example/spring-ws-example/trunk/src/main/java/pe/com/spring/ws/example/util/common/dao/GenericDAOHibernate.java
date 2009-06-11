package pe.com.spring.ws.example.util.common.dao;

import java.io.Serializable;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class GenericDAOHibernate extends HibernateDaoSupport implements
		GenericDAO {

	public void save(Object entity) throws DataAccessException {
		getHibernateTemplate().saveOrUpdate(entity);
	}

	@SuppressWarnings("unchecked")
	public <T> T update(Object entity) throws DataAccessException {
		return (T) getHibernateTemplate().merge(entity);
	}

	public <T> void delete(T entity) throws DataAccessException {
		getHibernateTemplate().delete(entity);
	}

	@SuppressWarnings(value = "unchecked")
	public <T> T findById(Class<T> entityClass, Serializable id) throws DataAccessException {
		return (T) getHibernateTemplate().get(entityClass, id);
	}

	@SuppressWarnings(value = "unchecked")
	public <T> List<T> find(Class<T> entityClass, String queryString) throws DataAccessException {
		return (List<T>) getHibernateTemplate().find(queryString);
	}

	@SuppressWarnings(value = "unchecked")
	public <T> List<T> find(Class<T> entityClass, String queryString, Object[] params) {
		return (List<T>) getHibernateTemplate().find(queryString, params);
	}





}
