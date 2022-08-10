package com.cwi.challenge.repository;

import com.cwi.challenge.model.Voting;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VotingRepository extends PagingAndSortingRepository<Voting, Long> {
}
