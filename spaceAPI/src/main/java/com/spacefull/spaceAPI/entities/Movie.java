package com.spacefull.spaceAPI.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "Введите, название!")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Введите, режисера!")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "Введите, студию!")
    private String studio;

    @ElementCollection
    @CollectionTable(name = "movie_cast")
    private Set<String> movieCast;

    @Column(nullable = false)
    private Integer releaseYear;

    @Column(nullable = false)
    @NotBlank(message = "Добавьте, постер!")
    private String poster;


}
