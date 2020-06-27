package com.caminha.democacheable.controller;

import com.caminha.democacheable.model.Politico;
import com.caminha.democacheable.repository.PoliticoRepository;
import com.caminha.democacheable.service.PoliticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping(value = "/api/politicos")
public class PoliticoController {

    @Autowired
    PoliticoService politicoService;

    @GetMapping
    public List<Politico> getAll() throws InterruptedException {

        Instant start = Instant.now();
        List<Politico> politicos = politicoService.getPoliticos();
        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println("time executing = " + timeElapsed);

        return politicos;
    }
}
