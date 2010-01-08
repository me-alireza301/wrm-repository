package pe.com.spring.jpa.hibernate.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "status_type")
public class StatusType extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
    
    @Column(name = "DESCRIPTION", nullable = true, length = 255)
    private String description;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "ID")
    private StatusType parentStatusType;
    
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "ID")
	private List<StatusType> statusTypeChildrenList;

    public StatusType() {
    }

   public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public final StatusType getParentStatusType() {
		return parentStatusType;
	}

	public final void setParentStatusType(StatusType parentStatusType) {
		this.parentStatusType = parentStatusType;
	}

	public final List<StatusType> getStatusTypeChildrenList() {
		return statusTypeChildrenList;
	}

	public final void setStatusTypeChildrenList(List<StatusType> statusTypeChildrenList) {
		this.statusTypeChildrenList = statusTypeChildrenList;
	}

    @Override
    public String toString() {
        return "pe.com.spring.jpa.hibernate.domain.StatusType[Id=" + super.getId() + "]";
    }

}
