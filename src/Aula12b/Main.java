package Aula12b;

public class Main {
    public static void main(String[] args) {
        //Declarando objetos
        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        Repitil r = new Repitil();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();

        Peixe p = new Peixe();
        Goldfish g = new Goldfish();

        Ave a = new Ave();
        Arara ar = new Arara();

        //chamada dos metodos e seus resultados
        System.out.println("Mamifero");
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.setCorPelo("Caramelo");
        m.locomover();
        m.alimentar();
        m.alimentar();
        m.emitirSom();
        System.out.println(m.toString());

        System.out.println();
        System.out.println("Peixe");

        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.setCorEscama("Azul");
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        System.out.println(p.toString());

        System.out.println();

        System.out.println("Ave");
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.setCorPena("Amarelo");
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        System.out.println();
        System.out.println("Repitil");
        r.setPeso(2f);
        r.setIdade(3);
        r.setMembros(4);
        r.setCorEscama("verde");
        r.locomover();
        r.alimentar();
        r.emitirSom();

        System.out.println();
        System.out.println("Canguru");
        c.setPeso(55f);
        c.setIdade(4);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        System.out.println(c.toString());

        System.out.println();
        System.out.println("Cachorro");
        k.setPeso(15f);
        k.setIdade(1);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.enterrarOsso();
        k.abanarRabo();
        System.out.println(k.toString());

        System.out.println();
        System.out.println("Cobra");
        co.setPeso(2f);
        co.setIdade(2);
        co.setMembros(0);
        co.setCorEscama("vermelho e preto");
        co.locomover();
        co.alimentar();
        co.emitirSom();
        System.out.println(co.toString());


        System.out.println();
        System.out.println("Tartaruga");
        t.setPeso(5f);
        t.setIdade(50);
        t.setMembros(4);
        t.locomover();                
        t.alimentar();
        t.emitirSom();
        System.out.println(t.toString());

        System.out.println();
        System.out.println("Goldfish");
        g.setPeso(2f);
        g.setIdade(2);
        g.setMembros(0);
        g.setCorEscama("vermelho e preto");
        g.locomover();
        g.alimentar();
        g.emitirSom();
        g.soltarBolha();
        System.out.println(g.toString());

        System.out.println();
        System.out.println("Arara");
        ar.setPeso(2f);
        ar.setIdade(2);
        ar.setMembros(2);
        ar.locomover();
        ar.alimentar();
        ar.emitirSom();
        ar.fazerNinho();
        System.out.println(g.toString());
    }
}
/*
Chamei os mesmos metodos de objetos diferentes e obtive outros resultados, ou seja,
chamei o mesmo metodo com o mesmo nome e tive formas diferentes de respostas, esse é o
conceito de POLIMORFISMO.
Esse tipo de polimosfismo foi utilizado quando sobrepôs os: locomover, alimentar e emitir som da superclasse.
 */
