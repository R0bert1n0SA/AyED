package practica1;

import java.util.Scanner;

public class Numeros {
	public static void imprimirNumerosFor(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.println(i);
	    }
	}

	public static void imprimirNumerosWhile(int a, int b) {
		int i = a;
		while (i <= b) {
			System.out.println(i);
	        i++;
	    }
	}

	public static void imprimirNumerosRecursivo(int a, int b) {
		if (a <= b) {
			System.out.println(a);
	        imprimirNumerosRecursivo(a + 1, b);
	    }
	}

	
	public static int[] multiplos (int n) {
		int[] vector=new int[n];
		for(int i = 0 ; i < n; i++) {
			vector[i]= n * (i + 1);
		}
		return vector;
	}
	
	public static int[] Con_return(int [] vector) {
	    int min=999999;
	    int max=0;
	    int suma=0;
	    int prom;
	    int [] datos = new int[3];
	    for (int i=0; i<vector.length ; i++) {
	    	suma=suma +vector[i];
	    	if(vector[i] < min) {
	    		min=vector[i];
	    	}
	    	if (vector[i] > max) {
	    		max=vector[i];
	    	}
	    }
	    prom= (int) suma/vector.length;
	    datos[0]=max;
	    datos[1]=min;
	    datos[2]=prom;
	    return datos;
	} 
	
	
	
	public static void Con_Parametros(int suma,int min,int max,int prom) {
        int[] vector = multiplos(7);

	    for (int i=0; i<vector.length ; i++) {
	    	suma=suma +vector[i];
	    	if(vector[i] < min) {
	    		min=vector[i];
	    	}
	    	if (vector[i] > max) {
	    		max=vector[i];
	    	}
	    }
	    prom= (int) suma/vector.length;
        System.out.print("\n Maximo: "+ max+" Minimo: "+ min +" Promedio valor: "+ prom);
	} 
	
	
	public static void Sin_Return_ni_Parametros() {
        int[] vector = multiplos(7);
	    int min=999999;
	    int max=0;
	    int suma=0;
	    int prom=0;
	    for (int i=0; i<vector.length ; i++) {
	    	suma=suma +vector[i];
	    	if(vector[i] < min) {
	    		min=vector[i];
	    	}
	    	if (vector[i] > max) {
	    		max=vector[i];
	    	}
	    }
	    prom= (int) suma/vector.length;
        System.out.print("\n Maximo: "+ max+" Minimo: "+ min +" Promedio valor: "+ prom);
	} 
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
/*
	    System.out.println("Ingrese el valor de a:");
	    int a = scanner.nextInt();

	    System.out.println("Ingrese el valor de b:");
	    int b = scanner.nextInt();

	    System.out.println("Impresión con for:");
	    imprimirNumerosFor(a, b);

	    System.out.println("\nImpresión con while:");
	    imprimirNumerosWhile(a, b);

	    System.out.println("\nImpresión recursiva:");
	    imprimirNumerosRecursivo(a, b);
	    */
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();

        int[] multiples = multiplos(n);

        System.out.println("Múltiplos de " + n + ":");
        for (int multiplo : multiples) {
            System.out.print(multiplo + " ");
        }
        
        int [] valores=Con_return(multiples);
        System.out.print("\n Maximo: "+ valores[0]+" Minimo: "+ valores[1] +" Promedio valor: "+ valores[2]);
        
	    int min=999999;
	    int max=0;
	    int suma=0;
	    int prom=0;
	    Con_Parametros(suma, min,max,prom);
	    
	    Sin_Return_ni_Parametros();

        
	}
	
	
	

}
