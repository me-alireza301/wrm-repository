package pe.com.spring.jpa.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.spring.jpa.hibernate.domain.RoleType;

public interface RoleTypeDao {
	
	void saveRoleType(RoleType roleType);

    RoleType updateRoleType(RoleType roleType);

    void deleteRoleType(RoleType roleType);

    RoleType findRoleTypeById(final Serializable id);

    List<RoleType> findRoleTypeAll();
	

}
