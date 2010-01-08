package pe.com.spring.jpa.hibernate.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false, length = 20)
	private Long id;

	@Column(name = "CREATED_BY", nullable = true, length = 20)
	private String createdBy;

	@Column(name = "DATE_CREATED")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;

	@Column(name = "UPDATED_BY", nullable = true, length = 20)
	private String updatedBy;

	@Column(name = "DATE_UPDATED")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateUpdated;

	//@Column(name = "VERSION", nullable = false, length = 4)
	//private int version;

	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public final String getCreatedBy() {
		return createdBy;
	}

	public final void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public final Date getDateCreated() {
		return dateCreated;
	}

	public final void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public final String getUpdatedBy() {
		return updatedBy;
	}

	public final void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public final Date getDateUpdated() {
		return dateUpdated;
	}

	public final void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	/*
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	*/
}
