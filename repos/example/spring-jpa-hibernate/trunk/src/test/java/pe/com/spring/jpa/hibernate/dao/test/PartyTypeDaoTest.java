package pe.com.spring.jpa.hibernate.dao.test;

import pe.com.spring.jpa.hibernate.config.test.AbstractJpaUnitTest;
import pe.com.spring.jpa.hibernate.dao.PartyTypeDao;
import pe.com.spring.jpa.hibernate.domain.PartyType;

public class PartyTypeDaoTest extends AbstractJpaUnitTest {
	
	private PartyTypeDao partyTypeDao;

	public PartyTypeDao getPartyTypeDao() {
		return partyTypeDao;
	}

	public void setPartyTypeDao(PartyTypeDao partyTypeDao) {
		this.partyTypeDao = partyTypeDao;
	}
	
	public void testSavePartyTypeDao(){
		PartyType partyType = new PartyType();
		partyType.setParentPartyType(null);
		partyType.setDescription("Enterprise test");
		
		this.getPartyTypeDao().savePartyType(partyType);
		assertNotNull(partyType.getId());
		//setComplete();
	}

}
