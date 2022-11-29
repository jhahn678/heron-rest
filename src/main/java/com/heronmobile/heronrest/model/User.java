package com.heronmobile.heronrest.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "firstname", length = 50)
    private String firstname;

    @Column(name = "lastname", length = 50)
    private String lastname;

    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Column(name = "bio", length = Integer.MAX_VALUE)
    private String bio;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "city", length = 100)
    private String city;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "password", length = Integer.MAX_VALUE)
    private String password;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;

    @Column(name = "state", length = 80)
    private String state;

    @Column(name = "apple_id", length = Integer.MAX_VALUE)
    private String appleId;

    @Column(name = "google_id", length = Integer.MAX_VALUE)
    private String googleId;

    @Column(name = "facebook_id", length = Integer.MAX_VALUE)
    private String facebookId;

}