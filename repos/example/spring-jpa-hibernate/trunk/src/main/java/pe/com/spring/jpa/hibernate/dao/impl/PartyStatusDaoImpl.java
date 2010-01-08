package pe.com.spring.jpa.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;
import pe.com.spring.jpa.hibernate.dao.PartyStatusDao;
import pe.com.spring.jpa.hibernate.domain.PartyStatus;
import pe.com.spring.jpa.hibernate.generic.dao.GenericJpaDaoHibernate;

public class PartyStatusDaoImpl extends GenericJpaDaoHibernate implements PartyStatusDao {

	public final void deletePartyStatus(PartyStatus partyStatus) {
		super.delete(partyStatus);
	}

	public final List<PartyStatus> findPartyStatusAll() {
		return super.find(PartyStatus.class, "from PartyStatus");
	}

	public final PartyStatus findPartyStatusById(Serializable id) {
		return super.findById(PartyStatus.class, id);
	}

	public final void savePartyStatus(PartyStatus partyStatus) {
		super.save(partyStatus);

	}

	public final PartyStatus updatePartyStatus(PartyStatus partyStatus) {
		return super.update(partyStatus);
	}

}
