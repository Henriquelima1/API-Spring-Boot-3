package com.br.demo.carro;

import com.br.demo.especificacao.DadosEspecificacao;
import com.br.demo.especificacao.Especificacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "carros")
@Entity(name = "Carro")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Carro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String montadora;
    private String placa;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @Embedded
    private Especificacao especificacao;

    private Boolean ativo;

    public Carro(DadosCadastroCarro dados) {
        this.nome = dados.nome();
        this.montadora = dados.montadora();
        this.placa = dados.placa();
        this.tipo = dados.tipo();
        this.especificacao =new Especificacao(dados.especificacao());
        this.ativo = true;
    }

    public void atualizarInformacao(DadosAtualizaCarro dados) {
        if(dados.placa() != null){
            this.placa= dados.placa();
        }
        if(dados.especificacao() != null){
            this.especificacao.atualizarInformacao(dados.especificacao());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
