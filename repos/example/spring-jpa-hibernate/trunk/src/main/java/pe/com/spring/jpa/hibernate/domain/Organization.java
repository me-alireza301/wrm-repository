package pe.com.spring.jpa.hibernate.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "organization")
public class Organization  extends Party implements Serializable {

	private static final long serialVersionUID = 1L;
    
    @Column(name = "ORGANIZATION_NAME", nullable = true, length = 100)
    private String organizationName;
    
    @Column(name = "ORGANIZATION_NAME_LOCAL", nullable = true, length = 100)
    private String organizationNameLocal;
    
    @Column(name = "OFFICE_SITE_NAME", nullable = true, length = 100)
    private String officeSiteName;
    
    @Column(name = "COMMENTS", nullable = true, length = 255)
    private String comments;
    
    @Column(name = "LOGO_IMAGE_URL", nullable = true, length = 255)
    private String logoImageUrl;

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    private Party party;

    public Organization() {
    }

    public final String getOrganizationName() {
        return organizationName;
    }

    public final void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public final String getOrganizationNameLocal() {
        return organizationNameLocal;
    }

    public final void setOrganizationNameLocal(String organizationNameLocal) {
        this.organizationNameLocal = organizationNameLocal;
    }

    public final String getOfficeSiteName() {
        return officeSiteName;
    }

    public final void setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
    }

    public final String getComments() {
        return comments;
    }

    public final void setComments(String comments) {
        this.comments = comments;
    }

    public final String getLogoImageUrl() {
        return logoImageUrl;
    }

    public final void setLogoImageUrl(String logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
    }

    public final Party getParty() {
        return party;
    }

    public final void setParty(Party party) {
        this.party = party;
    }

    @Override
	public final String toString() {
        return "pe.com.spring.jpa.hibernate.domain.Organization[partyId=" + super.getId() + "]";
    }

}
