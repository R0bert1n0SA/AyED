package tp.ejercicio8;

import tp.ejercicio8.Queue;


public class DoubleEndedQueue<T> extends Queue<T> {

    public void enqueueFirst(T dato) {
        lista.addFirst(dato);
    }
}

