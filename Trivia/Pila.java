public class Pila<T> {
    private Nodo<T> cima;
    private int tamaño;

    // Constructor
    public Pila() {
        this.cima = null;
        this.tamaño = 0;
    }

    // Método para verificar si la pila está vacía
    public boolean estaVacia() {
        return cima == null;
    }

    // Método para obtener el tamaño de la pila
    public int tamaño() {
        return tamaño;
    }

    // Método para agregar un elemento a la cima de la pila
    public void apilar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (estaVacia()) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cima);
            cima = nuevoNodo;
        }
        tamaño++;
    }

    // Método para eliminar y devolver el elemento en la cima de la pila
    public T desapilar() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila de preguntas está vacía");
        }
        T elemento = cima.getDato();
        cima = cima.getSiguiente();
        tamaño--;
        return elemento;
    }

    // Método para obtener el elemento en la cima de la pila sin eliminarlo
    public T cima() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila de preguntas está vacía");
        }
        return cima.getDato();
    }

    // Clase interna para representar los nodos de la pila
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
