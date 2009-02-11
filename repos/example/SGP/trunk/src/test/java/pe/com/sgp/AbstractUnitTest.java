package pe.com.sgp;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends AbstractTransactionalDataSourceSpringContextTests {

	protected String[] getConfigLocations() {
		return new String[] { "/pe/com/sgp/config/SpringApplicationContext.xml"
		};
	}

	public void testApp() {
		assert(true);
	}
}
