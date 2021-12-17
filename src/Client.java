import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import Exceptions.*;

/**
 * <h1>POO_TP1 - Teste Americano</h1>
 * O programa POO_TP1 calcula o resultado de um Teste Americano
 * de vários alunos, lendo os inputs de um ficheiro.
 *
 * @author  Leandro Fonseca
 * @version 1.0
 * @since   12/12/2021
 */

public class Client {

    public static void main(String[] args) {
        try {
            File objFileTeste = new File("./resources/file.txt");
            Scanner objScanner = new Scanner(objFileTeste);
            Teste objTeste = new Teste(objScanner.nextInt());
            objTeste.getInputPerguntas(objScanner);
            Turma objTurma = new Turma(objScanner.nextInt());
            objTurma.getObjAlunosInput(objScanner,objTeste.getIntNumPerguntas());
            objTurma.setObjAlunosPerguntasCotacao(objTeste);
            objTurma.setObjAlunosCotacaoteste();
            objTurma.sortObjAlunosByCotacao();
            objTurma.printObjAlunos();
            objScanner.close();
        }catch (FileNotFoundException fileNotFoundException) {
            System.out.println("O ficheiro que deseja utilizar não existe!");
        }catch (PerguntaIndexMismatchException perguntaIndexMismatchException){
            System.out.println("O número da pergunta está incorreto! Os números das perguntas devem ser inteiros positivos a começar no 1 em sentido ascendente sequencialmente!");
        }catch (TipoPerguntaMismatchException tipoPerguntaMismatchException){
            System.out.println("O tipo de pergunta é inválido! As perguntas apenas podem ser Abertas (A) ou Fechadas (F).");
        }catch (CotacaoPerguntaAbertaMismatchException cotacaoPerguntaAbertaMismatchException){
            System.out.println("A cotação das Respostas ás Perguntas Abertas devem ser maior que 0 e menor que a cotação máxima da pergunta");
        }catch (RespostaPerguntaFechadaMismatchException respostaPerguntaFechadaMismatchException){
            System.out.println("As Respostas das Perguntas Fechadas devem ser iguais ás Opções possíveis!");
        }catch(InputMismatchException inputMismatchException){
            System.out.println("O input inserido não corresponde ao tipo de input esperado!");
        }
    }
}

