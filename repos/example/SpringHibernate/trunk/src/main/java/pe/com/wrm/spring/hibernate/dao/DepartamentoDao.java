package pe.com.wrm.spring.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.wrm.spring.hibernate.dao.common.GenericDao;

public interface DepartamentoDao extends GenericDao {

	public <T> T findById(final Class<T> entityClass, final Serializable id);
	
	public void save(Object entity);
	
	public Object update(Object entity);

	public <T> void delete(T entity);
	
	public <T> List<T> find(Class<T> entityClass, String queryString, Object[] params);

	public <T> List<T> find(Class<T> entityClass, String queryString);

	public <T> List<T> findByExample(T exampleEntity);

}
