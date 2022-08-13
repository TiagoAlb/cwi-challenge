package com.cwi.challenge.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Associate associate;

    @Column(columnDefinition = "boolean default false")
    private boolean accepted;

    @CreationTimestamp
    private LocalDateTime creationDate;
}