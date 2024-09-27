package com.YannGI.webapp.model;

/*@Entity*/
/*@Data*/
public class User
{
   /* @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)*/
    private Integer iduser;
    private Integer firstname;
    private Integer lastname;
    private String username;
   /* @Column(unique = true)*/
    private String email;
    private String password;
    private String usertype;
    private String sirette;

    public User() {
    }

    public User(Integer iduser, Integer firstname, Integer lastname, String username, String email, String password, String usertype, String sirette) {
        this.iduser = iduser;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.password = password;
        this.usertype = usertype;
        this.sirette = sirette;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public Integer getFirstname() {
        return firstname;
    }

    public void setFirstname(Integer firstname) {
        this.firstname = firstname;
    }

    public Integer getLastname() {
        return lastname;
    }

    public void setLastname(Integer lastname) {
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
