package aplicativo;

import java.util.Scanner;

import calculo.Conta;

public class ImcCalculo {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	Conta imc = new Conta();
	
	
	System.out.println("Qual a sua altura (m)");
	imc.Altura = leitor.nextDouble(); 
	
	System.out.println("Qual o seu peso(Kg)");
	imc.Peso = leitor.nextDouble();
	
	System.out.println("é"+imc.resultado);
	

	}

}
