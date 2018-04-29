package com.rti.service;

import com.rti.model.Place;

public interface TokenGenerator<T> {
    T generate(T place);
}
