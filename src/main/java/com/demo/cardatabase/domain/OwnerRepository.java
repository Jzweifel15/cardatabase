package com.demo.cardatabase.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface OwnerRepository extends PagingAndSortingRepository<Owner, Long> {
    
}
