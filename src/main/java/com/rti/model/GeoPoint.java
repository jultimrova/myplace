package com.rti.model;

public class GeoPoint {
    private Double lat;
    private Double lon;
    private String locationHash;

    public GeoPoint() {
    }

    public GeoPoint(Double lat, Double lon, String locationHash) {
        this.lat = lat;
        this.lon = lon;
        this.locationHash = locationHash;
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

    public String getLocationHash() {
        return locationHash;
    }

    public void setLocationHash(String locationHash) {
        this.locationHash = locationHash;
    }

    @Override
    public String toString() {
        return "GeoPoint{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", locationHash='" + locationHash + '\'' +
                '}';
    }
}
