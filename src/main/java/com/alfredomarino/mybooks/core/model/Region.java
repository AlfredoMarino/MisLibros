package com.alfredomarino.mybooks.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Region
 */
@Entity
@Table(name = "region")
public class Region {

    @Id
    @Column(name = "idregion")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long regionId;

    @ManyToOne
    @JoinColumn(name = "idcountry")
    @JsonIgnore
    private Country country;

    @Column(name = "name")
    private String name;

    /**
     * @return the regionId
     */
    public Long getRegionId() {
        return regionId;
    }

    /**
     * @param regionId the regionId to set
     */
    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }


    /**
     * @return the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
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

    @Override
    public String toString() {
        return "Region{" +
                "regionId=" + regionId +
                ", country=" + country +
                ", name='" + name + '\'' +
                '}';
    }
}