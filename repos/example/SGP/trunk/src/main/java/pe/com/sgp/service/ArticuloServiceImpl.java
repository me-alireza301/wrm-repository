package pe.com.sgp.service;

import java.util.List;

import pe.com.sgp.dao.ArticuloDAO;
import pe.com.sgp.domain.Articulo;
import pe.com.sgp.util.service.common.GenericServiceImpl;

public class ArticuloServiceImpl extends GenericServiceImpl implements ArticuloService{
	
	private ArticuloDAO articuloDAO;
	
	public Articulo findArticuloById(Long articuloId) {
		return articuloDAO.findArticuloById(articuloId);
	}

	public List<Articulo> findArticulo() {
		return articuloDAO.findArticulo();
	}
	
	public void saveArticulo(Articulo articulo) {
		articuloDAO.saveArticulo(articulo);
	}

	public ArticuloDAO getArticuloDAO() {
		return articuloDAO;
	}

	public void setArticuloDAO(ArticuloDAO articuloDAO) {
		this.articuloDAO = articuloDAO;
	}


}
