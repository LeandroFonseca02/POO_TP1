import java.util.Scanner;
import Exceptions.*;

public class Teste {
    private final int intNumPerguntas;
    private final Pergunta[] objPerguntasTeste;

    Teste(int intNumPerguntas){
        this.intNumPerguntas = intNumPerguntas;
        this.objPerguntasTeste = new Pergunta[this.intNumPerguntas];
    }

    /**
     * Devolve o número de Perguntas de um Teste
     * @return int com o valor do número de perguntas do Teste
     */
    public int getIntNumPerguntas() {return this.intNumPerguntas;}

    /**
     * Devolve a pergunta do Teste respetivamente a um index
     * @param intIndex inteiro para index do array de Perguntas
     * @return Pergunta respetiva ao index do array
     */
    public Pergunta getPerguntasTesteByIndex(int intIndex) {return this.objPerguntasTeste[intIndex];}

    /**
     * Recebe o input das perguntas do teste e inicializa as perguntas do teste no array de Perguntas
     * @param objScanner Scanner referente ao input das perguntas
     * @throws PerguntaIndexMismatchException Lançada quando o index da Pergunta viola as condições de ser inteiro, maior que 0 e sequencial
     * @throws TipoPerguntaMismatchException Lançada quando o tipo de Pergunta não é Aberta ou Fechada
     */
    public void getInputPerguntas(Scanner objScanner) throws PerguntaIndexMismatchException, TipoPerguntaMismatchException{
        for (int i = 0; i < this.intNumPerguntas; i++){
            if(objScanner.nextInt() == i+1){
                switch(objScanner.next()) {
                    case "A":
                        this.objPerguntasTeste[i] = new PerguntaAberta(i + 1, objScanner.nextLine(), objScanner.nextDouble());
                        break;
                    case "F":
                        this.objPerguntasTeste[i] = new PerguntaFechada(i + 1, objScanner.nextLine());
                        for (int j = 0; j < 4; j++)
                            ((PerguntaFechada) this.objPerguntasTeste[i]).setObjOptionByIndex(j,new Option(objScanner.next(), objScanner.next(), objScanner.nextDouble()));
                        break;
                    default:
                        throw new TipoPerguntaMismatchException("");
                }
            }else throw new PerguntaIndexMismatchException("");
        }
    }

}
