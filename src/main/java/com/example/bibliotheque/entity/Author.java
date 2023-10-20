package com.example.bibliotheque.entity;

import jakarta.persistence.*;

import java.util.List;

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long authorId;

    @Column(name = "author_name")
    private String authorName;

    private String biography;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "author")
    private List<Book> books;

}
