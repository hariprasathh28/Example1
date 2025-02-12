package com.StudentResults.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentResults.entity.Results;

public interface ResultsRepository extends JpaRepository<Results,Integer>{

}
