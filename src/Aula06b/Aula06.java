package Aula06b;

public class Aula06 {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.setLigado(true);
        c.setTocando(true);
        c.setVolume(60);
        c.abrirMenu();
        c.pause();

    }
}
