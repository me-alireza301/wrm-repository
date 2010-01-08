package pe.com.spring.jpa.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;
import pe.com.spring.jpa.hibernate.dao.RoleTypeDao;
import pe.com.spring.jpa.hibernate.domain.RoleType;
import pe.com.spring.jpa.hibernate.generic.dao.GenericJpaDaoHibernate;

public class RoleTypeDaoImpl extends GenericJpaDaoHibernate implements RoleTypeDao {

	public final void deleteRoleType(RoleType roleType) {
		super.delete(roleType);
	}

	public final List<RoleType> findRoleTypeAll() {
		return super.find(RoleType.class, "from RoleType");
	}

	public final RoleType findRoleTypeById(Serializable id) {
		return super.findById(RoleType.class, id);
	}

	public final void saveRoleType(RoleType roleType) {
		super.save(roleType);
	}

	public final RoleType updateRoleType(RoleType roleType) {
		return super.update(roleType);
	}

}
