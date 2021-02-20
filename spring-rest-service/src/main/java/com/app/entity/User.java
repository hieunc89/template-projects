package com.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    private String userId;
    private String password = "";
    private String company;
    private String firstName;
    private String lastName;
    private String email;

    @JsonIgnore
    private int securityProviderId;
    @JsonIgnore
    private int defaultCustomerId;

    @JsonIgnore
    private String phone;
    @JsonIgnore
    private String address1;
    @JsonIgnore
    private String address2;
    @JsonIgnore
    private String country;
    @JsonIgnore
    private String postal;

    @Enumerated(EnumType.STRING)
    private Role role;

    @JsonIgnore
    private boolean isActive;
    @JsonIgnore
    private boolean isBlocked;
    @JsonIgnore
    private String secretQuestion;
    @JsonIgnore
    private String secretAnswer;
    @JsonIgnore
    private boolean enableBetaTesting;
    @JsonIgnore
    private boolean enableRenewal;

    public User() {
        this("new", "PASSWORD", Role.USER, "new", "new", true, "", "", "", "", "", "", "", "", true, false);
    }

    public User(String userId, String password, String firstName, String lastName) {
        this(userId, password, Role.USER, firstName, lastName, true, "", "", "", "", "", "", "", "", true, false);
    }

    public User(String userId, String password, Role role, String firstName, String lastName) {
        this(userId, password, role, firstName, lastName, true, "", "", "", "", "", "", "", "", true, false);
    }

    public User(String userId, String password, Role role, String firstName, String lastName, boolean isActive) {
        this(userId, password, role, firstName, lastName, isActive, "", "", "", "", "", "", "", "", true, false);
    }

    public User(String userId, String password, Role role, String firstName, String lastName, boolean isActive,
                String company, String phone, String address1, String address2, String country, String postal,
                String secretQuestion, String secretAnswer, boolean enableRenewal, boolean enableBetaTesting) {
        this.setUserId(userId);
        this.setEmail(userId);
        this.setPassword(new BCryptPasswordEncoder().encode(password));
        this.setRole(role);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setActive(isActive);
        this.setCompany(company);
        this.setPhone(phone);
        this.setAddress1(address1);
        this.setAddress2(address2);
        this.setCountry(country);
        this.setPostal(postal);
        this.setSecretQuestion(secretQuestion);
        this.setSecretAnswer(secretAnswer);
        this.setEnableRenewal(enableRenewal);
        this.setEnableBetaTesting(enableBetaTesting);
    }

    public String getFullName() {
        return this.firstName + this.lastName;
    }
}