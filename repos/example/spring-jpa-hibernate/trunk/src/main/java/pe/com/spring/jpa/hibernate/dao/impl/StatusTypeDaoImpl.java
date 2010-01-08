package pe.com.spring.jpa.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;
import pe.com.spring.jpa.hibernate.dao.StatusTypeDao;
import pe.com.spring.jpa.hibernate.domain.StatusType;
import pe.com.spring.jpa.hibernate.generic.dao.GenericJpaDaoHibernate;

public class StatusTypeDaoImpl extends GenericJpaDaoHibernate implements StatusTypeDao {

	public final void deleteStatusType(StatusType statusType) {
		super.delete(statusType);
	}

	public final List<StatusType> findStatusTypeAll() {
		return super.find(StatusType.class, "from StatusType");
	}

	public final StatusType findStatusTypeById(Serializable id) {
		return super.findById(StatusType.class, id);
	}

	public final void saveStatusType(StatusType statusType) {
		super.save(statusType);

	}

	public final StatusType updateStatusType(StatusType statusType) {
		return super.update(statusType);
	}

}
