package com.caminha.democacheable.controller;

import com.caminha.democacheable.model.Politico;
import com.caminha.democacheable.repository.PoliticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/politicos")
public class PoliticoController {

    @Autowired
    PoliticoRepository politicoRepository;

    @GetMapping
    public List<Politico> getAll() {
        return politicoRepository.findAll();
    }
}
