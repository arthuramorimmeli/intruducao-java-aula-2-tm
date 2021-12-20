package models;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private Integer serie;
    private String codigo;
    private List<Estudante> estudantes = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Turma(Integer serie, String codigo) {
        this.serie = serie;
        this.codigo = codigo;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "\n\nTurma:" +
                "\nserie=" + serie +
                ", \ncodigo='" + codigo + '\'' +
                ", \nestudantes=" + estudantes +
                ", \n\ndisciplinas=" + disciplinas;
    }
}
