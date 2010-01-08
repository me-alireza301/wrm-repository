package pe.com.spring.jpa.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;
import pe.com.spring.jpa.hibernate.dao.StatusDao;
import pe.com.spring.jpa.hibernate.domain.Status;
import pe.com.spring.jpa.hibernate.generic.dao.GenericJpaDaoHibernate;

public class StatusDaoImpl extends GenericJpaDaoHibernate implements StatusDao {

	public final void deleteStatus(Status status) {
		super.delete(status);
	}

	public final List<Status> findStatusAll() {
		return super.find(Status.class, "from Status");
	}

	public final Status findStatusById(Serializable id) {
		return super.findById(Status.class, id);
	}

	public final void saveStatus(Status status) {
		super.save(status);

	}

	public final Status updateStatus(Status status) {
		return super.update(status);
	}

}
