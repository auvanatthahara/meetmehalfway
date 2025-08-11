package com.atthahara.meetmehalfway.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CoordinateRequest {
    @NotNull
    private Double latitude;

    @NotNull
    private Double longitude;
}
