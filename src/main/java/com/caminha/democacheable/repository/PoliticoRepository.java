package com.caminha.democacheable.repository;

import com.caminha.democacheable.model.Politico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliticoRepository extends JpaRepository<Politico, Long> {}
