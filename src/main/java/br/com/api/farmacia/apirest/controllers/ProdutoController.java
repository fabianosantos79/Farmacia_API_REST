package br.com.api.farmacia.apirest.controllers;

import br.com.api.farmacia.apirest.dtos.DadosCadastroProduto;
import br.com.api.farmacia.apirest.entities.Produto;
import br.com.api.farmacia.apirest.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroProduto dados){
        repository.save(new Produto(dados));
//        System.out.println(dados);
    }

    @GetMapping
    public List<Produto> listar(){
        return repository.findAll();
    }
}
