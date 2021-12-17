import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RespostaTest {

    Resposta objRespostaTeste = new Resposta(1,"teste");

    @Test
    void getStrOption() {
        assertEquals("teste",objRespostaTeste.getStrOption());
    }

    @Test
    void getDblCotacao() {
        assertEquals(0,objRespostaTeste.getDblCotacao());
        objRespostaTeste.setDblCotacao(1.5);
        assertEquals(1.5,objRespostaTeste.getDblCotacao());
    }

    @Test
    void setDblCotacao() {
        assertEquals(0,objRespostaTeste.getDblCotacao());
        objRespostaTeste.setDblCotacao(1.5);
        assertEquals(1.5,objRespostaTeste.getDblCotacao());
    }

    @Test
    void testToString() {
        assertEquals("\tResposta 1)\t\t\tOpção teste\t\t\tCotação 0.0",objRespostaTeste.toString());
        objRespostaTeste.setDblCotacao(1.5);
        assertEquals("\tResposta 1)\t\t\tOpção teste\t\t\tCotação 1.5",objRespostaTeste.toString());

    }
}