package com.cwi.challenge.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Voting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Topic topic;

    @CreationTimestamp
    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @JsonIgnore
    @OneToMany(orphanRemoval = true)
    private List<Vote> votes;

    @Column(columnDefinition = "boolean default true")
    private boolean open;

    @Column(columnDefinition = "integer default 1")
    private int minutes = 1;
}