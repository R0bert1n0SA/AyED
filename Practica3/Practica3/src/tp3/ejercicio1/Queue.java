package tp3.ejercicio1;
import java.util.LinkedList;

public class Queue<T> {

    private LinkedList<T> lista;

    public Queue() {
        lista = new LinkedList<>();
    }

    public void enqueue(T dato) {
        lista.add(dato);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return lista.removeFirst();
    }

    public T head() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return lista.getFirst();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public int size() {
        return lista.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (T elemento : lista) {
            sb.append(elemento).append(", ");
        }
        if (!lista.isEmpty()) {
            sb.deleteCharAt(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
