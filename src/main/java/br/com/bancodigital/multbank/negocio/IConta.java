package br.com.bancodigital.multbank.negocio;

/**
 * A interface é uma classe abstrata com todos os métodos abstratos. Obriga todos que à implementa usar os métodos dentro dela
 * Basicamente uma interface é um contrato
 * Tod método da interface é public, colocar o modificador "public" é redundante
 */

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
