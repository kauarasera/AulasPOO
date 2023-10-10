package Aula14bE15b;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------Ações--------------------");
        System.out.println("----------------Videos--------------------");
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        System.out.println(v[0].toString());
        v[1] = new Video("Aula 12 de PHP");
        System.out.println(v[1].toString());
        v[2] = new Video("Aula 10 de HTML5");
        System.out.println(v[2].toString());
        System.out.println();

        System.out.println("----------------Usuarios--------------------");
        Usuario[] usuario = new Usuario[2];
        usuario[0] = new Usuario("Jubileu", 22, "M", "juba");
        System.out.println(usuario[0].toString());
        usuario[1] = new Usuario("Creuza", 25, "F", "creuzita");
        System.out.println(usuario[1].toString());
        System.out.println();

        System.out.println("----------------Visualização--------------------");
        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(usuario[0], v[2]); //Jubileu assiste HTML
        vis[0].avaliar();
        System.out.println(vis[0].toString() + "\n");

        vis[1] = new Visualizacao(usuario[0], v[1]);
        vis[1].avaliar(8);
        System.out.println(vis[1].toString() + "\n");//Jubileu assiste PHP
        System.out.println();
    }
}
