package com.br.demo.especificacao;

import jakarta.validation.constraints.*;

public record DadosAtualizaEspecificacao(
        String cor,
        @Max(9999)
        @Positive
        Integer cv,
        @Max(9999)
        @Positive
        Integer torque,
        @Max(9999)
        @Positive
        Integer peso,
        @Pattern(regexp = "\\w{2}")
        String estado
) {
}
