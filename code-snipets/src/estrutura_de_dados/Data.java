package estrutura_de_dados;

import java.util.ArrayList;

import constructor_com_argumentos.Pessoa;

public class Data {

    /**
     * ArrayList é bem melhor de tratar os dados que uma array ou lista comum,
     * portanto, indico que utilize essa estrutura para armazenar os dados desse
     * projeto.
     * 
     * Foi colocado como final a fim de garantir que não seja possível alterar a
     * estrutura de dados.
     */
    private final static ArrayList<Pessoa> pessoas = new ArrayList<>();

    /**
     * Construtor privado para garantir encapsulamento.
     */
    private Data() {
    }

    public static ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
}
