/**
 * A classe Aluno representa um aluno com a sua resolução de um Teste
 */

import Exceptions.CotacaoPerguntaAbertaMismatchException;
import Exceptions.RespostaPerguntaFechadaMismatchException;
import Exceptions.TipoPerguntaMismatchException;

public class Aluno {
    private final String strNome;
    private double dblCotacaoTeste;
    private final Resposta[] objRespostas;

    Aluno(String strNome, int intPerguntasTeste){
        this.strNome = strNome;
        this.dblCotacaoTeste = 0;
        this.objRespostas = new Resposta[intPerguntasTeste];
    }

    /**
     * Devolve a cotação do Teste do Aluno
     * @return double da cotação do teste
     */
    public double getDblCotacaoTeste() {return this.dblCotacaoTeste;}

    /**
     * Devolve o nome do Aluno
     * @return String do nome do aluno
     */
    public String getStrNome() {return this.strNome;}

    /**
     * Coloca uma resposta num determinado index do array de Respostas
     * @param intIndex inteiro para index do array
     * @param objResposta Resposta que vai ser colocada no array de Resultados
     */
    public void setObjRespostaByIndex(int intIndex, Resposta objResposta) {this.objRespostas[intIndex] = objResposta;}

    /**
     * Coloca a cotação nas respostas do Aluno ao Teste
     * @param objTeste Teste de onde vão ser avaliadas as respostas
     * @throws RespostaPerguntaFechadaMismatchException Lançada quando a opção selecionada pelo Aluno não pertence ás opções disponiveis no Teste
     * @throws CotacaoPerguntaAbertaMismatchException Lançada quando a cotação a uma Pergunta Aberta não pertence ao intervalo
     * @throws TipoPerguntaMismatchException Lançada quando o Tipo da pergunta do Teste não é Aberta nem Fechada
     */
    public void setCotacaoPerguntas(Teste objTeste) throws RespostaPerguntaFechadaMismatchException,CotacaoPerguntaAbertaMismatchException,TipoPerguntaMismatchException {
        int intFlag = 0;
        for(int i = 0; i < objTeste.getIntNumPerguntas(); i++){
            if(PerguntaFechada.class.isInstance(objTeste.getPerguntasTesteByIndex(i))) {
                for (int j = 0; j < 4; j++) {
                    intFlag = 0;
                    if (this.objRespostas[i].getStrOption().equals("-")) {
                        this.objRespostas[i].setDblCotacao(0);
                    } else if (((PerguntaFechada) objTeste.getPerguntasTesteByIndex(i)).getObjOptionByIndex(j).getStrIndex().equals(this.objRespostas[i].getStrOption())) {
                        this.objRespostas[i].setDblCotacao(((PerguntaFechada) objTeste.getPerguntasTesteByIndex(i)).getObjOptionByIndex(j).getDblCotacao());
                        break;
                    }else{intFlag = 1;}
                }
                if (intFlag != 0){throw new RespostaPerguntaFechadaMismatchException("");}

            } else if(PerguntaAberta.class.isInstance(objTeste.getPerguntasTesteByIndex(i))) {
                if (this.objRespostas[i].getStrOption().equals("-")) {
                    this.objRespostas[i].setDblCotacao(0);
                } else if (((PerguntaAberta) objTeste.getPerguntasTesteByIndex(i)).getDblCotacao() >= Double.parseDouble(this.objRespostas[i].getStrOption()) && Double.parseDouble(this.objRespostas[i].getStrOption()) >= 0) {
                    this.objRespostas[i].setDblCotacao(Double.parseDouble(this.objRespostas[i].getStrOption()));
                } else throw new CotacaoPerguntaAbertaMismatchException("");
            } else throw new TipoPerguntaMismatchException("");
        }
    }

    /**
     * Coloca a Cotação Final do Teste no Aluno
     */
    public void setCotacaoTeste(){
        for(Resposta resposta : this.objRespostas)
            this.dblCotacaoTeste += resposta.getDblCotacao();
    }

    /**
     * Método para imprimir informações sobre o Aluno
     * @return String com as informações do Aluno
     */
    @Override
    public String toString(){return ("\nAluno " + this.strNome + " \t\tCotação Teste: " + this.dblCotacaoTeste);}

}
