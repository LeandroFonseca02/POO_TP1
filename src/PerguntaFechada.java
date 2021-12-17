/**
 * Classe que representa uma Pergunta com várias opções de resposta extendendo a Classe Abstrata Pergunta
 */
public class PerguntaFechada extends Pergunta{
    private final Option objOptions[];

    PerguntaFechada(int intPerguntaId, String strPergunta){
        this.intPerguntaID = intPerguntaId;
        this.strPergunta = strPergunta;
        this.objOptions = new Option[4];
    }

    /**
     * Devolve a opção correspondente ao index inserido
     * @param intIndex inteiro respetivo ao index no array de Opções
     * @return objeto Option igual á opção selecionada pelo index
     */
    public Option getObjOptionByIndex(int intIndex) {return this.objOptions[intIndex];}

    /**
     * Recebe um index e uma opção e altera a opção nesse index para a opção recebida
     * @param intIndex inteiro referente ao index do array de opções
     * @param option objeto Option para alterar no index recebido
     */
    public void setObjOptionByIndex(int intIndex, Option option) {this.objOptions[intIndex] = option;}

    /**
     * Método para imprimir informações sobre a Pergunta Fechada
     * @return String com as informações da Pergunta Fechada
     */
    @Override
    public String toString(){return ("\nPergunta " + this.intPerguntaID + " tipo fechada " + " string " + this.strPergunta + " :" + this.objOptions[0] + this.objOptions[1] + this.objOptions[2] + this.objOptions[3]);}

}
