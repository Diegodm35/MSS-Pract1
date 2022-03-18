package paquete1;

import numeros.*;
import estructuras.*;

import java.util.*;

public class Ejercicio1 {
	
	private static Secuencias num;
	private static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		Ejercicio1.apartado1();
		Ejercicio1.apartado2();
		Ejercicio1.apartado3();
		Ejercicio1.apartado4();
		/*
		
		*/
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
		Vector_ v1 = new Vector_(2);
		v1.setValor(1.5, 0);
		v1.setValor(2, 1);
		System.out.print("v1: ");
		v1.escribir();
		Vector_ v2 = new Vector_(2);
		v2.setValor(3, 0);
		v2.setValor(4.5, 1);
		System.out.print("v2: ");
		v2.escribir();
		double prod_esc = v1.productoEscalar(v2);
		System.out.print("Producto Escalar: ");
		System.out.println(prod_esc);
	}
}
