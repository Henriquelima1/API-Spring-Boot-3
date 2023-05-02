package com.br.demo.especificacao;

import jakarta.validation.constraints.*;

public record DadosEspecificacao(
        @NotBlank
        String cor,
        @NotNull
        @Min(1)
        @Max(9999)
        @Positive
        Integer cv,
        @NotNull
        @Min(1)
        @Max(9999)
        @Positive
        Integer torque,
        @NotNull
        @Min(1)
        @Max(9999)
        @Positive
        Integer peso,
        @NotBlank
        @Pattern(regexp = "\\w{2}")
        String origem,
        @NotNull
        @Min(1908)
        @Positive
        Integer ano,
        @NotBlank
        @Pattern(regexp = "\\w{2}")
        String estado) {



}
