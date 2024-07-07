package com.api.dto.response;

import com.api.model.MovieModel;

/**
 *
 * @author Miguel Castro
 */
public class MovieResponseDto {

    private Long id;

    private String title;

    private String gender;

    private Integer classification;

    private String description;

    public MovieResponseDto() {
    }

    public MovieResponseDto(Long id, String title, String gender, Integer classification, String description) {
        this.id = id;
        this.title = title;
        this.gender = gender;
        this.classification = classification;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static MovieResponseDto convertEntityForMovieResponseDto(MovieModel movieModel) {
        return new MovieResponseDto(movieModel.getId(), movieModel.getTitle(), movieModel.getGender(),
                movieModel.getClassification(), movieModel.getDescription());
    }
}
