package com.rti.model;

import java.time.LocalDate;
import java.util.UUID;

public class Place {

    private UUID uuid;
    private String name;
    private String category;
    private GeoPoint location;
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

    public GeoPoint getLocation() {
        return location;
    }

    public void setLocation(GeoPoint location) {
        this.location = location;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", location=" + location +
                '}';
    }
}
