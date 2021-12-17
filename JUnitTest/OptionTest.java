import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptionTest {

    Option objOptionTeste = new Option("A","TesteA",1.5);

    @Test
    void getStrIndex() {
        assertEquals("A",objOptionTeste.getStrIndex());
    }

    @Test
    void getDblCotacao() {
        assertEquals(1.5,objOptionTeste.getDblCotacao());
    }

    @Test
    void testToString() {
        assertEquals("\nOpção A)\tTesteA\t\tCotação 1.5",objOptionTeste.toString());
    }
}