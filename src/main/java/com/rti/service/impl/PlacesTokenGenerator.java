package com.rti.service.impl;

import com.rti.model.Place;
import com.rti.service.PlacesService;
import com.rti.service.TokenGenerator;

import java.util.UUID;


public class PlacesTokenGenerator implements TokenGenerator<Place> {

    @Override
    public Place generate(Place place) {
        UUID uuid = UUID.fromString(place.toString());
        place.setUuid(uuid);
        return place;
    }
}
