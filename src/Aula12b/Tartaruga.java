package Aula12b;

public class Tartaruga extends Repitil{
    @Override
    public void locomover() {
        System.out.println("Andando beeeem devagar");
    }

    @Override
    public String toString() {
        return "Tartaruga{" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
