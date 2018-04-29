package com.rti.model.dto;

import com.rti.model.Place;

import java.time.LocalDate;

public class PlacesRequest {
    private String name;
    private String category;
    private GeoPointDto location;
    private LocalDate publishDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public GeoPointDto getLocation() {
        return location;
    }

    public void setLocation(GeoPointDto location) {
        this.location = location;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
}
