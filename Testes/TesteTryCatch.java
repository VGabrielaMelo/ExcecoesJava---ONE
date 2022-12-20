package Testes;
import Base.ContaPrincipal;

public class TesteTryCatch {
    public static void main(String[] args) {
        System.out.println("Inicio do Main");

        try {
            metodo1();

        } catch(ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage(); 
            System.out.println("Exception" + msg);
            ex.printStackTrace();
        }

        // } catch(ArithmeticException ex) {
        //     String msg = ex.getMessage(); 
        //     System.out.println("ArithmeticException" + msg);
        //     ex.printStackTrace();

        // } catch(NullPointerException ex) {
        //     String msg = ex.getMessage(); 
        //     System.out.println("NullPointerException" + msg);
        //     ex.printStackTrace();
        // }

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
            // Problemas
            // - int a = i / 0;
            ContaPrincipal cp = null;
            cp.depositar();

        } 
        System.out.println("Fim do Metodo 2");
    }
}