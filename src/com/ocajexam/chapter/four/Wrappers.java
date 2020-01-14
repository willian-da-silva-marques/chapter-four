package com.ocajexam.chapter.four;

public class Wrappers {

	public static void main(String[] args) {
		
		/**
		 * As classes Wrappers s�o:
		 * Boolean,
		 * Character,
		 * Byte,
		 * Short,
		 * Integer,
		 * Long,
		 * Float,
		 * Double
		 */
		
		// Exemplo de inicializa��o de um Integer
		
		/* Um integer � criado e inicializado com valor 5 */
		Integer integer = new Integer(5);
		System.out.println(integer.toString());
		
		/* Em seguida um primitivo tipo int � configurado com o valor int armazenado anteriormente no objeto Integer */
		int value = integer.intValue(); // unboxing
		System.out.println(value);
		
		Integer integer2 = value; // autoboxing
		System.out.println(integer2);
	}

}
