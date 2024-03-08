public class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tamaño;

    // Constructor
    public Cola() {
        this.frente = null;
        this.fin = null;
        this.tamaño = 0;
    }

    // Método para verificar si la cola está vacía
    public boolean estaVacia() {
        return frente == null;
    }

    // Método para obtener el tamaño de la cola
    public int tamaño() {
        return tamaño;
    }

    // Método para agregar un elemento al final de la cola
    public void encolar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (estaVacia()) {
            frente = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
        }
        fin = nuevoNodo;
        tamaño++;
    }

    // Método para eliminar y devolver el elemento en el frente de la cola
    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola de preguntas está vacía");
        }
        T elemento = frente.getDato();
        frente = frente.getSiguiente();
        if (frente == null) {
            fin = null;
        }
        tamaño--;
        return elemento;
    }

    // Método para obtener el elemento en el frente de la cola sin eliminarlo
    public T frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola de preguntas está vacía");
        }
        return frente.getDato();
    }

    // Clase interna para representar los nodos de la cola
    private static class Nodo<T> {
        private T dato;
        private Nodo<T> siguiente;

        // Constructor
        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }

        // Métodos getters y setters
        public T getDato() {
            return dato;
        }

        public Nodo<T> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo<T> siguiente) {
            this.siguiente = siguiente;
        }
    }
}
