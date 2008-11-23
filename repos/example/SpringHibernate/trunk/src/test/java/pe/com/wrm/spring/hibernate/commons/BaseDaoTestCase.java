package pe.com.wrm.spring.hibernate.commons;

import org.apache.commons.logging.Log;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public abstract class BaseDaoTestCase extends
		AbstractTransactionalDataSourceSpringContextTests {

	protected final Log log = logger;

	@Override
	protected String[] getConfigLocations() {
		setAutowireMode(AUTOWIRE_BY_NAME);
		return new String[] { "applicationContext.xml" };
	}
}