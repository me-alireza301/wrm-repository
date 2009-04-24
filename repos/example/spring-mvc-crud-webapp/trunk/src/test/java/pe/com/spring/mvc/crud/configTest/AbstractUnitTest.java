package pe.com.spring.mvc.crud.configTest;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends
		AbstractTransactionalDataSourceSpringContextTests {

	protected String[] getConfigLocations() {
		//setPopulateProtectedVariables(true);
		//setAutowireMode(AUTOWIRE_BY_NAME);
		//setDefaultRollback(false);

		return new String[] {
				"/pe/com/spring/mvc/crud/config/ApplicationContext-config-database.xml",
				"/pe/com/spring/mvc/crud/config/ApplicationContext-dao.xml",
				"/pe/com/spring/mvc/crud/config/ApplicationContext-service.xml" };
	}

	public void testApp() {
		assert (true);
	}
}
