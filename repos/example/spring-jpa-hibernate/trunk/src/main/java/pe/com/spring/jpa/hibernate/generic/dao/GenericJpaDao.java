package pe.com.spring.jpa.hibernate.generic.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericJpaDao {

	<T> void save(T entity);

	<T> T update(T entity);

	<T> void delete(T entity);

	<T> T findById(final Class<T> entityClass, final Serializable id);

	<T> List<T> find(Class<T> entityClass, String queryString);

	<T> List<T> find(Class<T> entityClass, String queryString, Object[] params);
	
	<T> T findUniqueResult(String queryString);
	
	<T> T findUniqueResult(String queryString, Object params[]);
	
	<T> List<T> findLimitedResult(String queryString, int start, int max);
	
	<T> List<T> findLimitedResult(String queryString, int start, int max, Object params[]);

}

