package Aula10bE11b;

public class Aluno extends Pessoa {
    private int matr;
    private String curso;

    private String mensalidade;

    public void cancelarMatr() {
        System.out.println("Matricula será cancelada");
    }

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de " + this.nome); // acessei direto nome por que na classe pessoa os atributos mudei para protegido
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(String mensalidade) {
        this.mensalidade = mensalidade;
    }
}
