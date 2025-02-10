package com.patulus.learn_jwt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String roles; // USER,ADMIN

    public List<String> getRoleList() {
        if (this.roles.isEmpty() || this.roles.isBlank()) return new ArrayList<>();

        return Arrays.asList(this.roles.split(","));
    }

}
