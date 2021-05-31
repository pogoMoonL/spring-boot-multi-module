package com.purnima.jain.customer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author Raysmond
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ROLE_USER = "ROLE_USER";

    @Column(unique = true)
    private String email;

    @Transient // 此屬性會被JPA忽略
    @JsonIgnore
    private String password;

    private String role = ROLE_USER;

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



}
