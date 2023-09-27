package Aula07bE08b;

import java.util.Random;

public class Luta {
    Random gerador = new Random();
    private Lutador desafiado; // instancia da classe Lutador, isso é um tipo de realação
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    /*
     * Só pode ser marcada entre lutadores da mesma categoria
     * Desafiado e desafiante devem ser lutadores diferentes
     * Só pode acontecer se a luta estiver aprovada
     * Só pode ter como resultado a vitória de um dos lutadores ou um empate
     */
    public void marcarLuta(Lutador l1, Lutador l2) {
        boolean lutadoresDiferentes = l1 != l2;

        if (l1.getCategoria().equals(l2.getCategoria()) && (lutadoresDiferentes)) {
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    /* Vai gerar um valor aleatório para vermos quem ganhou e ai vou definir a quantidade de ferrotas e vitorias de cada lutador
     e ficara guardado no objeto lutador */
    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            int vencedor = gerador.nextInt(3);

            System.out.println("================ RESULTADO DA LUTA ================");

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Ganhou desafiado: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Ganhou desafiante: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
}
