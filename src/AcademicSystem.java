import models.Disciplina;
import models.Estudante;
import models.Turma;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AcademicSystem {

    private Map<String, Estudante> estudanteMap = new HashMap<>();
    private Map<String, Disciplina> disciplinaMap = new HashMap<>();
    private Map<String, Turma> turmaMap = new HashMap<>();

    public void runProgram() {
        initEstudantes();
        initDisciplinas();
        initTurmas();
        addDisciplinasEAlunosEmTurmas();
        showTurmas();
    }

    private void initEstudantes() {
        LocalDate dataNascimento = LocalDate.parse("1999-02-01");
        Estudante arthur = new Estudante("arthur", dataNascimento, 19191919L);
        Estudante gabriela = new Estudante("gabriela", dataNascimento, 19191919L);
        Estudante marina = new Estudante("maria", dataNascimento, 19191919L);

        estudanteMap.put(arthur.getNome(), arthur);
        estudanteMap.put(gabriela.getNome(), gabriela);
        estudanteMap.put(marina.getNome(), marina);
    }

    private void initDisciplinas() {
        Disciplina matematica = new Disciplina("Matematica", 140);
        Disciplina portugues = new Disciplina("portugues", 220);
        Disciplina geografia = new Disciplina("geografia", 160);
        Disciplina ingles = new Disciplina("ingles", 70);

        disciplinaMap.put(matematica.getName(), matematica);
        disciplinaMap.put(portugues.getName(), matematica);
        disciplinaMap.put(geografia.getName(), geografia);
        disciplinaMap.put(ingles.getName(), ingles);
    }

    private void initTurmas() {
        Turma turma1 = new Turma(9, "9A");
        Turma turma2 = new Turma(7, "7B");
        Turma turma3 = new Turma(8, "8C");

        turmaMap.put(turma1.getCodigo(), turma1);
        turmaMap.put(turma2.getCodigo(), turma2);
        turmaMap.put(turma3.getCodigo(), turma3);
    }

    private void addDisciplinasEAlunosEmTurmas() {
        Turma turma1 = turmaMap.get("9A");
        turma1.getDisciplinas().add(disciplinaMap.get("Matematica"));
        turma1.getDisciplinas().add(disciplinaMap.get("ingles"));

        Turma turma2 = turmaMap.get("7B");
        turma2.getDisciplinas().add(disciplinaMap.get("ingles"));
        turma2.getDisciplinas().add(disciplinaMap.get("portugues"));
        turma2.getDisciplinas().add(disciplinaMap.get("geografia"));

        Turma turma3 = turmaMap.get("8C");
        turma3.getDisciplinas().add(disciplinaMap.get("ingles"));
        turma3.getDisciplinas().add(disciplinaMap.get("portugues"));
        turma3.getDisciplinas().add(disciplinaMap.get("geografia"));
        turma3.getDisciplinas().add(disciplinaMap.get("Matematica"));

        Estudante arthur = estudanteMap.get("arthur");
        arthur.setSerie(turma1.getSerie());
        turma1.getEstudantes().add(arthur);

        Estudante gabriela = estudanteMap.get("gabriela");
        gabriela.setSerie(turma2.getSerie());
        turma2.getEstudantes().add(gabriela);

        Estudante maria = estudanteMap.get("maria");
        maria.setSerie(turma3.getSerie());
        turma3.getEstudantes().add(maria);
    }

    private void showTurmas() {
        turmaMap.values().forEach(turma -> {
            System.out.println(turma.toString());
        });
    }
}
