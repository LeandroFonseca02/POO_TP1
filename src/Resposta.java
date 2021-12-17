/**
 * Classe para representar a resposta a uma pergunta
 */
public class Resposta {
    private final int intIndex;
    private final String strOption;
    private double dblCotacao;

    Resposta(int intIndex, String strOption){
        this.intIndex = intIndex;
        this.strOption = strOption;
    }

    /**
     * Devolve a resposta dada pelo aluno na pergunta
     * @return string com a respota
     */
    public String getStrOption() {return strOption;}

    /**
     * Devolve a cotacao da resposta
     * @return double com a cotação da resposta
     */
    public double getDblCotacao() {return dblCotacao;}

    /**
     * Coloca a cotação receboda na resposta
     * @param dblCotacao double com a cotação a ser colocada na resposta
     */
    public void setDblCotacao(double dblCotacao) {this.dblCotacao = dblCotacao;}

    /**
     * Método para imprimir informações sobre a Respota
     * @return String com as informações da Resposta
     */
    @Override
    public String toString() {return ("\tResposta " + this.intIndex + ")\t" + "\t\tOpção " + this.strOption+ "\t\t\tCotação " + this.dblCotacao);}
}
