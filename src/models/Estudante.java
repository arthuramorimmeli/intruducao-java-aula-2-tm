package models;

import java.time.LocalDate;

public class Estudante {

    private String nome;
    private LocalDate dataNascimento;
    private Long matricula;
    private Integer serie;

    public Estudante(String nome, LocalDate dataNascimento, Long matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return  "\n\nnome='" + nome + '\'' +
                ", \ndataNascimento=" + dataNascimento +
                ", \nmatricula=" + matricula +
                ", \nserie=" + serie;
    }
}
