package Aula05b;

public class ContaBanco {

    //Atributos
    public int numConta;
    protected String tipo;
    private String titular;

    private float saldo;

    private boolean status;

    public void estadoAtual() {
        System.out.println("----------------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo.equals("CC")) {
            this.setSaldo(50);
        } else if (tipo.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Não pode fechar, conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Não pode fechear, conta em debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float saldo) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + saldo);
            System.out.println("Deposito realizado na conta de " + this.getTitular());
        } else {
            System.out.println("Impossivel depositar em conta fechada");
        }
    }

    public void sacar(float saldo) {
        if (this.getStatus()) {
            if (this.getSaldo() >= saldo) {
                this.setSaldo(this.getSaldo() + saldo);
                System.out.println("Saque realizado na conta de " + this.getTitular());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getTitular());
        } else {
            System.out.println("Impossivel pagar, conta fechada");
        }
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
