package pe.com.spring.jpa.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;
import pe.com.spring.jpa.hibernate.dao.PartyTypeDao;
import pe.com.spring.jpa.hibernate.domain.PartyType;
import pe.com.spring.jpa.hibernate.generic.dao.GenericJpaDaoHibernate;

public class PartyTypeDaoImpl extends GenericJpaDaoHibernate implements PartyTypeDao {

	public final void deletePartyType(final PartyType partyType) {
		super.delete(partyType);
	}

	public final List<PartyType> findPartyTypeAll() {
		return super.find(PartyType.class, "from PartyType");
	}

	public final PartyType findPartyTypeById(Serializable id) {
		return super.findById(PartyType.class, id);
	}

	public final void savePartyType(PartyType partyType) {
		super.save(partyType);
	}

	public final PartyType updatePartyType(PartyType partyType) {
		return super.update(partyType);
	}

}
