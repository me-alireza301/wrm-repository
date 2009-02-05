package pe.com.sgp.service;

import java.util.List;

import pe.com.sgp.dao.ArticuloDAO;
import pe.com.sgp.domain.Articulo;
import pe.com.sgp.util.service.common.GenericServiceImpl;

public class ArticuloServiceImpl extends GenericServiceImpl implements ArticuloService{
	
	private ArticuloDAO articuloDAO;
	
	public void setArticuloDao(ArticuloDAO articuloDAO) {
		this.articuloDAO = articuloDAO;
	}

	public List<Articulo> findArticulo() {
		return articuloDAO.findArticulo();
	}

	public Articulo findArticuloById(Long articuloId) {
		Articulo articulo = articuloDAO.findArticuloById(articuloId);
		return articulo;
	}

	public void saveArticulo(Articulo articulo) {
		articuloDAO.saveArticulo(articulo);
	}


}
