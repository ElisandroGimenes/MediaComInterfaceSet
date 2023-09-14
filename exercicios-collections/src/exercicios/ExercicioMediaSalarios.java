package exercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//import java.util.Scanner;

public class ExercicioMediaSalarios {
	
	public static void main(String[] args) {

		//HashSet não ordena os valores.
		
		Set <Double> salario = new HashSet<>();

		salario.add(1320.00);
		salario.add(2500.00);
		salario.add(3000.00);
		
		for (double salarios: salario) {
			System.out.println(salarios);
		}
		
		
		//LinkedHashSet coloca os valores na mesma ordem em que foram inseridos.
		
		Set <Integer> numeros = new LinkedHashSet<>();
		
		numeros.add(3);
		numeros.add(2);
		numeros.add(1);
		
		for (int mostraNumeros: numeros) {
			System.out.println(mostraNumeros);
		}
		
		
		//TreeSet coloca os valores em ordem numérica ou alfabética.
		
		Set <String> alfabeto = new TreeSet<>();
		
		alfabeto.add("C");
		alfabeto.add("E");
		alfabeto.add("A");
		alfabeto.add("B");
		alfabeto.add("D");
		
		for (String letras: alfabeto) {
			System.out.println(letras);
		}
 	}
}
