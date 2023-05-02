package com.br.demo.carro;

import com.br.demo.especificacao.DadosEspecificacao;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroCarro(
        @NotBlank
        String nome,
        @NotBlank
        String montadora,
        @NotBlank
        String placa,
        @NotNull
        Tipo tipo,
        @NotNull
        @Valid
        DadosEspecificacao especificacao) {
}
