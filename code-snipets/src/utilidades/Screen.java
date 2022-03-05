package utilidades;

public class Screen {

    /**
     * Método que limpa o terminal
     */
    public static void clear() {
        System.out.print("\033\143");
    }

    public static void pressEnterCont() {

        System.out.printf("Aperte ENTER para continuar.");
        // Implemente aqui um separador como print("----------")
        Read.Line();
    }

    public static void pressEnterBack() {
        System.out.printf("Aperte ENTER para voltar.");
        // Implemente aqui um separador como print("----------")
        Read.Line();
    }
}
