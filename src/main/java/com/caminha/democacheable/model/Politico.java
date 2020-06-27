package com.caminha.democacheable.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Politico {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String partido;
}
