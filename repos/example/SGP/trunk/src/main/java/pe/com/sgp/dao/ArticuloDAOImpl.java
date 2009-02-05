package pe.com.sgp.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.sgp.domain.Articulo;
import pe.com.sgp.util.constants.Constants;
import pe.com.sgp.util.dao.common.GenericDaoHibernate;

public class ArticuloDAOImpl extends GenericDaoHibernate implements ArticuloDAO{

	public Articulo findArticuloById(Serializable id) {
		return (id == null ? null : findById(Articulo.class, id));
	}
	
	public List<Articulo> findArticulo() {
		List<Articulo> list = find(Articulo.class, "from Articulo");
		return list;
	}

	public void saveArticulo(Articulo articulo) {
		if (articulo == null) {
			throw new RuntimeException(Constants.ERROR_ARTICULO_ID_INVALID);
		}
		super.save(articulo);
	}

}
