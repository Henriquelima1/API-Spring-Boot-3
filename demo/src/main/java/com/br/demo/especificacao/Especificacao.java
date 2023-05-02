package com.br.demo.especificacao;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Especificacao {

    private String cor;
    private Integer cv;
    private Integer torque;
    private Integer peso;
    private String origem;
    private Integer ano;
    private String estado;

    public Especificacao(DadosEspecificacao dado) {
        this.cor = dado.cor();
        this.cv = dado.cv();
        this.torque = dado.torque();
        this.peso = dado.peso();
        this.origem = dado.origem();
        this.ano = dado.ano();
        this.estado = dado.estado();
    }

    public void atualizarInformacao(DadosAtualizaEspecificacao dados) {
        if(dados.cor() != null){
            this.cor = dados.cor();
        }
        if(dados.cv() != null){
            this.cv = dados.cv();
        }
        if(dados.torque() != null){
            this.torque = dados.torque();
        }
        if(dados.peso() != null){
            this.peso = dados.peso();
        }
        if(dados.estado() != null){
            this.estado = dados.estado();
        }
    }
}
