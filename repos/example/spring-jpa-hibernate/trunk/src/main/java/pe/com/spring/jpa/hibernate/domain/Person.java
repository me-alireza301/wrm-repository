package pe.com.spring.jpa.hibernate.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "person")
public class Person extends Party implements Serializable {
    
	private static final long serialVersionUID = 1L;
    
    @Column(name = "FIRST_NAME", nullable = true, length = 100)
    private String firstName;
    
    @Column(name = "MIDDLE_NAME", nullable = true, length = 100)
    private String middleName;
    
    @Column(name = "LAST_NAME", nullable = true, length = 100)
    private String lastName;
    
    @Column(name = "PERSONAL_TITLE", nullable = true, length = 100)
    private String personalTitle;
    
    @Column(name = "GENDER" , nullable = true, length = 1)
    private Character gender;
    
    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    
    @Column(name = "COMMENTS", nullable = true, length = 255)
    private String comments;

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    private Party party;

    public Person() {
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getMiddleName() {
        return middleName;
    }

    public final void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final String getPersonalTitle() {
        return personalTitle;
    }

    public final void setPersonalTitle(String personalTitle) {
        this.personalTitle = personalTitle;
    }

    public final Character getGender() {
        return gender;
    }

    public final void setGender(Character gender) {
        this.gender = gender;
    }

    public final Date getBirthDate() {
        return birthDate;
    }

    public final void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public final String getComments() {
        return comments;
    }

    public final void setComments(String comments) {
        this.comments = comments;
    }

    public final Party getParty() {
        return party;
    }

    public final void setParty(Party party) {
        this.party = party;
    }

    @Override
    public String toString() {
        return "pe.com.spring.jpa.hibernate.domain.Person[partyId=" + super.getId() + "]";
    }

}
