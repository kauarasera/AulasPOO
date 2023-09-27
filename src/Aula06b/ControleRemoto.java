package Aula06b;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("-------MENU------");
            System.out.println("Esta Ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getVolume());
            System.out.print("Volume: " + this.getVolume());

            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
        } else {
            System.out.println("Impossivel abrir menu, ligue o programa");
        }
    }

    @Override
    public void fecharMenu() {
            System.out.println("Fechando Menu...");
        }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 1);
            System.out.println("Aumentando volume ");
        } else {
            System.out.println("Impossivel aumentar volume aparelho desligado");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 1);
            System.out.println("Diminuindo volume");
        } else {
            System.out.println("Impossivel aumentar volume aparelho desligado");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            System.out.println("Mudo ligado " + this.getVolume());
        } else {
            System.out.println("Impossivel aumentar volume aparelho desligado");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("ok, função mudo desligada");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setLigado(true);
            System.out.println("Reproduzindo");
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setLigado(false);
            System.out.println();
            System.out.println("Programa pausado");
        } else {
            System.out.println("Não consegui pausar");
        }
    }
}
