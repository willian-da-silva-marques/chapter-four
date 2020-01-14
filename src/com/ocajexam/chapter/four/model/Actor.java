package com.ocajexam.chapter.four.model;

public class Actor {

	String [] characterName = new String[4];
	
	{
		characterName[0] = "Captain Video";
		characterName[1] = "Quizmaster";
		characterName[2] = "J.C. Money";
		characterName[3] = "Jersey Joe";
	}
	
	public static void main(String[] args) {
		Actor actor = new Actor();
		for (int i = 0; i < actor.characterName.length; i++) {
			System.out.println(actor.characterName[i]);
		}
	}
}