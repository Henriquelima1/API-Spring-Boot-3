package com.br.demo.carro;

import com.br.demo.especificacao.Especificacao;

public record DadosListagemCarro(Long id, String nome, String montadora, String placa, Tipo tipo, Especificacao especificacao) {

    public DadosListagemCarro(Carro carro){
        this(carro.getId(), carro.getNome(), carro.getMontadora(), carro.getPlaca(), carro.getTipo(), carro.getEspecificacao());
    }
}
