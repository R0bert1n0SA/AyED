package tp.ejercicio9;

import java.util.Stack;

public class TestBalanceo {

    public static boolean estaBalanceado(String str) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : str.toCharArray()) {
            if (esParentesisAbierto(caracter)) {
                pila.push(caracter);
            } else if (esParentesisCerrado(caracter)) {
                if (pila.isEmpty()) {
                    return false;
                }

                char ultimoAbierto = pila.pop();
                if (!coincidenParentesis(ultimoAbierto, caracter)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    private static boolean esParentesisAbierto(char caracter) {
        return caracter == '(' || caracter == '[' || caracter == '{' || caracter == '<';
    }

    private static boolean esParentesisCerrado(char caracter) {
        return caracter == ')' || caracter == ']' || caracter == '}' || caracter == '>';
    }

    private static boolean coincidenParentesis(char abierto, char cerrado) {
        switch (abierto) {
            case '(':
                return cerrado == ')';
            case '[':
                return cerrado == ']';
            case '{':
                return cerrado == '}';
            case '<':
                return cerrado == '>';
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "{( ) [ ( ) ] }";
        String str2 = "( [ ) ]";

        System.out.println("String 1: " + str1 + " - ¿Balanceado?: " + estaBalanceado(str1));
        System.out.println("String 2: " + str2 + " - ¿Balanceado?: " + estaBalanceado(str2));
    }
}

