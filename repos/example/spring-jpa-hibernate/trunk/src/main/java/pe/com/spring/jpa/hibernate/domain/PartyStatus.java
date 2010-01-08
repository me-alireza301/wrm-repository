package pe.com.spring.jpa.hibernate.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "party_status")
public class PartyStatus implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@EmbeddedId
    protected PartyStatusPK partyStatusPK;
    
    public PartyStatus() {
    }

    public PartyStatus(PartyStatusPK partyStatusPK) {
        this.partyStatusPK = partyStatusPK;
    }

    public PartyStatus(Party party, Status status, Date statusDate) {
        this.partyStatusPK = new PartyStatusPK(party, status, statusDate);
    }

    public final PartyStatusPK getPartyStatusPK() {
		return partyStatusPK;
	}

	public final void setPartyStatusPK(PartyStatusPK partyStatusPK) {
		this.partyStatusPK = partyStatusPK;
	}

	@Override
	public final int hashCode() {
        int hash = 0;
        hash += (partyStatusPK != null ? partyStatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyStatus)) {
            return false;
        }
        PartyStatus other = (PartyStatus) object;
        if ((this.partyStatusPK == null && other.partyStatusPK != null) || (this.partyStatusPK != null && !this.partyStatusPK.equals(other.partyStatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.spring.jpa.hibernate.domain.PartyStatus[partyStatusPK=" + partyStatusPK + "]";
    }

}
