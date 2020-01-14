package com.ocajexam.chapter.four;

public class EraCalculator {

	public static void main(String[] args) {

		int earnedRuns = 3;
		int inningsPitched = 6;
		int inningsInAGame = 9;

		float leagueAverageEra = 4.25f;
		float era = ((float) earnedRuns / (float) inningsPitched) * inningsInAGame;
		boolean betterThanAverage;
		if (era < leagueAverageEra) {
			betterThanAverage = true;
		} else {
			betterThanAverage = false;
		}
		char yesNo = betterThanAverage ? 'Y' : 'N';
		System.out.println("Earned Runs\t\t" + earnedRuns);
		System.out.println("Innings Pitched\t\t" + inningsPitched);
		System.out.println("ERA\t\t\t" + era);
		System.out.println("League Average ERA\t" + leagueAverageEra);
		System.out.println("Is player better than league average " + yesNo);
		
		EraCalculator eraCalculator = new EraCalculator();
		System.out.println(eraCalculator.interestDue(1.99d, 2.19f));

		float x = 0.0f;
		int y = 5;
		@SuppressWarnings("unused")
		long z;
		x = y + 3.3f;
		System.out.println("1º" + x);
//		x = x + z;// erro de compilação
		System.out.println("2º" + x);
	}

	private double interestDue(double currentBalance, float interestRate) {
		double interestDue = currentBalance * interestRate;
		return interestDue;
	}
	
	// Maneira para criar um array
	// int[] intArray = new int[5];
	// int intArray[] = new int[5];
	
}