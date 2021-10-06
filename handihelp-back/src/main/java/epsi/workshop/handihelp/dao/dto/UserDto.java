package epsi.workshop.handihelp.dao.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
    private Long id;
    private String nom;
    private String prenom;
    private String username;
    private String password;
    private String email;
    private String telephone;
    private String role;

    public UserDto() {
    }

    public UserDto(Long id, String nom, String prenom, String username, String password,
                   String email, String telephone, String role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
