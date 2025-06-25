public class Nodo {
    private Computador compu;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(Computador compu, Nodo izquierda, Nodo derecha) {
        this.compu = compu;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public Computador getCompu() {
        return compu;
    }

    public void setCompu(Computador compu) {
        this.compu = compu;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}
