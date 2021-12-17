/**
 * Classe ComparatorAlunos é um comparador de Objetos Aluno e implementa a interface Comparator
 */

import java.util.Comparator;

public class ComparatorAlunos implements Comparator<Aluno> {
    /**
     * Compara dois Alunos e devolve um inteiro que caso seja positivo o 1º Aluno deve ser ordenado primeiro que o outro Aluno e se for negativo deve ser ordenado depois
     * @param objAluno1 Primeiro Aluno para ser comparado
     * @param objAluno2 Segundo Aluno para ser comparado
     * @return inteiro com o valor se o Primeiro Aluno deve ser ou não ordenado primeiro
     */
    public int compare(Aluno objAluno1, Aluno objAluno2){
        if(objAluno1.getDblCotacaoTeste() > objAluno2.getDblCotacaoTeste()) return 1;
        else if(objAluno1.getDblCotacaoTeste() < objAluno2.getDblCotacaoTeste()) return -1;
        else return -objAluno1.getStrNome().compareTo(objAluno2.getStrNome());
    }
}
