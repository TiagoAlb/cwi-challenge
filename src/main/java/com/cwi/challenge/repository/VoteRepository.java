package com.cwi.challenge.repository;

import com.cwi.challenge.model.Topic;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VoteRepository extends PagingAndSortingRepository<Topic, Long> {
}
