package pe.com.spring.jpa.hibernate.config.test;

import org.springframework.test.jpa.AbstractJpaTests;


public class AbstractJpaUnitTest extends AbstractJpaTests {

	protected String[] getConfigLocations() {
		// setPopulateProtectedVariables(true);
		// setAutowireMode(AUTOWIRE_BY_NAME);
		// setDefaultRollback(false);

		return new String[] { "/pe/com/spring/jpa/hibernate/config/test/AppContext-Test.xml"};
		
	}

	public void testApp() {
		assert (true);
	}
}
