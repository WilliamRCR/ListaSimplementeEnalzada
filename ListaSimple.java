import org.w3c.dom.Node;

public class ListaSimple {
    //Primer elemento
    private Nodo cabeza;

    public ListaSimple(Nodo cabeza){
        this.cabeza = cabeza;
    }
    public void AgregarCabeza(int dato){
        Nodo nuevo = new Nodo(dato, cabeza);
        cabeza = nuevo;
    }

    public void AgregarAlFinal(int dato){
        Nodo nuevo = new Nodo(dato, null);
        Nodo nodoActual = cabeza;
        Nodo nodoAuxiliar = null;
        while (nodoActual != null){
            nodoAuxiliar = nodoActual;
            nodoActual = nodoActual.getEnlace();
        }
        if (nodoAuxiliar != null){
            nodoAuxiliar.CambiarEnlace(nuevo);
        }

    }


    public void ImprimirElementos(){
        Nodo nodoActual = cabeza;
        while (nodoActual != null){
            System.out.println( String.format("Dato %s", nodoActual.getDato()));
            nodoActual = nodoActual.getEnlace();
        }
    }

    public void EliminarPorValor(int valor) {
        if (!esVacia()) {
            if (cabeza.getDato() == valor) {
                cabeza = cabeza.getEnlace();
            } else {
                Nodo anterior = cabeza;
                Nodo temporal = cabeza.getEnlace();
                while (temporal != null && temporal.getDato() != valor) {
                    anterior = anterior.getEnlace();
                    temporal = temporal.getEnlace();
                }
                if (temporal != null) {
                    anterior.CambiarEnlace(temporal.getEnlace());
                }
            }
        }
    }

    public boolean Buscar(int valor) {
        Nodo nodoActual = cabeza;
        while (nodoActual != null) {
            if (nodoActual.getDato() == valor) {
                return true;
            }
            nodoActual = nodoActual.getEnlace();
        }
        return false;
    }

    private boolean esVacia() {
        return cabeza == null;
    }
}

