package br.com.api.farmacia.apirest.controllers;

import br.com.api.farmacia.apirest.dtos.DadosCadastroFabricante;
import br.com.api.farmacia.apirest.entities.Fabricante;
import br.com.api.farmacia.apirest.repositories.FabricanteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {

    @Autowired
    private FabricanteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroFabricante dados){
        repository.save(new Fabricante(dados));
//        System.out.println(dados);
    }
}
