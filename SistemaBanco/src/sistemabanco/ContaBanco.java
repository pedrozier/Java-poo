/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabanco;

/**
 *
 * @author zier
 */
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;

    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0) {
            System.out.println("Conta em debito");
        } else {
            setStatus(false);
        }

    }

    public void depositar(float v) {
        if (status == true) {
            setSaldo(getSaldo() + v);

        } else if (status == false) {
            System.out.println("erro, não é possivel depositar");//nao usar print em metodos//
        }
    }

    public void sacar(float v) {
        if (status == true) {
            if (saldo > v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
    }

    public void pagarMensal() {
        float v = 0;
        if (tipo == "CC") {
            v = 12;
        } else if (tipo == "CP") {
            v = 20;
        }
        if (status == true) {
            setSaldo(getSaldo() - v);
        } else {
            System.out.println("Impossivel pagar");
        }
    }
}
