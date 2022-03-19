package paquete1;

import numeros.*;
import estructuras.*;

import java.util.*;

public class Ejercicio1 {
	
	private static Secuencias num;
	private static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		//Ejercicio1.apartado1();
		//Ejercicio1.apartado2();
		//Ejercicio1.apartado3();
		Ejercicio1.apartado4();
	}
	public static void apartado1() {
		System.out.println("Primos:");
		System.out.println("Introduce valor: ");
		int n1 = sc.nextInt();
		num = new Primos(n1);
		num.write();
		System.out.println("Suma: ");
		int sum = num.add();
		System.out.println(sum);
	}
	public static void apartado2() {
		System.out.println("Introduce valor: ");
		int n1 = sc.nextInt();
		num = new Fibonacci(n1);
		num.write();	
		System.out.println("Pertenece1:");
		n1 = sc.nextInt();
		boolean pertenece1 = num.itBelongs(n1);
		System.out.println(pertenece1);
		System.out.println("Pertenece2:");
		n1 = sc.nextInt();
		boolean pertence2 = num.itBelongs(n1);
		System.out.println(pertence2);
	}
	public static void apartado3() {
		System.out.println("Subintervalo:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		num.write(n1,n2);
	}
	public static void apartado4() {
		System.out.println("Vectores:");
		System.out.println("Introduce tamaño de v1:");
		int n1 = sc.nextInt();
		Vector_ v1 = new Vector_(n1);
		System.out.println("Introduce tamaño de v2:");
		n1 = sc.nextInt();
		Vector_ v2 = new Vector_(n1);
		System.out.println("v1: ");
		v1.escribir();
		System.out.println("v2: ");
		v2.escribir();		
		System.out.print("Producto Escalar: ");
		double prod_esc = v1.productoEscalar(v2);
		System.out.println(prod_esc);
		
	}
}
