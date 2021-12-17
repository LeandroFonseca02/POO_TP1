/**
 * A classe Turma representa um conjunto de Alunos.
 */
import Exceptions.CotacaoPerguntaAbertaMismatchException;
import Exceptions.RespostaPerguntaFechadaMismatchException;
import Exceptions.TipoPerguntaMismatchException;
import java.util.Scanner;

public class Turma {

    private final int intNumAlunos;
    private final Aluno[] objAlunos;

    Turma(int intNumAlunos){
        this.intNumAlunos = intNumAlunos;
        this.objAlunos = new Aluno[this.intNumAlunos];
    }

    /**
     * Devolve o número de alunos da turma
     * @return inteiro do número de alunos
     */
    public int getIntNumAlunos() {return this.intNumAlunos;}

    /**
     * Recebe o input das respostas dos alunos
     * @param objScanner Scanner do ficheiro de input
     * @param intNumPerguntas Numero de perguntas do teste
     */
    public void getObjAlunosInput(Scanner objScanner, int intNumPerguntas){
        for (int i = 0; i < this.intNumAlunos; i++){
            this.objAlunos[i] = new Aluno(objScanner.next(),intNumPerguntas);
            for(int j = 0; j < intNumPerguntas; j++)
                this.objAlunos[i].setObjRespostaByIndex(j,new Resposta(objScanner.nextInt(),objScanner.next()));
        }
    }

    /**
     * Coloca a cotação das respostas dos alunos
     * @param objTeste Teste onde as perguntas e as cotações estão guardadas
     * @throws RespostaPerguntaFechadaMismatchException Lançada quando a opção do aluno não pertence ás opções do teste
     * @throws CotacaoPerguntaAbertaMismatchException Lançada quando a cotação da pergunta aberta não pertence ao intervalo da cotação máxima
     * @throws TipoPerguntaMismatchException Lançada quando a pergunta do Teste não é nem Aberta nem Fechada
     */
    public void setObjAlunosPerguntasCotacao(Teste objTeste) throws RespostaPerguntaFechadaMismatchException, CotacaoPerguntaAbertaMismatchException, TipoPerguntaMismatchException {
        for(int i = 0; i < this.intNumAlunos; i++)
            this.objAlunos[i].setCotacaoPerguntas(objTeste);
    }

    /**
     * Coloca a cotação final do teste dos alunos
     */
    public void setObjAlunosCotacaoteste(){
        for(int i = 0; i < this.getIntNumAlunos(); i++)
            this.objAlunos[i].setCotacaoTeste();
    }

    /**
     * Utiliza o algoritmo de ordenação BubbleSort para ordenar os alunos alfabeticamente e por nota decrescente
     */
    public void sortObjAlunosByCotacao(){
        Aluno objAlunoTemp;
        ComparatorAlunos objComparatorAlunos = new ComparatorAlunos();
        for(int i = 0; i < this.getIntNumAlunos(); i++){
            for(int j = 1; j < this.getIntNumAlunos() - i; j++){
                if(objComparatorAlunos.compare(this.objAlunos[j-1],this.objAlunos[j]) < 0){
                    objAlunoTemp = this.objAlunos[j-1];
                    this.objAlunos[j-1] = this.objAlunos[j];
                    this.objAlunos[j] = objAlunoTemp;
                }
            }
        }
    }

    /**
     * Imprime na consolo as informações de todos os Alunos da Turma
     */
    public void printObjAlunos(){
        for(int i = 0; i < this.getIntNumAlunos(); i++)
            System.out.println(this.objAlunos[i]);
    }

    /**
     * Método para imprimir informações sobre a Turma
     * @return String a dizer a quantidade de alunos da Turma
     */
    @Override
    public String toString(){return ("\nTurma com " + this.intNumAlunos + " alunos. ");}

}
