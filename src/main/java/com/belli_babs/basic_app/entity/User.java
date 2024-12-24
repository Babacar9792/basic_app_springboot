package com.belli_babs.basic_app.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    private Long id;

    @Column(unique=true, nullable=false, length = 20)
    private String username;

    @Column(unique=true, nullable=false, length = 20)
    private String password;

}
