package constructor_com_argumentos;

public class Pessoa {
    String nome;
    int idade;
    boolean vivo;

    /**
     * Construtor com Argumentos, na maioria dos casos, é vantajoso utilizar essa
     * estrutura.
     */
    public Pessoa(String nome, int idade, boolean vivo) {
        this.nome = nome;
        this.idade = idade;
        this.vivo = vivo;
    }

    /**
     * Construtor sem Argumentos, pode ser settado um valor padrão ou pode-se deixar
     * vazio para utilizar os setters e definir um valor para as variáveis.
     */
    public Pessoa() {
        this.nome = "Creuzeback";
        this.idade = 35;
        this.vivo = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        if (vivo) {
            return nome + " tem " + idade + " anos.";
        } else {
            return nome + " tinha " + idade + " anos quando morreu.";
        }

    }

}