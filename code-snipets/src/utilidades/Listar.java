package utilidades;

import java.util.ArrayList;

import constructor_com_argumentos.Pessoa;
import estrutura_de_dados.Data;

public class Listar {

    /**
     * Construtor privado
     */
    private Listar() {
    }

    /**
     * Método static para poder ser utilizado sem instanciar um objeto de lista
     */
    public static void pessoas() {
        System.out.println("------------- > Lista de Pessoas Cadastradas < ------------");
        if (Data.getPessoas().isEmpty()) {
            System.out.println("\tNão há nenhuma pessoa cadastrada.");
        } else {
            for (Pessoa pessoa : Data.getPessoas()) {
                System.out.println("\t" + pessoa.toString());
            }
        }

        System.out.println("---------------------------------------------------------");
    }
}
