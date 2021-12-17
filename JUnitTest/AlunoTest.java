import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    Aluno objAlunoTeste = new Aluno("André",3);

    @Test
    void getDblCotacaoTeste() {
        assertEquals(0,objAlunoTeste.getDblCotacaoTeste());
        objAlunoTeste.setDblCotacaoTeste(4.2);
        assertEquals(4.2,objAlunoTeste.getDblCotacaoTeste());
    }

    @Test
    void getStrNome() {
        assertEquals("André",objAlunoTeste.getStrNome());
    }

    @Test
    void setDblCotacaoTeste() {
        assertEquals(0,objAlunoTeste.getDblCotacaoTeste());
        objAlunoTeste.setDblCotacaoTeste(4.2);
        assertEquals(4.2,objAlunoTeste.getDblCotacaoTeste());
    }

    @Test
    void testToString() {
        assertEquals("\nAluno André \t\tCotação Teste: 0.0", objAlunoTeste.toString());
        objAlunoTeste.setDblCotacaoTeste(4.2);
        assertEquals("\nAluno André \t\tCotação Teste: 4.2", objAlunoTeste.toString());
    }
}