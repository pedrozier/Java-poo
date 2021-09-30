package aula05;
//**NAO USAR System.out.println() EM METODOS**//
class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("---------------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo "  + this.getTipo());
        System.out.println("Dono "  + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta nao pode ser fechada");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta nao pode ser fechada");
        } else {
            this.setStatus(false);
            System.out.println("conta fechada");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realisado na conta; " + this.getDono());
            } else {
                System.out.println("saldo insuficiente");
            }
        } else {
            System.out.println("conta inativa");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;            
        } else if ("CP".equals(this.getTipo())){
        } else {
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("mensalidade paga");
        } else {
            System.out.println("impossivel pagar");
        }
    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
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

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
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
