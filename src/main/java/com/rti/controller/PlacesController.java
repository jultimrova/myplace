package com.rti.controller;

import com.google.gson.Gson;
import com.rti.model.dto.PlacesRequest;
import com.rti.service.PlacesClient;
import com.rti.util.JsonUtil;

import javax.inject.Inject;
import javax.inject.Singleton;

import static spark.Spark.get;
import static spark.Spark.post;

@Singleton
public class PlacesController implements SparkController {

    private PlacesClient client;

    @Override
    public void init() {
        post("/places", (req, res) -> {
            PlacesRequest placesRequest = new Gson().fromJson(req.body(), PlacesRequest.class);
            return client.create(placesRequest);
        }, JsonUtil.json());

        get("/places/:uuid", (req, res) -> client.get(req.params(":uuid")), JsonUtil.json());
    }

    @Inject
    public void setClient(PlacesClient client) {
        this.client = client;
    }
}
