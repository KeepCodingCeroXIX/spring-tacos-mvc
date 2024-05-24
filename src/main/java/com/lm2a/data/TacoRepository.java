package com.lm2a.data;


import org.springframework.data.repository.PagingAndSortingRepository;


import com.lm2a.model.Taco;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {

}
