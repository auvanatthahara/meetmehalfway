package com.atthahara.meetmehalfway.dto;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class MidpointRequest {
    @NotEmpty
    private List<CoordinateRequest> coordinates;
}
