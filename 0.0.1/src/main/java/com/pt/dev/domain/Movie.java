package com.pt.dev.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long Id;
    private String title;
    private String director;
    public Long getId() {
        return Id;
    }
    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public void setId(Long id) {
        this.Id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Movie [id=").append(Id).append(", title=").append(title).append(", director=")
                .append(director).append("]");
        return builder.toString();
    }
}
