package Aula12b;

public class Mamifero extends Animal{
    private String corPelo;
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "corPelo='" + corPelo + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", menbros=" + membros +
                '}';
    }
}
