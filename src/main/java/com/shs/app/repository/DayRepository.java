package com.shs.app.repository;

import com.shs.app.entity.Day;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DayRepository extends PagingAndSortingRepository<Day,Long> {
    Day findByName(String name);
}
