package Aula05b;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Aula05 {
    public static void main(String[] args) {
        System.out.println("--------------------------------");

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1994);
        p1.setTitular("João");
        p1.abrirConta("CC");
        p1.sacar(200);
        p1.estadoAtual();

        System.out.println("--------------------------------");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1995);
        p2.setTitular("Maria");
        p2.abrirConta("CP");
        p2.estadoAtual();
    }
}