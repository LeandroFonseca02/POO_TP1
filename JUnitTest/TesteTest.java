import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteTest {

    Teste objTeste = new Teste(2);

    @Test
    void getIntNumPerguntas() {
        assertEquals(2,objTeste.getIntNumPerguntas());
    }

}