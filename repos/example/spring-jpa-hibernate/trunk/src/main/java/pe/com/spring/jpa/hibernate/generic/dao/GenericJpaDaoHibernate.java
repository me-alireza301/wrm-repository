package pe.com.spring.jpa.hibernate.generic.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.jpa.support.JpaDaoSupport;

public class GenericJpaDaoHibernate extends JpaDaoSupport implements GenericJpaDao {

	public final <T> void save(T entity) throws DataAccessException {
		super.getJpaTemplate().persist(entity);
	}

	public final <T> T update(T entity) throws DataAccessException {
		return (T) super.getJpaTemplate().merge(entity);
	}

	public final <T> void delete(T entity) throws DataAccessException {
		super.getJpaTemplate().remove(entity);
	}

	public final <T> T findById(Class<T> entityClass, Serializable id) throws DataAccessException {
		return (T) super.getJpaTemplate().find(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	public final <T> List<T> find(Class<T> entityClass, String queryString) throws DataAccessException {
		return (List<T>) super.getJpaTemplate().find(queryString);
	}

	@SuppressWarnings(value = "unchecked")
	public final <T> List<T> find(Class<T> entityClass, String queryString, Object[] params) {
		return (List<T>) super.getJpaTemplate().find(queryString, params);
	}
	
	@SuppressWarnings(value = "unchecked")
	public final <T> T findUniqueResult(String queryString) {		
		return (T)findUniqueResult(queryString, null);
	}

	@SuppressWarnings(value = "unchecked")
	public final <T> T findUniqueResult(String queryString, Object[] params) {
		Query query = super.getJpaTemplate().getEntityManagerFactory().createEntityManager().createQuery(queryString);
		applyParamsToQuery(query, params);
		query.setFirstResult(0);
		query.setMaxResults(1);
		return (T)query.getSingleResult();
	}
	
	public final <T> List<T> findLimitedResult(String queryString, int start, int max) {
		return findLimitedResult(queryString, start, max, null);
	}
	
	@SuppressWarnings(value = "unchecked")
	public final <T> List<T> findLimitedResult(String queryString, int start, int max, Object[] params) {
		Query query = super.getJpaTemplate().getEntityManagerFactory().createEntityManager().createQuery(queryString);
		applyParamsToQuery(query, params);
		query.setFirstResult(start);
		query.setMaxResults(max);
		return (List<T>)query.getResultList();
	}

	private void applyParamsToQuery(Query query, Object params[]) {
		int i, n;
		if (params==null) return;
		if (params.length<=0) return;
		n = params.length;
		for(i=0;i<n;i++)
			query.setParameter(i, params[i]);
	}
}
