package Testes;
import Base.MinhaExcecao;
import Base.Conta;

public class TestaContaMinhaExcecao {
    public static void main(String[] args){
        Conta c = new Conta();
        try {
            c.depositar();
        } catch (MinhaExcecao ex) {
            System.out.println("Tratamento...");
        }
    }
}