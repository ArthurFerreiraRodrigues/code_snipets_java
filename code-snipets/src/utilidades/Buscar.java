package utilidades;

import constructor_com_argumentos.Pessoa;
import estrutura_de_dados.Data;

public class Buscar {

    /**
     * Construtor privado
     */
    private Buscar() {
    }

    /**
     * Imprime uma lista de pessoas que tem, em alguma parte de seu nome, a palavra
     * passada como parâmentro.
     * 
     * Método static para poder ser utilizado sem instanciar um objeto de lista
     */
    public static void pessoas(String busca) {
        int cont = 0;
        System.out.printf("------------- > Resultado da Busca por: '%s' < ------------\n", busca);
        for (Pessoa pessoa : Data.getPessoas()) {
            if (pessoa.getNome().contains(busca)) {
                System.out.println("\t" + pessoa.toString());
                cont++;

            }
        }
        if (cont == 0) {
            System.out.println("\tNão foi possível encontrar nenhuma pessoa com esse nome.");
        }
        System.out.println("---------------------------------------------------------");

    }

    /**
     * Retorna o Índice da primeira pessoa que tem alguma parte de seu nome, a
     * palavra passada como parâmentro.
     * 
     * Retorna -1 caso não encontre nenhuma correspondencia
     * 
     * Método static para poder ser utilizado sem instanciar um objeto de lista
     */
    public static int pessoasIdx(String busca) {
        int idx = -1;
        for (int i = 0; i < Data.getPessoas().size(); i++) {
            if (Data.getPessoas().get(i).getNome().contains(busca)) {
                idx = i;
                break;

            }
        }
        return idx;
    }
}
