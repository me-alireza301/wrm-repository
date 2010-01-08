package pe.com.spring.jpa.hibernate.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class PartyStatusPK implements Serializable {

	private static final long serialVersionUID = 1L;
		
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "ID")
    private Party party;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "ID")
    private Status status;
    
    @Column(name = "STATUS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDate;

    public PartyStatusPK() {
    }

    public PartyStatusPK(Party party, Status status, Date statusDate) {
        this.party = party;
        this.status = status;
        this.statusDate = statusDate;
    }

   public final Party getParty() {
		return party;
	}

	public final void setParty(Party party) {
		this.party = party;
	}

	public final Status getStatus() {
		return status;
	}

	public final void setStatus(Status status) {
		this.status = status;
	}

	public final Date getStatusDate() {
		return statusDate;
	}

	public final void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

    @Override
    public String toString() {
        return "pe.com.spring.jpa.hibernate.domain.PartyStatusPK[partyId=" + party.getId() + ", statusTypeId=" + status.getId() + ", statusDate=" + statusDate + "]";
    }

}
