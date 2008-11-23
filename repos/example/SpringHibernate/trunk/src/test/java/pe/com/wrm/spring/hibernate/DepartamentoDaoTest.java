package pe.com.wrm.spring.hibernate;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import pe.com.wrm.spring.hibernate.dao.DepartamentoDao;
import pe.com.wrm.spring.hibernate.domain.Departamento;

public class DepartamentoDaoTest extends
		AbstractTransactionalDataSourceSpringContextTests {

	private DepartamentoDao dao;
	
    protected String[] getConfigLocations() {
        return new String[] { "classpath:applicationContext.xml"};
    }
	
		
	public void testSave() {
		dao = (DepartamentoDao) applicationContext.getBean("departamentoDao");
		
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