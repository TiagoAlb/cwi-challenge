package com.cwi.challenge.repository;

import com.cwi.challenge.model.Associate;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociateRepository extends PagingAndSortingRepository<Associate, Long> {
}
