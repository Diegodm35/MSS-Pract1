package estructuras;

public class Vector_ {
	double[] doubleArray;
	int size;
	public Vector_(int size) {
		this.size = size;
		doubleArray = new double[size];
	}
	public void setValor (double valor, int pos) {
		// Anadir excepcion
		doubleArray[pos] = valor;
	}
	// Devuelve las dimensiones del vector
	public int tamano() {
		return size;
	}
	//  escribe por pantalla los coeficientes del vector
	public void escribir() {
		for(int i=0;i<size;i++) System.out.print(doubleArray[i] + " ");
		System.out.println();
	}
	// Producto escalar
	public double productoEscalar(Vector_ v2) {
		// Anadir excepcion
		double output = 0;
		for(int i=0;i<size;i++) output += doubleArray[i] * v2.doubleArray[i];
		return output;
	}
}
