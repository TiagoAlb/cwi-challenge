package com.cwi.challenge.repository;

import com.cwi.challenge.model.Vote;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VoteRepository extends PagingAndSortingRepository<Vote, Long> {
}
