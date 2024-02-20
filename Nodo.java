
public class Nodo {
    private int dato;
    private Nodo enlace;

    public Nodo(int dato, Nodo enlace){
        this.dato = dato;
        this.enlace = enlace;
    }
    public int getDato(){
        return dato;
    }
    public Nodo getEnlace(){
        return this.enlace;
    }
    public void CambiarEnlace(Nodo nodo){
        enlace = nodo;
    }
}

