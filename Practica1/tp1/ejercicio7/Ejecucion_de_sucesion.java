package tp1.ejercicio7;

import java.util.*;

public class Ejecucion_de_sucesion {

    public static List<Integer> calcularSucesion(int n) {
        List<Integer> sucesion = new ArrayList<>();

        // Caso base: Si n es 1, la sucesión solo contiene 1
        if (n == 1) {
            sucesion.add(1);
            return sucesion;
        }

        // Caso recursivo: Se calculan los siguientes términos de la sucesión
        else {
            sucesion.add(n);

            if (n % 2 == 0) {
                sucesion.addAll(calcularSucesion(n / 2));
            } else {
                sucesion.addAll(calcularSucesion(3 * n + 1));
            }

            return sucesion;
        }
    }

    
    public static void invertirArrayList(ArrayList<Integer> lista, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }

        // Intercambiar elementos en extremos
        int temporal = lista.get(inicio);
        lista.set(inicio, lista.get(fin));
        lista.set(fin, temporal);

        // Recursivamente invertir el resto de la lista
        invertirArrayList(lista, inicio + 1, fin - 1);
    }
    
    public static int sumarLinkedList(LinkedList<Integer> lista, int indice) {
        if (indice == lista.size()) {
            return 0;
        }

        int elemento = lista.get(indice);
        return elemento + sumarLinkedList(lista, indice + 1);
    }
    
    
    public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> listaCombinada = new ArrayList<>();
        int indiceLista1 = 0;
        int indiceLista2 = 0;

        while (indiceLista1 < lista1.size() && indiceLista2 < lista2.size()) {
            if (lista1.get(indiceLista1) <= lista2.get(indiceLista2)) {
                listaCombinada.add(lista1.get(indiceLista1));
                indiceLista1++;
            } else {
                listaCombinada.add(lista2.get(indiceLista2));
                indiceLista2++;
            }
        }

        // Agregar elementos restantes de la lista que no se recorrió por completo
        listaCombinada.addAll(lista1.subList(indiceLista1, lista1.size()));
        listaCombinada.addAll(lista2.subList(indiceLista2, lista2.size()));

        return listaCombinada;
    }
    
    public static void main(String[] args) {
        int n = 6;
        List<Integer> sucesion = calcularSucesion(n);

        System.out.println("Sucesión para n = " + n + ": " + sucesion);
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println("Lista original: " + lista);

        invertirArrayList(lista, 0, lista.size() - 1);

        System.out.println("Lista invertida: " + lista);
        
        LinkedList<Integer> lista2 = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        int suma = sumarLinkedList(lista2, 0);
        System.out.println("Suma de la lista: " + suma);
        
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);

        ArrayList<Integer> lista3 = new ArrayList<>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);

        ArrayList<Integer> listaCombinada = combinarOrdenado(lista1, lista3);

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista3);
        System.out.println("Lista combinada: " + listaCombinada);
        
    }
}

