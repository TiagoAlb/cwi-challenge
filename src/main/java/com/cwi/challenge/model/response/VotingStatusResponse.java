package com.cwi.challenge.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class VotingStatusResponse {

    private Long id;

    @JsonProperty("topic_id")
    private Long topicId;

    @JsonProperty("start_date")
    private LocalDateTime startDate;

    @JsonProperty("end_date")
    private LocalDateTime endDate;

    @JsonProperty("favorable_votes")
    private Integer favorableVotes;

    @JsonProperty("unfavorable_votes")
    private Integer unfavorableVotes;

    private boolean open;

    private int minutes;
}