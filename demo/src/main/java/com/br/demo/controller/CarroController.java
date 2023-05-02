package com.br.demo.controller;

import com.br.demo.carro.*;
import com.br.demo.especificacao.Especificacao;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("carros")
public class CarroController {

    @Autowired
    private CarroRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCarro dados){
        repository.save(new Carro(dados));
    }

//    @GetMapping
//    public List<DadosListagemCarro> listarCarros(){
//        return repository.findAll(paginacao).stream().map(DadosListagemCarro::new).toList();
//    }
   /* @GetMapping
    public Page<DadosListagemCarro> listarCarros(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
     return repository.findAll(paginacao).map(DadosListagemCarro::new);
    }*/
    @GetMapping
    public Page<DadosListagemCarro> listarCarros(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemCarro::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizaCarro dados) {
        var carro = repository.getReferenceById(dados.id());
        carro.atualizarInformacao(dados);
    }/*
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }*/
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        var carro = repository.getReferenceById(id);
        carro.excluir();
    }

}
