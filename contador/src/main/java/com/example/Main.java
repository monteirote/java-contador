package com.example;

import java.util.Scanner;

import com.example.exceptions.ParametroInvalidoException;

public class Main {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = teclado.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = teclado.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametroInvalidoException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		teclado.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametroInvalidoException {
		if (parametroUm > parametroDois) {
            throw new ParametroInvalidoException();
        } else {
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println(i);
            }
        }	
	}
}