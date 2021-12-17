public class Resposta {
    private final int intIndex;
    private final String strOption;
    private double dblCotacao;

    Resposta(int intIndex, String strOption){
        this.intIndex = intIndex;
        this.strOption = strOption;
    }

    public String getStrOption() {return strOption;}

    public double getDblCotacao() {return dblCotacao;}

    public void setDblCotacao(double dblCotacao) {this.dblCotacao = dblCotacao;}

    @Override
    public String toString() {return ("\tResposta " + this.intIndex + ")\t" + "\t\tOpção " + this.strOption+ "\t\t\tCotação " + this.dblCotacao);}
}
