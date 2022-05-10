package com.demo.cardatabase.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Owner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long ownerid;
    private String firstname, lastname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Car> cars;

    // Constructors
    public Owner() { }
    public Owner(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Getters
    public long getOwnerId() {
        return this.ownerid;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    // Setters
    public void setOwnerid(long ownerid) {
        this.ownerid = ownerid;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
      return "Owner{id=" + this.ownerid + ", firstname='" + this.firstname + '\'' + ", lastname='" + this.lastname + "'}";
    }

}
