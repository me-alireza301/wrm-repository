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
@Table(name = "role_type")
public class RoleType extends BaseEntity implements Serializable {
    
	private static final long serialVersionUID = 1L;

    @Column(name = "DESCRIPTION", nullable = true, length = 255)
    private String description;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "ID")
	private RoleType parentRoleType;
    
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "ID")
	private List<RoleType> roleTypeChildrenList;

    public RoleType() {
    }

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public final RoleType getParentRoleType() {
		return parentRoleType;
	}

	public final void setParentRoleType(RoleType parentRoleType) {
		this.parentRoleType = parentRoleType;
	}

	public final List<RoleType> getRoleTypeChildrenList() {
		return roleTypeChildrenList;
	}

	public final void setRoleTypeChildrenList(List<RoleType> roleTypeChildrenList) {
		this.roleTypeChildrenList = roleTypeChildrenList;
	}

    @Override
    public String toString() {
        return "pe.com.spring.jpa.hibernate.domain.RoleType[roleTypeId=" + super.getId() + "]";
    }

}
