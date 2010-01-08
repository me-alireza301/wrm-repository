package pe.com.spring.jpa.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.spring.jpa.hibernate.domain.StatusType;

public interface StatusTypeDao {
	
	void saveStatusType(StatusType statusType);

    StatusType updateStatusType(StatusType statusType);

    void deleteStatusType(StatusType statusType);

    StatusType findStatusTypeById(final Serializable id);

    List<StatusType> findStatusTypeAll();

}
