package pe.com.wrm.spring.hibernate;

import pe.com.wrm.spring.hibernate.dao.DepartamentoDao;
import pe.com.wrm.spring.hibernate.domain.Departamento;

public class DepartamentoDaoTest extends AbstractUnitTest {

	private DepartamentoDao departamentoDao;

	public DepartamentoDao getDepartamentoDao() {
		return departamentoDao;
	}

	public void setDepartamentoDao(DepartamentoDao departamentoDao) {
		this.departamentoDao = departamentoDao;
	}

	public void testSaveDepartamento() {

		Departamento departamento = new Departamento();
		departamento.setId(1);
		departamento.setDescripcion("Ventas");
		departamento.setEstado("A");
		departamentoDao.save(departamento);
		/*Hub hub = new Hub();
		 hub.setId(new Long(1));
		 ForwardCurve fc = new ForwardCurve();
		 fc.setDateRequested(new Date());
		 fc.setHub(hub);
		 fc.setDateCreated(new Date());
		 fc.setDateLastUpdated(new Date());
		
		 forwardCurveService.saveForwardCurve(fc);*/
		assertTrue(true);
	}

}
