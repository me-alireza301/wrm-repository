package pe.com.spring.ws.example.util.common.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO {

	public void save(Object entity);

	public <T> T update(Object entity);

	public <T> void delete(T entity);

	public <T> T findById(final Class<T> entityClass, final Serializable id);

	public <T> List<T> find(Class<T> entityClass, String queryString);

	public <T> List<T> find(Class<T> entityClass, String queryString, Object[] params);

}

