package pe.com.spring.jpa.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.spring.jpa.hibernate.domain.PartyType;

public interface PartyTypeDao {
	
	void savePartyType(PartyType partyType);

    PartyType updatePartyType(PartyType partyType);

    void deletePartyType(PartyType partyType);

    PartyType findPartyTypeById(final Serializable id);

    List<PartyType> findPartyTypeAll();
	

}
