package estructuras;

import java.util.Scanner;

public class Vector_ {
	double[] doubleArray;
	int size;
	public Vector_(int size) {
		this.size = size;
		doubleArray = new double[size];
		double d1;
		Scanner sc = new Scanner(System.in); 
		for(int i=0;i<size;i++) {				
			System.out.print("Introduce el valor para la posición " + i + ": ");
			d1 = sc.nextDouble(); 
			this.setValor(d1, i);
		}
	}
	public void setValor (double valor, int pos) {
		try {
			doubleArray[pos] = valor;			
		} catch(IndexOutOfBoundsException e){
			System.err.println("IndexOutOfBoundsException:" + e.getMessage());
		}
	}
	// Devuelve las dimensiones del vector
	public int tamano() {
		return size;
	}
	//  Escribe por pantalla los coeficientes del vector
	public void escribir() {
		for(int i=0;i<size;i++) System.out.print(doubleArray[i] + " ");
		System.out.println();
	}
	// Producto escalar
	public double productoEscalar(Vector_ v2) {
		double output = 0;
		try {			
			for(int i=0;i<size;i++) output += doubleArray[i] * v2.doubleArray[i];
		}
		catch(IndexOutOfBoundsException e){
			System.err.println("IndexOutOfBoundsException: No se puede hacer el producto escalar de dos vectores de diferentes tamaños");
			return 0.0;
		}
		return output;
	}
}
