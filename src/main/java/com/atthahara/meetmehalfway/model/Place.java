package com.atthahara.meetmehalfway.model;

import lombok.Data;

@Data
public class Place {
    private String name;
    private String address;
    private Double latitude;
    private Double longitude;
    private Double rating;
    private String googleMapsUrl;
}