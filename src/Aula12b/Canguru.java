package Aula12b;

public class Canguru extends Mamifero {
    public void  usarBolsa() {
        System.out.println("Usando Bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    @Override
    public String toString() {
        return "Canguru{" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
