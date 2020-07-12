package Clases;

public class Nodo {
    
    private String valor;
    private Nodo Siguiente;

    public Nodo(String valor, Nodo Siguiente) {
        String nom = null;
        valor=nom;
        this.Siguiente = Siguiente;
    }

    public Nodo() {
        valor = null;
        Siguiente = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
    

}
