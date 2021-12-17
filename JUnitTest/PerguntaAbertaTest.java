import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerguntaAbertaTest {

    PerguntaAberta objPerguntaAbertaTeste = new PerguntaAberta(1,"Teste",5.1);

    @Test
    void getDblCotacao() {
        assertEquals(5.1,objPerguntaAbertaTeste.getDblCotacao());
    }

    @Test
    void testToString() {
        assertEquals("\nPergunta 1 tipo aberta string Teste cotação máxima 5.1",objPerguntaAbertaTeste.toString());
    }
}