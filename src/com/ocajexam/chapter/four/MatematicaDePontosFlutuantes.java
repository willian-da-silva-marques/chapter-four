package com.ocajexam.chapter.four;

import java.text.NumberFormat;

public class MatematicaDePontosFlutuantes {

	public static void main(String[] args) {
		
		float a = 19801216.0f;
		float b = 20120307.12f;
		float c = a + b;
		
		NumberFormat format = NumberFormat.getCurrencyInstance();
		
		/* Exibe o número após formata-lo como moeda */
		System.out.println(format.format(c));
		
		/* Exibe o número exatamente como foi armazenado */
		System.out.println(c);
		// OBS: Há uma imprecisão de 0,88.
		
		double x = 19801216.0;
		double y = 20120307.12;
		double z = x + y;
		
		/* Exibe o número após formata-lo como moeda */
		System.out.println(format.format(z));
		
		/* Exibe o número exatamente como foi armazenado */
		System.out.println(z);
		// OBS: Há uma imprecisão de 0,88.
		
	}
}