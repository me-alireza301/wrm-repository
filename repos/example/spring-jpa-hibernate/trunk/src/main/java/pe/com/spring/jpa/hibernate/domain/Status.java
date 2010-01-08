package pe.com.spring.jpa.hibernate.domain;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "status")
public class Status extends BaseEntity implements Serializable {
    
	private static final long serialVersionUID = 1L;
    
	@Column(name = "STATUS_CODE", nullable = true, length = 60)
    private String statusCode;
    
    @Column(name = "SEQUENCE_ID", nullable = true, length = 20)
    private BigInteger sequenceId;
    
    @Column(name = "DESCRIPTION", nullable = true, length = 255)
    private String description;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "STATUS_TYPE_ID", referencedColumnName = "ID")
    private StatusType statusType;

    public Status() {
    }

 	public final String getStatusCode() {
		return statusCode;
	}

	public final void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public final BigInteger getSequenceId() {
		return sequenceId;
	}

	public final void setSequenceId(BigInteger sequenceId) {
		this.sequenceId = sequenceId;
	}

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public final StatusType getStatusType() {
		return statusType;
	}

	public final void setStatusType(StatusType statusType) {
		this.statusType = statusType;
	}

    @Override
    public String toString() {
        return "pe.com.spring.jpa.hibernate.domain.Status[Id=" + super.getId() + "]";
    }

}
