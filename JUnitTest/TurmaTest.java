import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    Turma objTurmaTeste = new Turma(2);


    @Test
    void getIntNumAlunos() {
        assertEquals(2,objTurmaTeste.getIntNumAlunos());
    }

    @Test
    void sortObjAlunosByCotacao() {
        Aluno[] objAlunoArray = new Aluno[2];
        objAlunoArray[0] = new Aluno("Beatriz", 2);
        objAlunoArray[0].setDblCotacaoTeste(0.5);
        objAlunoArray[1] = new Aluno("Carina", 2);
        objAlunoArray[1].setDblCotacaoTeste(2.5);
        objTurmaTeste.setObjAlunos(objAlunoArray);
        objTurmaTeste.sortObjAlunosByCotacao();
        assertEquals("Carina", objAlunoArray[0].getStrNome());
        assertEquals("Beatriz", objAlunoArray[1].getStrNome());

    }

    @Test
    void printObjAlunos() {
        Aluno[] objArrayAlunos = new Aluno[1];
        objArrayAlunos[0] = new Aluno("Maria",2);
        assertEquals("\nAluno Maria \t\tCotação Teste: 0.0", objArrayAlunos[0].toString() );
    }

    @Test
    void testToString() {
        assertEquals("\nTurma com 2 alunos. ", objTurmaTeste.toString());
    }
}