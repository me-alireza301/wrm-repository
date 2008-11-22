package pe.com.wrm.spring.hibernate.dao.common;

import java.io.Serializable;
import java.util.List;

//import org.hibernate.ScrollableResults;

public interface GenericDao {

	/**
	 * Find an instance that matches the given ID in the persistent store
	 * 
	 * @param entityClass
	 * @param id
	 */
	public <T> T findById(final Class<T> entityClass, final Serializable id);
	
	/**
	 * Either <tt>save()</tt> or <tt>update()</tt> the given instance,
	 * depending upon the value of its identifier property
	 * 
	 * @param entityClass
	 * @param id
	 */
	public void save(Object entity);
	
	/**
	 * Update an existing entity already loaded. Use Merge functionality in
	 * Hibernate.
	 * 
	 * @param entity
	 * @return
	 */
	public Object update(Object entity);
	/**
	 * Remove a persistent instance from the datastore
	 * 
	 * @param <T>
	 * @param entity
	 */
	public <T> void delete(T entity);
	
	/**
	 * Find instances of 'entityClass' that match the criteria given by
	 * 'queryString' and the dynamic parameters 'params'
	 * 
	 * @param <T>
	 * @param entityClass
	 * @param queryString
	 * @param params
	 * @return
	 */
	public <T> List<T> find(Class<T> entityClass, String queryString, Object[] params);

	/**
	 * Find instances of 'entityClass' that match the criteria given by
	 * 'queryString'
	 * 
	 * @param <T>
	 * @param entityClass
	 * @param queryString
	 * @return
	 */
	public <T> List<T> find(Class<T> entityClass, String queryString);

	/**
	 * Find instance(s) that match the given example entity's attributes
	 * 
	 * @param exampleEntity
	 * @return
	 */
	public <T> List<T> findByExample(T exampleEntity);
	
	/**
	 * Find max-n instances that match the criteria given by 'queryString',
	 * begining from start result
	 * 
	 * @param queryString
	 * @param start
	 * @param max
	 * @return
	 */
	/*public <T> List<T> findLimitedResult(String queryString, int start, int max);
	
	public <T> List<T> findLimitedResult(String queryString, int start, int max, Object params[]);
	
	public <T> List<T> findSQLData(String queryString, Class<T> entityClass);

	*//**
	 * Find a unique result that match the criteria given by 'queryString'
	 * 
	 * @param queryString
	 *//*
	public <T> T findUniqueResult(String queryString);
	
	public <T> T findUniqueResult(String queryString, Object params[]);
	
	public void initializeProxy(Object proxy, String methodTarget);
	
	public void initializeProxy(Object proxy, String methodTarget, Object params[]);

	public void clear();

	public void evict(Object object);

	public ScrollableResults getCursor(String queryString, Object[] params);
	
	public void closeCursor(ScrollableResults nameCursor);*/

	
}
