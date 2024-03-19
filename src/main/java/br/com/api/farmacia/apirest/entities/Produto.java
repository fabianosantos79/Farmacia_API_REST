package br.com.api.farmacia.apirest.entities;

import jakarta.persistence.*;

@Entity
@Table(name="produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    @ManyToOne
    private Fabricante fabricante;
}
