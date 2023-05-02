package com.br.demo.carro;

import com.br.demo.especificacao.DadosAtualizaEspecificacao;
import com.br.demo.especificacao.DadosEspecificacao;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizaCarro(
        @NotNull
        Long id,
        String placa,
        DadosAtualizaEspecificacao especificacao) {
}
