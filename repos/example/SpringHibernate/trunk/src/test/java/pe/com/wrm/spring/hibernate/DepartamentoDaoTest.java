package pe.com.wrm.spring.hibernate;

import pe.com.wrm.spring.hibernate.dao.DepartamentoDao;
import pe.com.wrm.spring.hibernate.domain.Departamento;

public class DepartamentoDaoTest extends AbstractUnitTest {

	private DepartamentoDao departamentoDao;

	public void setDepartamentoDao(DepartamentoDao departamentoDao) {
		this.departamentoDao = departamentoDao;
	}

	public void testSaveDepartamento() {

		Departamento departamento = new Departamento();
		departamento.setId(1);
		departamento.setDescripcion("Ventas");
		departamento.setEstado("A");
		departamentoDao.save(departamento);
		assertTrue(true);
	}

}
