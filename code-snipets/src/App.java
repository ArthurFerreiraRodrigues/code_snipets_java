import java.util.ArrayList;

import constructor_com_argumentos.Pessoa;
import estrutura_de_dados.Data;
import utilidades.Buscar;
import utilidades.Listar;
import utilidades.Screen;

public class App {
    public static void main(String[] args) throws Exception {
        Screen.clear();

        Pessoa pessoaPadrao = new Pessoa();
        Pessoa pessoaComArgs = new Pessoa("João Kléber", 22, true);

        System.out.println("\n\n>>>Lista antes de adicionar pessoas na ArrayList<<<");
        Listar.pessoas();
        Screen.pressEnterCont();
        Screen.clear();

        Data.getPessoas().add(pessoaPadrao);
        Data.getPessoas().add(pessoaComArgs);

        // Listando Pessoas
        System.out.println("\n\n>>>Lista depois de adicionar pessoas na ArrayList<<<");
        Listar.pessoas();
        Screen.pressEnterCont();
        Screen.clear();

        // Buscando apenas por 'Jo' para evidenciar que a busca funciona com qualquer
        // parte do nome
        System.out.println("\n\n>>>Realizando Busca<<<");
        Buscar.pessoas("Jo");
        Screen.pressEnterCont();
        Screen.clear();

        // Removendo pessoas de uma arraylist
        Data.getPessoas().remove(Buscar.pessoasIdx("João"));
        System.out.println("\n\n>>>Lista depois de remover João<<<");
        Listar.pessoas(); // Lista depois de remover Joâo

        Data.getPessoas().remove(pessoaPadrao);
        System.out.println("\n\n>>>Lista depois de remover pessoa padrão<<<");
        Listar.pessoas(); // Lista depois de remover Pessoa Padrão

    }
}
