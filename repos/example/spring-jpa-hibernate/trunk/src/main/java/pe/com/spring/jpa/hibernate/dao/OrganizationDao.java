package pe.com.spring.jpa.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.spring.jpa.hibernate.domain.Organization;

public interface OrganizationDao {

	void saveOrganization(Organization organization);

    Organization updateOrganization(Organization organization);

    void deleteOrganization(Organization organization);

    Organization findOrganizationById(final Serializable id);

    List<Organization> findOrganizationAll();

}
