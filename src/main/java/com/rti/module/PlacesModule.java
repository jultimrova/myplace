package com.rti.module;

import com.google.inject.AbstractModule;
import com.rti.controller.PlacesController;
import com.rti.service.PlacesClient;
import com.rti.service.PlacesService;
import com.rti.service.TokenGenerator;
import com.rti.service.impl.PlacesClientImpl;
import com.rti.service.impl.PlacesServiceImpl;
import com.rti.service.impl.PlacesTokenGenerator;

import javax.inject.Singleton;

public class PlacesModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(PlacesService.class).to(PlacesServiceImpl.class);
        bind(TokenGenerator.class).to(PlacesTokenGenerator.class);
        bind(PlacesClient.class).to(PlacesClientImpl.class);
        bind(PlacesController.class).in(Singleton.class);
    }
}
