package com.atthahara.meetmehalfway.dto;

import java.util.List;

@Data
public class MidpointResponse {
    private Double midpointLatitude;
    private Double midpointLongitude;
    private List<Place> nearbyPlaces;
}
