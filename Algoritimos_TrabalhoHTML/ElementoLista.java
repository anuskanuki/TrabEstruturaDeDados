
package Algoritimos_TrabalhoHTML;

public class ElementoLista<T> {
    private T info;
    private ElementoLista<T> prox;

    public ElementoLista(){
        
    }
    public ElementoLista(T info){
        this.info = info;
        
    }
    
    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public ElementoLista<T> getProx() {
        return prox;
    }

    public void setProx(ElementoLista<T> prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return (String)getInfo();
    }
    
}
