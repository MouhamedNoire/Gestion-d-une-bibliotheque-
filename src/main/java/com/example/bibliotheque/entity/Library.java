package com.example.bibliotheque.entity;

import jakarta.persistence.*;

import java.util.List;

public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "library_id")
    private Long libraryId;

    @Column(name = "library_name")
    private String libraryName;

    private String location;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "library")
    private List<Book> books;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "library")
    private List<User> users;
}
