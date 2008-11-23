package pe.com.wrm.spring.hibernate;

import pe.com.wrm.spring.hibernate.commons.BaseDaoTestCase;
import pe.com.wrm.spring.hibernate.dao.DepartamentoDao;
import pe.com.wrm.spring.hibernate.domain.Departamento;

public class DepartamentoTest extends BaseDaoTestCase {

	private DepartamentoDao dao;

	private DepartamentoTest() {
		Departamento departamento = new Departamento();
		departamento.setId(1);
		departamento.setDescripcion("Ventas");
		departamento.setEstado("A");
		dao.save(departamento);
		
		assertNotNull(departamento.getId());
	}

	public DepartamentoDao getDao() {
		return dao;
	}

	public void setDao(DepartamentoDao dao) {
		this.dao = dao;
	}

}
