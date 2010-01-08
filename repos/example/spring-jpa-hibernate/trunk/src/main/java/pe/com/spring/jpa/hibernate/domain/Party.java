package pe.com.spring.jpa.hibernate.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "party")
@MappedSuperclass
public class Party extends BaseEntity implements Serializable {
    
	private static final long serialVersionUID = 1L;
   
    @Column(name = "EXTERNAL_ID", nullable = true, length = 20)
    private String externalId;
    
    @Column(name = "DESCRIPTION", nullable = true, length = 255)
    private String description;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTY_TYPE_ID", referencedColumnName = "ID")
    private PartyType partyType;
	
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "ID")
    private Status status;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "party", fetch = FetchType.EAGER)
    private Person person;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "party", fetch = FetchType.EAGER)
    private Organization organization;

    public Party() {
    }

	public final String getExternalId() {
		return externalId;
	}

	public final void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public final PartyType getPartyType() {
		return partyType;
	}

	public final void setPartyType(PartyType partyType) {
		this.partyType = partyType;
	}

	public final Status getStatus() {
		return status;
	}

	public final void setStatus(Status status) {
		this.status = status;
	}

	public final Person getPerson() {
		return person;
	}

	public final void setPerson(Person person) {
		this.person = person;
	}

	public final Organization getOrganization() {
		return organization;
	}

	public final void setOrganization(Organization organization) {
		this.organization = organization;
	}

    @Override
	public String toString() {
        return "pe.com.spring.jpa.hibernate.domain.Party[Id=" + super.getId() + "]";
    }

}
