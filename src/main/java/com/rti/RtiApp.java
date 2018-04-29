package com.rti;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.rti.module.PlacesModule;

public class RtiApp {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new PlacesModule());
//        injector.getInstance()
    }
}
