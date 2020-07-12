package Clases;

public class Lista {

    private Nodo inicio;
    private int tamaño;

    public Lista() {
        inicio = null;
        tamaño = 0;

    }

    public boolean esVacia() {
        return inicio == null;
    }

    public void agregarInicio(String nom) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(nom);
        if (esVacia()) { //inicio == null;
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamaño++;
    }

    public void agregarFinal(String nom) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(nom);
        if (esVacia()) { //inicio == null;
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();

            }
            aux.setSiguiente(nuevo);
        }
        tamaño++;
    }

    public void listar() {
        if (!esVacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                System.out.print("[ " + aux.getValor() + " ]" + " ->  ");
                aux = aux.getSiguiente();
            }
        } else {
            System.out.println("Lista Vacia !!!");
        }
    }

    public void eliminar() {
        inicio = null;
        tamaño = 0;
        System.out.println("Elementos eliminados");
    }

}
