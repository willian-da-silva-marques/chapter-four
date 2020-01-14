package com.ocajexam.chapter.four.model;

import java.io.Serializable;

public class Car implements Serializable, Comparable<Car> {

	private static final long serialVersionUID = -558881864233070902L;

	private int topSpeed;
	private boolean running;

	public Car(int topSpeed, boolean running) {
		this.topSpeed = topSpeed;
		this.running = running;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public boolean isRunning() {
		return running;
	}
	
	@Override
	public int compareTo(Car car) {
		return Integer.compare(this.topSpeed, car.getTopSpeed());
	}
	
	@Override
	public String toString() {
		return "Car [topSpeed: " + topSpeed + ", running: " + running + "]";
	}
}