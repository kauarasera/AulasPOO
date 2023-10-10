package Aula14b;

public class Usuario extends Pessoa{
    private String login;
    private int totAssistido;

    public Usuario(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm() {

    }
    @Override
    protected void ganharExp() {
        this.experiencia ++;
    }

    @Override
    public String toString() {
        return "Usuario{" + super.toString() +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
