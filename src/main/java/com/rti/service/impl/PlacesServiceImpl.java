package com.rti.service.impl;

import com.rti.model.Place;
import com.rti.service.PlacesService;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class PlacesServiceImpl implements PlacesService {
    private Map<UUID, Place> mockRepository = new HashMap<UUID, Place>();
    public Place save(Place place) {
        return mockRepository.put(place.getUuid(), place);
    }

    public Place findById(UUID uuid) {
        return mockRepository.get(uuid);
    }

    public void setMockRepository(Map<UUID, Place> mockRepository) {
        this.mockRepository = mockRepository;
    }
}
