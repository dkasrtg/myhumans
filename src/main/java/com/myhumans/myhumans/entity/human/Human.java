package com.myhumans.myhumans.entity.human;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String lastname;
    public String firstname;
    public Date dateofbirth;
    public String sex;
    public String adress;

    public Long getId() {
        return id;
    }
    public String getLastname() {
        return lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public Date getDateofbirth() {
        return dateofbirth;
    }
    public String getSex() {
        return sex;
    }
    public String getAdress() {
        return adress;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
}
