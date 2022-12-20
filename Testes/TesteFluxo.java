package Testes;
// Pilha de Execuções - Stack
public class TesteFluxo {
    public static void main(String[] args) {
        System.out.println("Inicio do Main");
        metodo1();
        System.out.println("Fim do Main");
    }

    private static void metodo1() {
        System.out.println("Inicio do Metodo 1");
        metodo2();
        System.out.println("Fim do Metodo 2");
    }

    private static void metodo2() {
        System.out.println("Inicio do Metodo 2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        } 
        System.out.println("Fim do Metodo 2");
    }
}