package br.com.arthur;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricaq;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> inscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(String nome, String descricaq) {
        this.nome = nome;
        this.descricaq = descricaq;

    }

    public String getNome() {
        return nome;
    }


    public String getDescricaq() {
        return descricaq;
    }


    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getInscritos() {
        return inscritos;
    }

    public void setInscritos(Set<Dev> inscritos) {
        this.inscritos = inscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) object;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricaq, bootcamp.descricaq) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(inscritos, bootcamp.inscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricaq, dataInicial, dataFinal, inscritos, conteudos);
    }
}
