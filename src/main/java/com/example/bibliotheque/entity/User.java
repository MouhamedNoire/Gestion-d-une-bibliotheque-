package com.example.bibliotheque.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    @Column(name="user_name")
    private String userName;

    private String mail;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
    private List<Review> reviews;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "library_id")
    private Library library;

    @ManyToMany(mappedBy = "users")
    private Set<Book> books;
}
