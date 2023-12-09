package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora operaciones = new Calculadora();
		
		System.out.println("Resultado Multiplicacion:" + operaciones.multiplicar(10, 5.2));
		System.out.println("Resultado Dividir:" + operaciones.dividir(10, 2));
		System.out.println("Resultado Promedio:" + operaciones.promediar(10,9, 8.25));
		operaciones.mostrarResultado();
		
	}

}
