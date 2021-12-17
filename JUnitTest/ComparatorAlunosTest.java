import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorAlunosTest {

    ComparatorAlunos objComparatorAlunosTeste = new ComparatorAlunos();

    @Test
    void compare() {
        Aluno objAlunoTeste1 = new Aluno("João",2);
        Aluno objAlunoTeste2 = new Aluno("Ana",2);
        assertEquals(-9,objComparatorAlunosTeste.compare(objAlunoTeste1,objAlunoTeste2));
        objAlunoTeste1.setDblCotacaoTeste(1.4);
        objAlunoTeste2.setDblCotacaoTeste(0.5);
        assertEquals(1,objComparatorAlunosTeste.compare(objAlunoTeste1,objAlunoTeste2));
        objAlunoTeste1 = new Aluno("Ana",2);
        objAlunoTeste1.setDblCotacaoTeste(1.4);
        assertEquals(1,objComparatorAlunosTeste.compare(objAlunoTeste1,objAlunoTeste2));
    }
}