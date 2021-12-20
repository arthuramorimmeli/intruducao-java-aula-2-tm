package models;

public class Disciplina {

    private String name;
    private Integer cargaHoraria;

    public Disciplina(String name, Integer cargaHoraria) {
        this.name = name;
        this.cargaHoraria = cargaHoraria;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return  "\n\nname='" + name + '\'' +
                ", \ncargaHoraria=" + cargaHoraria;
    }
}
