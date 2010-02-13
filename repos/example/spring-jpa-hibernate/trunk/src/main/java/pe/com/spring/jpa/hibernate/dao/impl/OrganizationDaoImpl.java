package pe.com.spring.jpa.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;
import pe.com.spring.jpa.hibernate.dao.OrganizationDao;
import pe.com.spring.jpa.hibernate.domain.Organization;
import pe.com.spring.jpa.hibernate.generic.dao.GenericJpaDaoHibernate;

public class OrganizationDaoImpl extends GenericJpaDaoHibernate implements OrganizationDao {

	public final void deleteOrganization(Organization organization) {
		super.delete(organization);
	}

	public final List<Organization> findOrganizationAll() {
		return super.find(Organization.class, "from Organization");
	}

	public final Organization findOrganizationById(Serializable id) {
		return super.findById(Organization.class, id);
	}

	public final void saveOrganization(Organization organization) {
		super.save(organization);

	}

	public final Organization updateOrganization(Organization organization) {
		return super.update(organization);
	}

	public final List<Organization> findOrganizations() {
		return super.find(Organization.class, "from Organization");
	}
}
