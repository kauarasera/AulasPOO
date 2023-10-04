package Aula10b;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setIdade(18);
        p1.setSexo("M");

        p2.setNome("Maria");
        p2.setIdade(29);
        p2.setSexo("F");
        p2.setCurso("Poo");
        p2.cancelarMatr();

        p3.setNome("Claudia");
        p3.setIdade(38);
        p3.setSexo("F");
        p3.setSalario(2500.75f);
        p3.receberAum(500.50f);

        p4.setNome("José");
        p4.setIdade(56);
        p4.setSexo("M");
        p4.mudarTrabalho();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
