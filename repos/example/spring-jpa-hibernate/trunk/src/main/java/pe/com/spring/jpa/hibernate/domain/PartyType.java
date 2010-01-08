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
@Table(name = "party_type")
public class PartyType extends BaseEntity implements Serializable {
    
	private static final long serialVersionUID = 1L;
    
    @Column(name = "DESCRIPTION", nullable = true, length = 255)
    private String description;
   
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "ID")
    private PartyType parentPartyType;
    
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "ID")
	private List<PartyType> partyTypeChildrenList;
    

    public PartyType() {
    }

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public final PartyType getParentPartyType() {
		return parentPartyType;
	}

	public final void setParentPartyType(PartyType parentPartyType) {
		this.parentPartyType = parentPartyType;
	}

	public final List<PartyType> getPartyTypeChildrenList() {
		return partyTypeChildrenList;
	}

	public final void setPartyTypeChildrenList(List<PartyType> partyTypeChildrenList) {
		this.partyTypeChildrenList = partyTypeChildrenList;
	}

    @Override
    public String toString() {
        return "pe.com.spring.jpa.hibernate.domain.PartyType[Id=" + super.getId()+ "]";
    }

}
