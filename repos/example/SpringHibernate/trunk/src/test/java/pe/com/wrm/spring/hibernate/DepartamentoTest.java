package pe.com.wrm.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.com.wrm.spring.hibernate.commons.BaseDaoTestCase;
import pe.com.wrm.spring.hibernate.dao.DepartamentoDao;
import pe.com.wrm.spring.hibernate.domain.Departamento;

public class DepartamentoTest extends BaseDaoTestCase {
	private ApplicationContext ctx = null;
	private DepartamentoDao dao;

	public void initialize() throws Exception {
		super.setUp();
		String[] paths = super.getConfigLocations();
		ctx = new ClassPathXmlApplicationContext(paths);
		dao = (DepartamentoDao) ctx.getBean("departamentoDao");
	}

	public void cleanup() throws Exception {
		super.tearDown();
	}

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
