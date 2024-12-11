public class Ejercicio10 {

    private Nodo raiz;

    public void agregar(Persona persona) {
        Nodo nuevoNodo = new Nodo(persona);
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            insertar(raiz, nuevoNodo);
        }
    }

    private void insertar(Nodo nodoActual, Nodo nuevoNodo) {
        if (nuevoNodo.prioridad > nodoActual.prioridad) {
            if (nodoActual.izquierdo == null) {
                nodoActual.izquierdo = nuevoNodo;
            } else {
                insertar(nodoActual.izquierdo, nuevoNodo);
            }
        } else {
            if (nodoActual.derecho == null) {
                nodoActual.derecho = nuevoNodo;
            } else {
                insertar(nodoActual.derecho, nuevoNodo);
            }
        }
    }

    public Persona atender() {
        if (raiz == null) {
            return null;
        }

        Nodo nodoAtender = obtenerNodoMaximo(raiz);
        Persona personaAtendida = nodoAtender.persona;
        eliminar(nodoAtender);

        return personaAtendida;
    }

    private Nodo obtenerNodoMaximo(Nodo nodoActual) {
        if (nodoActual.derecho == null) {
            return nodoActual;
        } else {
            return obtenerNodoMaximo(nodoActual.derecho);
        }
    }

    private void eliminar(Nodo nodoEliminar) {
        if (nodoEliminar.izquierdo == null && nodoEliminar.derecho == null) {
            // Nodo hoja
            if (nodoEliminar == raiz) {
                raiz = null;
            } else {
                Nodo padre = obtenerPadre(nodoEliminar);
                if (padre.izquierdo == nodoEliminar) {
                    padre.izquierdo = null;
                } else {
                    padre.derecho = null;
                }
            }
        } else if (nodoEliminar.izquierdo == null) {
            // Nodo con un solo hijo derecho
            if (nodoEliminar == raiz) {
                raiz = nodoEliminar.derecho;
            } else {
                Nodo padre = obtenerPadre(nodoEliminar);
                if (padre.izquierdo == nodoEliminar) {
                    padre.izquierdo = nodoEliminar.derecho;
                } else {
                    padre.derecho = nodoEliminar.derecho;
                }
            }
        } else {
            // Nodo con dos hijos
            Nodo predecesor = obtenerPredecesor(nodoEliminar);
            nodoEliminar.valor = predecesor.valor;
            eliminar(predecesor);
        }
    }

    private Nodo obtenerPadre(Nodo nodo) {
        if (nodo == raiz) {
            return null;
        }

        Nodo padre = raiz;
        while (padre.izquierdo != nodo && padre.derecho != nodo) {
            if (nodo.valor > padre.valor) {
                padre = padre.derecho;
            } else {
                padre = padre.izquierdo;
            }
        }

        return padre;
    }

    private Nodo obtenerPredecesor(Nodo nodo) {
        Nodo predecesor = nodo.izquierdo;
        while (predecesor.derecho != null)
