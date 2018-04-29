package com.rti.service.impl;

import com.google.inject.Inject;
import com.rti.model.Place;
import com.rti.model.dto.PlacesRequest;
import com.rti.model.dto.PlacesResponse;
import com.rti.service.PlacesClient;
import com.rti.service.PlacesService;
import com.rti.service.TokenGenerator;

import java.util.List;
import java.util.UUID;

public class PlacesClientImpl implements PlacesClient {

    private PlacesService placesService;
    private TokenGenerator tokenGenerator;

    @Override
    public PlacesResponse create(PlacesRequest request) {
        Place place = PlacesResponse.to(request);
        place = (Place) tokenGenerator.generate(place);
        return PlacesResponse.from(placesService.save(place));
    }

    @Override
    public PlacesResponse get(String id) {
        UUID uuid = UUID.fromString(id);
        return PlacesResponse.from(placesService.findById(uuid));
    }

    @Override
    public List<PlacesResponse> findByName(String name) {
        return null;
    }

    @Inject
    public void setPlacesService(PlacesService placesService) {
        this.placesService = placesService;
    }

    @Inject
    public void setTokenGenerator(TokenGenerator tokenGenerator) {
        this.tokenGenerator = tokenGenerator;
    }
}
