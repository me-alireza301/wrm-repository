package pe.com.sgp.service;

import java.util.List;

import pe.com.sgp.AbstractUnitTest;
import pe.com.sgp.domain.Articulo;

public class ArticuloServiceTest extends AbstractUnitTest {

	protected ArticuloService articuloService;

	public void setArticuloService(ArticuloService articuloService) {
		this.articuloService = articuloService;
	}
	
	public void testFindArticuloById(){
		Articulo articulo = this.articuloService.findArticuloById(new Long(1));
		assertNotNull(articulo);
	}
	
	public void testFindArticulo(){
		List<Articulo> list = this.articuloService.findArticulo();
		/*for (Articulo l : list ) {
			System.out.println("Articulo : "+ l.getDescripcion() );
		}*/
		assertTrue(list != null && list.size() > 0);
	}
	
	
	public void testSaveArticulo(){
		Articulo articulo = new Articulo();
		articulo.setDescripcion("USB 8 GB");
		articulo.setPrecio(98);
		this.articuloService.saveArticulo(articulo);
		assertNotNull(articulo.getArticuloId());
	}
	
	
}
