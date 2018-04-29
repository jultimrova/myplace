package com.rti;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.rti.module.PlacesModule;

import javax.inject.Singleton;

public class MainModule extends AbstractModule {

    @Provides
    @Singleton
    @Named("hello-message")
    public String helloMessage() {
        return "Hello from Places App";
    }

    @Override
    protected void configure() {
        install(new PlacesModule());
    }
}
