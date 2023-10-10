package Aula12b;

public class Cachorro extends Mamifero{
    public void enterrarOsso() {
    System.out.println("Enterrando Osso");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
