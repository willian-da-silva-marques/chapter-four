package com.ocajexam.chapter.four;

public class TiposPrimitivos {

	public static void main(String[] args) {

		/**
		 * Os oito tipos primitivos em Java são: 
		 * boolean 1 bit
		 * char 16 bits
		 * byte 8 bits 
		 * short 16 bits 
		 * int 32 bits 
		 * long 64 bits 
		 * float 32 bits 
		 * double 64 bits
		 */

		// Exemplo boolean
		boolean hasTurboCharger = true;
		hasTurboCharger = false;
		System.out.printf("hasTurboCharger: %b%n", hasTurboCharger);

		// Exemplo char
		char c1 = 'S';
		char c2 = '\u0068';
		char c3 = 0x0065;
		char c4 = 0154;
		char c5 = (char) 131170;
		char c6 = (char) 131193;
		char c7 = '\'';
		char c8 = 's';
		char[] autoDesignerArray = { c1, c2, c3, c4, c5, c6, c7, c8 };
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < autoDesignerArray.length; i++) {
			sb.append(autoDesignerArray[i]);
		}
		sb.append(" Mustang");
		System.out.println("autoDesignerArray: "+ sb);

		// Exemplo byte
		byte passengers = 4;
		byte doors = (byte) 2;
		System.out.printf("passengers: %d, doors: %d%n", passengers, doors);

		// Exemplo short
		short unladenWeightInLbs = 2350;
		System.out.printf("unladenWeightInLbs: %d%n", unladenWeightInLbs);
		
		//Exemplo int
		int auctionPrice = 7800000;
		System.out.printf("auctionPrice: %d%n", auctionPrice);
		
		/* coerção implicita de char para int */
		char cylinders = '\u0008';
		System.out.printf("cylinders: %s%n", cylinders);
		int cyl = cylinders;
		System.out.printf("cyl: %d%n", cyl);
		
		/* coerção implicita de byte para int */
		byte wheelbase = 90;
		System.out.printf("wheelbase: %d%n", wheelbase);
		int wBase = wheelbase;
		System.out.printf("wBase: %d%n", wBase);
		
		/* coerção implícita de short para int */
		short horsepower = 250;
		System.out.printf("horsepower: %d%n", horsepower);
		int hPower = horsepower;
		System.out.printf("hPower: %d%n", hPower);
		
		/* coerções entre float e int e double e int devem ser feitas de maneira explícitas */
		int length = (int) 151.5F;
		System.out.printf("hlength: %d%n", length);
		int powerToWeightRatio = (int) 405.1D;
		System.out.printf("hpowerToWeightRatio: %d%n", powerToWeightRatio);
		
		// Exemplo long
		long mustangBingResult = 146000000L;
		long mustangGoogleResults = 40500000l;
		System.out.printf("mustangBingResult: %d%n", mustangBingResult);
		System.out.printf("mustangGoogleResults: %d%n", mustangGoogleResults);
		
		/* coerção explicita de long */
		long mustangAmazonBookResults = (long) 5774;
		System.out.printf("mustangAmazonBookResults: %d%n", mustangAmazonBookResults);
		
		/* coerção inplícita de long */
		long mustangAmazonManualResults = 2380;
		System.out.printf("mustangAmazonManualResults: %d%n", mustangAmazonManualResults);
		
		// Exemplo float
		float currentBid = 80100.99F;
		System.out.printf("currentBid: %f%n", currentBid);
		float openingBid = 20000.00f;
		System.out.printf("openingBid: %f%n", openingBid);

		/* coerção explicita de float */
		float reservePrice = (float) 92000;
		System.out.printf("reservePrice: %f%n", reservePrice);
		/* coerção inplicita de int para float */
		float myBid = 36000;
		System.out.printf("myBid: %f%n", myBid);
		
		// Exemplo double
		double leafSpringCobraEngine = 4.7D;
		System.out.printf("leafSpringCobraEngine: %f%n", leafSpringCobraEngine);
		double chyrsler331Engine = 5.4d;
		System.out.printf("chyrsler331Engine: %f%n", chyrsler331Engine);
		
		/* coerção explicita de double */
		double ford427Engine = (double) 7;
		System.out.printf("ford427Engine: %f%n", ford427Engine);
		double ford428Engine = 7.01;
		System.out.printf("ford428Engine: %f%n", ford428Engine);
		
		/* coerção inplicita de int para double */
		double fordV8Engine = 5;
		System.out.printf("fordV8Engine: %f%n", fordV8Engine);
	}
}