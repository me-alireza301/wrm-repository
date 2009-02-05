package pe.com.sgp.service;

import java.util.List;
import pe.com.sgp.domain.Articulo;
import pe.com.sgp.util.service.common.GenericService;

public interface ArticuloService extends GenericService{

	public Articulo findArticuloById(Long articuloId);
	
	public List<Articulo> findArticulo();
	
	public void saveArticulo(Articulo articulo);
}
