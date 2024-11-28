package dci.j24e01.TravelBlog.model;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    private Date createdAt;
    private Date updatedAt;

    public enum Role {
        ADMIN
    }

    // Getters and Setters
}

