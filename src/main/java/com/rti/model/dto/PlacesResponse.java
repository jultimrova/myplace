package com.rti.model.dto;

import com.rti.model.Place;

import java.util.UUID;

public class PlacesResponse extends PlacesRequest {
    private UUID uuid;
    public static Place to(PlacesRequest request) {
        Place entity = new Place();
        entity.setName(request.getName());
        entity.setCategory(request.getCategory());
        entity.setPublishDate(request.getPublishDate());
        entity.setLocation(GeoPointDto.to(request.getLocation()));
        return entity;
    }

    public static PlacesResponse from(Place entity) {
        PlacesResponse response = new PlacesResponse();
        response.setName(entity.getName());
        response.setCategory(entity.getCategory());
        response.setPublishDate(entity.getPublishDate());
        response.setLocation(GeoPointDto.from(entity.getLocation()));
        response.setUuid(entity.getUuid());
        return response;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
