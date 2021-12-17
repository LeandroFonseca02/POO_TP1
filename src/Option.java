public class Option {
    private final String strIndex;
    private final String strOption;
    private final double dblCotacao;

    Option(String strIndex, String strOption, double dblCotacao){
        this.strIndex = strIndex;
        this.strOption = strOption;
        this.dblCotacao = dblCotacao;
    }

    /**
     * Devolve a String refente ao index da opção
     * @return string do index da opção
     */
    public String getStrIndex() {return this.strIndex;}

    /**
     * Devolve o double referente á cotação da opção
     * @return double com a cotação da opção
     */
    public double getDblCotacao() {return this.dblCotacao;}

    /**
     * Método para imprimir informações sobre a Opção
     * @return String com as informações da Opção
     */
    @Override
    public String toString() {return ("\nOpção " + this.strIndex + ")\t" + this.strOption + "\t\tCotação " + this.dblCotacao);}
}
