package pe.com.spring.jpa.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.spring.jpa.hibernate.domain.PartyRole;

public interface PartyRoleDao {
	
	void savePartyRole(PartyRole partyRole);

    PartyRole updatePartyRole(PartyRole partyRole);

    void deletePartyRole(PartyRole partyRole);

    PartyRole findPartyRoleById(final Serializable id);

    List<PartyRole> findPartyRoleAll();

}
