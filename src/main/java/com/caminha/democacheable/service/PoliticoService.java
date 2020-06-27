package com.caminha.democacheable.service;

import com.caminha.democacheable.model.Politico;
import com.caminha.democacheable.repository.PoliticoRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoliticoService {

    PoliticoRepository politicoRepository;

    public PoliticoService(PoliticoRepository politicoRepository) {
        this.politicoRepository = politicoRepository;
    }

    @Cacheable("politicos")
    public List<Politico> getPoliticos() throws InterruptedException {
        Thread.sleep(3000);
        return politicoRepository.findAll();
    }
}
