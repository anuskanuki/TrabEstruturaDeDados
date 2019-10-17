package Algoritimos_TrabalhoHTML;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
-- ler o arquivo html
-- identificar abertura de tag(ler, e se for abertura, insere na pilha)
-- identificar fechamento de tag(ler, e se for fechamento da que está no topo, 
eu verifico se é compatível com a  tag de abertura(a do topo), se não for da erro, se for ela desempilha e continua
--
-- interface    

 */
public class PilhaLista<T> implements Pilha<T> {

    private ElementoLista<T> topo;
    private int tam;

    public PilhaLista() {
        topo = null;
        tam = 0;
    }

    public PilhaLista(T info) throws Exception {
        push(info);

    }

    @Override
    public void push(T info) throws Exception {
        ElementoLista<T> no = new ElementoLista<>(info);
        no.setProx(topo);
        topo = no;
        tam++;
    }

    @Override
    public T pop() throws Exception {
        T aux = topo.getInfo();
        topo = topo.getProx();
        tam--;
        return aux;
    }

    @Override
    public boolean vazia() {
        return topo == null;
    }

    @Override
    public T peek() {
        return topo.getInfo();
    }

    @Override
    public int getTamanho() {
        return tam;
    }

    @Override
    public void libera() {
        ElementoLista<T> aux = topo;
        try {
            while (topo != null) {
                pop();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        String aux = "";
        for (int i = tam; i > 0; i--) {
            aux = (String) peek() + ",";
        }
        return aux.substring(0, aux.length() - 1);
    }

}
