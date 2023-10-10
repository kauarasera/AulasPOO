package Aula14b;

public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        v[0].setReproduzindo(true);
        System.out.println(v[0].toString());

        Usuario[] usuario = new Usuario[2];
        usuario[0] = new Usuario("Jubileu", 22, "M", "juba");
        usuario[1] = new Usuario("Creuza", 25, "F", "creuzita");
        System.out.println(usuario[0].toString());
//        System.out.println(v[1].toString());
    }
}
