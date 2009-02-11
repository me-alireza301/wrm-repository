package pe.com.sgp.dao;

import java.util.List;

import pe.com.sgp.AbstractUnitTest;
import pe.com.sgp.domain.Articulo;

public class ArticuloDAOTest extends AbstractUnitTest{
	
	protected ArticuloDAO articuloDAO;

	public void setArticuloDAO(ArticuloDAO articuloDAO) {
		this.articuloDAO = articuloDAO;
	}

	public void testFindArticuloById(){
		System.out.println("testFindArticuloById" );
		Articulo articulo = this.articuloDAO.findArticuloById(new Long(1));
		assertNotNull(articulo);
	}
	
	public void testFindArticulo(){
		List<Articulo> list = articuloDAO.findArticulo();
		for (Articulo l : list ) {
			System.out.println("Articulo : "+ l.getDescripcion() );
		}
		assertTrue(list != null && list.size() > 0);
	}
	
	public void testSaveArticulo(){
		Articulo articulo = new Articulo();
		articulo.setDescripcion("USB 8 GB");
		articulo.setPrecio(98);
		articuloDAO.saveArticulo(articulo);
		assertNotNull(articulo.getArticuloId());
	}

}
