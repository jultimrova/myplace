package com.rti.service.impl;

import com.rti.model.Place;
import org.junit.Test;

import java.util.HashMap;

public class PlacesServiceImplTest {

    @Test
    public void test() throws Exception {
        PlacesServiceImpl service = new PlacesServiceImpl();
        service.setMockRepository(new HashMap<>());

        Place place = new Place();
        place.setName("name");
        service.save(place);
    }

}
