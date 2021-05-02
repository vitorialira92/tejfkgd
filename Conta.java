package gqso;
/**
 *
 * @author vitoria
 */
public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }
    //não cabe get de número (adicionado no construtor)
    //e nem de saldo (adicionado pela função depósito);
    public double Saldo() {
        return saldo;
    }

    
    public boolean Saque(double valor){
        if(valor<=saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    public void Depositar(double valor){
        saldo += valor;
    }
    
}
