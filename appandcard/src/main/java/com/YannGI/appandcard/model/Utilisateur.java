package com.YannGI.appandcard.model;

import jakarta.persistence.*;

@Entity
public class Utilisateur
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idUser;
    private String firstname;
    private String lastname;
    private String username;
    @Column(unique = true)
    private String email;
    private String password;
    private String usertype;
    private String sirette;

    public Utilisateur() {
    }

    public Utilisateur(Integer idUser, String firstname, String lastname, String username, String email, String password, String usertype, String sirette) {

        this.idUser = idUser;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.password = password;
        this.usertype = usertype;
        this.sirette = sirette;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getSirette() {
        return sirette;
    }

    public void setSirette(String sirette) {
        this.sirette = sirette;
    }
}
