package com.management.system.bakery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @Entity
    @NoArgsConstructor
    @Table(name = "users")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "user_name", nullable = false)
        private String userName;

        @ManyToOne
        @JoinColumn(name = "role_id", nullable = false)
        private Role role;

        @Column(name = "user_password", nullable = false)
        private String userPassword;

        @Column(name = "email", unique = true, nullable = false)
        private String email;

        @Column(name = "phone_number")
        private String phoneNumber;
    }
