package Testes;

import Base.MinhaExcecao;

public class TesteMinhaExcecao {
    public static void main(String[] args) {
        System.out.println("Inicio do Main");

        try {
            metodo1();

        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
            String msg = ex.getMessage(); 
            System.out.println("Exception" + msg);
            ex.printStackTrace();
        }

        System.out.println("Fim do Main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Inicio do Metodo 1");
        metodo2();
        System.out.println("Fim do Metodo 2");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Inicio do Metodo 2");
        throw new MinhaExcecao("Error");
        // System.out.println("Fim do Metodo 2");
    }  
}
