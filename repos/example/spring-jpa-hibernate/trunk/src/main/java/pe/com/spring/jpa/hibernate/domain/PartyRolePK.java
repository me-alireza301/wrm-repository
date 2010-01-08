package pe.com.spring.jpa.hibernate.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class PartyRolePK implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "ID")
    private Party party;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ID")
    private RoleType roleType;
	

    public PartyRolePK() {
    }

    public PartyRolePK(Party party, RoleType roleType) {
        this.party = party;
        this.roleType = roleType;
    }

    public final Party getParty() {
		return party;
	}

	public final void setParty(Party party) {
		this.party = party;
	}

	public final RoleType getRoleType() {
		return roleType;
	}

	public final void setRoleType(RoleType roleType) {
		this.roleType = roleType;
	}

    @Override
	public final String toString() {
        return "pe.com.spring.jpa.hibernate.domain.PartyRolePK[Id=" + party.getId() + ", roleTypeId=" + roleType.getId() + "]";
    }

}
