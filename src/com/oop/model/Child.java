package com.oop.model;

public class Child {

	private int age;
	private String name;

	public Child(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public boolean canYouTurnOnRadio() {
		if ( age < 10 ) { return false; }

		return true;
	}

	/**
	 *
	 * @param radio
	 */
	public void turnOnRadio(Radio radio) {
		if(!radio.isPowerOn()) {
			radio.turnOn();
		}
	}

	/**
	 *
	 * @param radio
	 * @return
	 */
	public int turnVolumeUp(Radio radio) {
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @return
	 */
	public String whatYourName() {
		return this.name;
	}
}