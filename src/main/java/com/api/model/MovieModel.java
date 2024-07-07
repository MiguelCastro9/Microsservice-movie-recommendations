package com.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Miguel Castro
 */
@Entity
@Table(name = "movie")
public class MovieModel implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 180)
    private String title;

    @Column(nullable = false, length = 180)
    private String gender;

    @Column(nullable = false)
    private Integer classification;

    @Column(nullable = false, length = 255)
    private String description;

    public MovieModel() {
    }

    public MovieModel(Long id, String title, String gender, Integer classification, String description) {
        this.id = id;
        this.title = title;
        this.gender = gender;
        this.classification = classification;
        this.description = description;
    }

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGender() {
        return gender;
    }

    public Integer getClassification() {
        return classification;
    }

    public String getDescription() {
        return description;
    }

    public MovieModel(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.gender = builder.gender;
        this.classification = builder.classification;
        this.description = builder.description;
    }

    public static class Builder {

        private Long id;

        private String title;

        private String gender;

        private Integer classification;

        private String description;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setClassification(Integer classification) {
            this.classification = classification;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public MovieModel build() {
            return new MovieModel(this);
        }
    }
}
