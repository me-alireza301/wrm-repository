package pe.com.spring.ws.example.configTest;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends
		AbstractTransactionalDataSourceSpringContextTests {

	protected String[] getConfigLocations() {
		//setPopulateProtectedVariables(true);
		//setAutowireMode(AUTOWIRE_BY_NAME);
		//setDefaultRollback(false);

		return new String[] {
				"/pe/com/spring/ws/example/config/AppContext-config-database.xml",
				"/pe/com/spring/ws/example/config/AppContext-dao.xml",
				"/pe/com/spring/ws/example/config/AppContext-service.xml" };
	}

	public void testApp() {
		assert (true);
	}
}
