package com.ocajexam.chapter.four;

import java.util.Arrays;
import java.util.List;

import com.ocajexam.chapter.four.model.Car;

public class ObjetosVersusClassesEOOperadorNew {

	public static void main(String[] args) {

		// Exemplo de criação de objetos
		Car car1 = new Car(14, true);
		Car car2 = new Car(200, true);
		Car car3 = new Car(32, true);
		Car car4 = new Car(470, true);
		Car car5 = new Car(59, true);
		Car car6 = new Car(62, true);
		Car car7 = new Car(180, true);
		Car car8 = new Car(250, true);
		Car car9 = new Car(90, true);
		Car car10 = new Car(100, true);
		
		List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10);
		
		System.out.println("Ordenado");
		cars.stream().sorted().forEach(System.out::println);
		
		// A partir do JDK 7 sublinhados são permitidos para literais numéricos.
		// Exemplos
		long creditCardNumber = 5555_5555_5555_5555L;
		int creditCardLimit = 1_000_000;
		float pi = 3.14_159_265_359f;
		System.out.println("creditCardNumber: " + creditCardNumber);
		System.out.println("creditCardLimit: " + creditCardLimit);
		System.out.println("pi: " + pi);
		
		
	}
}