package Aula10b;

public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); não posso mais instanciar, classe se tornou abstrata
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Visitante v1 = new Visitante(); // Herança de implementação
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();

        t1.setNome("Mario");
        t1.setRegistroProfissional("Tecnico Informatica");
        t1.setCurso("Informatica");
        t1.setMatr(1113);
        t1.setIdade(17);
        t1.setSexo("M");

        b1.setNome("João");
        b1.setMatr(1112);
        b1.setBolsa(12.50f);
        b1.setSexo("M");
        b1.pagarMensalidade(); // metodo está sobreposto, pagarMnsalidade de um bolsista é diferente de pagarMensalidade de um Aluno.

        a1.setNome("Claudio");
        a1.setMatr(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        v1.setNome("Juvenal");
        v1.setIdade(18);
        v1.setSexo("M");

       /* p1.setNome("Pedro");
          p1.setIdade(18);
          p1.setSexo("M");*/

        p2.setNome("Maria");
        p2.setIdade(29);
        p2.setSexo("F");
        p2.setCurso("Poo");
       // p2.cancelarMatr();

        p3.setNome("Claudia");
        p3.setIdade(38);
        p3.setSexo("F");
        p3.setSalario(2500.75f);
        p3.receberAum(500.50f);

        p4.setNome("José");
        p4.setIdade(56);
        p4.setSexo("M");
        p4.mudarTrabalho();

        /*System.out.println(p1.toString());*/
//        System.out.println(p2.toString());
//        System.out.println(p3.toString());
//        System.out.println(p4.toString());
//        System.out.println(v1.toString());
//        System.out.println(a1.toString());
        System.out.println(b1.toString());
    }
}
