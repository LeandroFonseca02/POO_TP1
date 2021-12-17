import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerguntaFechadaTest {

    PerguntaFechada objPerguntaFechadaTeste = new PerguntaFechada(1,"Teste");

    @Test
    void getObjOptionByIndex() {
        Option[] objOptiosTeste = new Option[4];
        objOptiosTeste[0] = new Option("A","TesteA",-0.5);
        objOptiosTeste[1] = new Option("B","TesteB",-0.5);
        objOptiosTeste[2] = new Option("C","TesteC",2.5);
        objOptiosTeste[3] = new Option("D","TesteD",-0.5);
        objPerguntaFechadaTeste.setObjOptionByIndex(0,objOptiosTeste[0]);
        objPerguntaFechadaTeste.setObjOptionByIndex(1,objOptiosTeste[1]);
        objPerguntaFechadaTeste.setObjOptionByIndex(2,objOptiosTeste[2]);
        objPerguntaFechadaTeste.setObjOptionByIndex(3,objOptiosTeste[3]);
        assertEquals(objOptiosTeste[1],objPerguntaFechadaTeste.getObjOptionByIndex(1));
    }

    @Test
    void setObjOptionByIndex() {
        Option[] objOptiosTeste = new Option[4];
        objOptiosTeste[0] = new Option("A","TesteA",-0.5);
        objOptiosTeste[1] = new Option("B","TesteB",-0.5);
        objOptiosTeste[2] = new Option("C","TesteC",2.5);
        objOptiosTeste[3] = new Option("D","TesteD",-0.5);
        objPerguntaFechadaTeste.setObjOptionByIndex(0,objOptiosTeste[0]);
        objPerguntaFechadaTeste.setObjOptionByIndex(1,objOptiosTeste[1]);
        objPerguntaFechadaTeste.setObjOptionByIndex(2,objOptiosTeste[2]);
        objPerguntaFechadaTeste.setObjOptionByIndex(3,objOptiosTeste[3]);
        assertEquals(objOptiosTeste[1],objPerguntaFechadaTeste.getObjOptionByIndex(1));
        objPerguntaFechadaTeste.setObjOptionByIndex(1,objOptiosTeste[3]);
        assertEquals(objOptiosTeste[3],objPerguntaFechadaTeste.getObjOptionByIndex(1));
    }

    @Test
    void testToString() {
        Option[] objOptiosTeste = new Option[4];
        objOptiosTeste[0] = new Option("A","TesteA",-0.5);
        objOptiosTeste[1] = new Option("B","TesteB",-0.5);
        objOptiosTeste[2] = new Option("C","TesteC",2.5);
        objOptiosTeste[3] = new Option("D","TesteD",-0.5);
        objPerguntaFechadaTeste.setObjOptionByIndex(0,objOptiosTeste[0]);
        objPerguntaFechadaTeste.setObjOptionByIndex(1,objOptiosTeste[1]);
        objPerguntaFechadaTeste.setObjOptionByIndex(2,objOptiosTeste[2]);
        objPerguntaFechadaTeste.setObjOptionByIndex(3,objOptiosTeste[3]);
        assertEquals("\nPergunta " + objPerguntaFechadaTeste.intPerguntaID + " tipo fechada " + " string " + objPerguntaFechadaTeste.strPergunta + " :" + objPerguntaFechadaTeste.getObjOptionByIndex(0) + objPerguntaFechadaTeste.getObjOptionByIndex(1) + objPerguntaFechadaTeste.getObjOptionByIndex(2) + objPerguntaFechadaTeste.getObjOptionByIndex(3), objPerguntaFechadaTeste.toString());
    }
}