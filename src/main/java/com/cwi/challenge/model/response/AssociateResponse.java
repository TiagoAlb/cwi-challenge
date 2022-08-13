package com.cwi.challenge.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class AssociateResponse {

    private Long id;

    @JsonProperty("social_number")
    private String socialNumber;
    private String name;
    private String email;

    @JsonProperty("social_number")
    private LocalDateTime creationDate;
}