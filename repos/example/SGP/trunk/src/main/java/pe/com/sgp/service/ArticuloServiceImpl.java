package pe.com.sgp.service;

import java.util.List;

import pe.com.sgp.dao.ArticuloDAO;
import pe.com.sgp.domain.Articulo;
import pe.com.sgp.util.service.common.GenericServiceImpl;

public class ArticuloServiceImpl extends GenericServiceImpl implements ArticuloService{
	
	private ArticuloDAO articuloDao;
	
	public List<Articulo> findArticulo() {
		return articuloDao.findArticulo();
	}

	public Articulo findArticuloById(Long articuloId) {
		Articulo articulo = articuloDao.findArticuloById(articuloId);
		return articulo;
	}

	public void saveArticulo(Articulo articulo) {
		articuloDao.saveArticulo(articulo);
	}

	public ArticuloDAO getArticuloDao() {
		return articuloDao;
	}

	public void setArticuloDao(ArticuloDAO articuloDao) {
		this.articuloDao = articuloDao;
	}

}
