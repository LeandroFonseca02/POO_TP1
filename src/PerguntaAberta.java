/**
 * Classe que representa uma Pergunta com respota livre extendendo a Classe Abstrata Pergunta
 */
public class PerguntaAberta extends Pergunta{
    private final double dblCotacao;

    PerguntaAberta(int intPerguntaId, String strPergunta, double dblCotacao) {
        this.intPerguntaID = intPerguntaId;
        this.strPergunta = strPergunta;
        this.dblCotacao = dblCotacao;
    }

    /**
     * Devolve a cotação máxima da Pergunta Aberta
     * @return double com o valor da cotação máxima da Pergunta Aberta
     */
    public double getDblCotacao() {return this.dblCotacao;}

    /**
     * Método para imprimir informações sobre a Pergunta Aberta
     * @return String com as informações da Pergunta Aberta
     */
    @Override
    public String toString(){return ("\nPergunta " + this.intPerguntaID + " tipo aberta " + " string " + this.strPergunta + " cotação máxima " + this.dblCotacao);}

}
