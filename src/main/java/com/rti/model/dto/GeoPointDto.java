package com.rti.model.dto;

import com.rti.model.GeoPoint;

public class GeoPointDto {
    private Double lat;
    private Double lon;

    public static GeoPoint to(GeoPointDto dto) {
        GeoPoint point = new GeoPoint();
        point.setLat(dto.getLat());
        point.setLon(dto.getLon());
        return point;
    }

    public static GeoPointDto from(GeoPoint point) {
        GeoPointDto dto = new GeoPointDto();
        dto.setLat(point.getLat());
        dto.setLon(point.getLon());
        return dto;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }
}
