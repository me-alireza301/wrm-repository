package pe.com.spring.jpa.hibernate.domain;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "party_role")
public class PartyRole implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@EmbeddedId
    protected PartyRolePK partyRolePK;
   
	public PartyRole() {
    }

    public PartyRole(PartyRolePK partyRolePK) {
        this.partyRolePK = partyRolePK;
    }

    public PartyRole(Party party, RoleType roleType) {
        this.partyRolePK = new PartyRolePK(party, roleType);
    }

    public final PartyRolePK getPartyRolePK() {
        return partyRolePK;
    }

    public final void setPartyRolePK(PartyRolePK partyRolePK) {
        this.partyRolePK = partyRolePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyRolePK != null ? partyRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyRole)) {
            return false;
        }
        PartyRole other = (PartyRole) object;
        if ((this.partyRolePK == null && other.partyRolePK != null) || (this.partyRolePK != null && !this.partyRolePK.equals(other.partyRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.poc.spring.jpa.hibernate.domain.PartyRole[partyRolePK=" + partyRolePK + "]";
    }

}
