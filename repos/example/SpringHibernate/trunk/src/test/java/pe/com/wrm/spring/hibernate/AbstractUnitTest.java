package pe.com.wrm.spring.hibernate;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends
		AbstractTransactionalDataSourceSpringContextTests {

	@Override
	protected String[] getConfigLocations() {
		return new String[] { "applicationContext.xml"};
	}

	public void testApp() {
		assertTrue(true);
	}

}
