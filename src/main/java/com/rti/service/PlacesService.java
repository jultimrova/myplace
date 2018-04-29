package com.rti.service;

import com.rti.model.Place;

import java.util.UUID;

public interface PlacesService {
    Place save(Place place);
    Place findById(UUID uuid);
}
