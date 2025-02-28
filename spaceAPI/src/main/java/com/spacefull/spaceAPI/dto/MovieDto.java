package com.spacefull.spaceAPI.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {

    private Integer movieId;

    @NotBlank(message = "Введите, название!")
    private String title;

    @NotBlank(message = "Введите, режисера!")
    private String director;

    @NotBlank(message = "Введите, студию!")
    private String studio;

    private Set<String> movieCast;

    private Integer releaseYear;

    @NotBlank(message = "Добавьте, постер!")
    private String poster;

    @NotBlank(message = "Добавьте, ссылку на постер!")
    private String posterUrl;

}
