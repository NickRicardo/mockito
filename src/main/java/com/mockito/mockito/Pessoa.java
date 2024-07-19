package com.mockito.mockito;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;

    private String document;

    private LocalDate nascimento;

    private DadosLocalizacao endereco;

    public Pessoa(String nome, String document, LocalDate nascimento) {
        this.nome = nome;
        this.document = document;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDocument() {
        return document;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public DadosLocalizacao getEndereco() {
        return endereco;
    }

    public void adicionaDadosDeEndereco(DadosLocalizacao dadosLocalizacao) {
        this.endereco = dadosLocalizacao;
    }

}
