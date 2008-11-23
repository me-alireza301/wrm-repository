package pe.com.wrm.spring.hibernate;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import pe.com.wrm.spring.hibernate.dao.DepartamentoDao;
import pe.com.wrm.spring.hibernate.domain.Departamento;

public class DepartamentoDaoTest extends
		AbstractTransactionalDataSourceSpringContextTests {

	private DepartamentoDao departamentoDao;

	@Override
	protected String[] getConfigLocations() {
		// return new String[] { "classpath:applicationContext.xml"};
		return new String[] { "applicationContext.xml" };
	}

	
	public void testSave() {
		
		this.departamentoDao = (DepartamentoDao) applicationContext.getBean("departamentoDao");
		
		Departamento departamento = new Departamento();
		departamento.setId(1);
		departamento.setDescripcion("Ventas");
		departamento.setEstado("A");
		departamentoDao.save(departamento);
		assertNotNull(departamento.getId());

	}

	public DepartamentoDao getDao() {
		return departamentoDao;
	}

	public void setDao(DepartamentoDao dao) {
		this.departamentoDao = dao;
	}
}