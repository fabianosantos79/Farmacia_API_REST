package br.com.api.farmacia.apirest.entities;

import jakarta.persistence.*;

@Entity
@Table(name="fabricantes")
public class Fabricante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
}
