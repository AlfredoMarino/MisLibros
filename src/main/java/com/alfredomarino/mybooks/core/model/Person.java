package com.alfredomarino.mybooks.core.model;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Person
 */
@Entity
@Table(name = "person")
public class Person {

    @Id
    @Column(name = "idperson")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long personId;

    @OneToOne
    @JoinColumn(name = "iduser", referencedColumnName = "iduser", unique = true)
    @JsonIgnore
    private User user;
    
    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "birthdate")
    private Date birthdate;

    @ManyToOne
    @JoinColumn(name = "idnativecountry")
    private Country nativeCountry;

    @ManyToOne
    @JoinColumn(name = "idnativeregion")
    private Region nativeRegion;
    
    @ManyToOne
    @JoinColumn(name = "idcurrentcountry")
    private Country currentCountry;

    @ManyToOne
    @JoinColumn(name = "idcurrentregion")
    private Region currentRegion;

    @Column(name = "aboutme")
    private String aboutMe;

    @Column(name = "photo")
    private String photo;

    /**
     * @return the personId
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * @param personId the personId to set
     */
    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the birthdate
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the nativeCountry
     */
    public Country getNativeCountry() {
        return nativeCountry;
    }

    /**
     * @param nativeCountry the nativeCountry to set
     */
    public void setNativeCountry(Country nativeCountry) {
        this.nativeCountry = nativeCountry;
    }

    /**
     * @return the nativeRegion
     */
    public Region getNativeRegion() {
        return nativeRegion;
    }

    /**
     * @param nativeRegion the nativeRegion to set
     */
    public void setNativeRegion(Region nativeRegion) {
        this.nativeRegion = nativeRegion;
    }

    /**
     * @return the currentCountry
     */
    public Country getCurrentCountry() {
        return currentCountry;
    }

    /**
     * @param currentCountry the currentCountry to set
     */
    public void setCurrentCountry(Country currentCountry) {
        this.currentCountry = currentCountry;
    }

    /**
     * @return the currentRegion
     */
    public Region getCurrentRegion() {
        return currentRegion;
    }

    /**
     * @param currentRegion the currentRegion to set
     */
    public void setCurrentRegion(Region currentRegion) {
        this.currentRegion = currentRegion;
    }

    /**
     * @return the aboutMe
     */
    public String getAboutMe() {
        return aboutMe;
    }

    /**
     * @param aboutMe the aboutMe to set
     */
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    /**
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", user=" + user +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                ", nativeCountry=" + nativeCountry +
                ", nativeRegion=" + nativeRegion +
                ", currentCountry=" + currentCountry +
                ", currentRegion=" + currentRegion +
                ", aboutMe='" + aboutMe + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}