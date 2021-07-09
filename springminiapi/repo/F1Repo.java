package com.natwest.springminiapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natwest.springminiapi.domain.Formula1;

@Repository
public interface F1Repo extends JpaRepository<Formula1, Long> {

}
