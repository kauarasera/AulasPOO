package Aula10b;

//Arvore de herença funcionando nessa classe
public final class Bolsista extends Aluno{ //classe final não pode ter mais filhos -> Classe folha
    private float bolsa;
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }

    /*Vou sobrepor o metodo PagarMensalidade mas de uma forma diferente por ser
    bolsista, aqui comça a iniciar  o 3º Pilar: Polimosfirmo (fazer a mesma coisa mas de formas diferentes) */

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsita! Pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
