package pe.com.spring.jpa.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;
import pe.com.spring.jpa.hibernate.dao.PartyRoleDao;
import pe.com.spring.jpa.hibernate.domain.PartyRole;
import pe.com.spring.jpa.hibernate.generic.dao.GenericJpaDaoHibernate;

public class PartyRoleDaoImpl extends GenericJpaDaoHibernate implements PartyRoleDao {

	public final void deletePartyRole(PartyRole partyRole) {
		super.delete(partyRole);
	}

	public final List<PartyRole> findPartyRoleAll() {
		return super.find(PartyRole.class, "from PartyRole");
	}

	public final PartyRole findPartyRoleById(Serializable id) {
		return super.findById(PartyRole.class, id);
	}

	public final void savePartyRole(PartyRole partyRole) {
		super.save(partyRole);
	}

	public final PartyRole updatePartyRole(PartyRole partyRole) {
		return super.update(partyRole);
	}

}
