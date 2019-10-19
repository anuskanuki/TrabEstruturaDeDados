
package Algoritimos_TrabalhoHTML;

public class NoLista<T> {
    private T info;
    private NoLista<T> prox;

    public NoLista(){
        
    }
    public NoLista(T info){
        this.info = info;
        
    }
    
    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoLista<T> getProx() {
        return prox;
    }

    public void setProx(NoLista<T> prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return (String)getInfo();
    }
    
}
