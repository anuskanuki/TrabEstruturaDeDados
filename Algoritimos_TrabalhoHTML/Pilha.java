/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritimos_TrabalhoHTML;

public interface Pilha<T> {
    void push(T info) throws Exception;
    T pop() throws Exception;
    boolean vazia();
    T peek();
    int getTamanho();
    void libera();
}
