package pe.com.sgp.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.sgp.domain.Articulo;
import pe.com.sgp.util.dao.common.GenericDao;

public interface ArticuloDAO extends GenericDao{
	
	public Articulo findArticuloById(final Serializable id);
	
	public List<Articulo> findArticulo();
	
	public void saveArticulo(Articulo articulo);
	
}
