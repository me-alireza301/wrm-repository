	package pe.com.spring.jpa.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.spring.jpa.hibernate.domain.PartyStatus;

public interface PartyStatusDao {
	
	void savePartyStatus(PartyStatus partyStatus);

    PartyStatus updatePartyStatus(PartyStatus partyStatus);

    void deletePartyStatus(PartyStatus partyStatus);

    PartyStatus findPartyStatusById(final Serializable id);

    List<PartyStatus> findPartyStatusAll();


}
