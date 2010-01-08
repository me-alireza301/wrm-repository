package pe.com.spring.jpa.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.spring.jpa.hibernate.domain.Status;

public interface StatusDao {
	
	void saveStatus(Status status);

    Status updateStatus(Status status);

    void deleteStatus(Status status);

    Status findStatusById(final Serializable id);

    List<Status> findStatusAll();

}
