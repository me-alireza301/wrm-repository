package pe.com.wrm.spring.hibernate.dao.common;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class GenericDaoHibernate extends HibernateDaoSupport implements
		GenericDao {

	public <T> void delete(T entity) throws DataAccessException {
		getHibernateTemplate().delete(entity);

	}

	@SuppressWarnings(value = "unchecked")
	public <T> List<T> find(Class<T> entityClass, String queryString,
			Object[] params) throws DataAccessException {
		return (List<T>) getHibernateTemplate().find(queryString, params);

	}

	@SuppressWarnings(value = "unchecked")
	public <T> List<T> find(Class<T> entityClass, String queryString)
			throws DataAccessException {
		return (List<T>) getHibernateTemplate().find(queryString);

	}

	@SuppressWarnings(value = "unchecked")
	public <T> List<T> findByExample(T exampleEntity)
			throws DataAccessException {
		return (List<T>) getHibernateTemplate().findByExample(exampleEntity);

	}

	@SuppressWarnings(value = "unchecked")
	public <T> T findById(Class<T> entityClass, Serializable id)
			throws DataAccessException {
		return (T) getHibernateTemplate().get(entityClass, id);

	}

	public void save(Object entity) throws DataAccessException {
		getHibernateTemplate().saveOrUpdate(entity);
	}

	public Object update(Object entity) throws DataAccessException {
		return getHibernateTemplate().merge(entity);

	}

}
