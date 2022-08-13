package com.cwi.challenge.repository;

import com.cwi.challenge.model.Voting;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotingRepository extends PagingAndSortingRepository<Voting, Long> {
}
