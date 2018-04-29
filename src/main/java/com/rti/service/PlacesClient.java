package com.rti.service;

import com.rti.model.dto.PlacesRequest;
import com.rti.model.dto.PlacesResponse;

import java.util.List;

public interface PlacesClient {

    PlacesResponse create(PlacesRequest request);
    PlacesResponse get(String id);
    List<PlacesResponse> findByName(String name);

}
