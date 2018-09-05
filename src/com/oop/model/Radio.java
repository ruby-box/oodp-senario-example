package com.oop.model;

public class Radio {

	private String name;
	private boolean powerOn;

	public Radio(String name) {
		this.name = name;
		this.powerOn = false;
	}

	public boolean isPowerOn() {
		return this.powerOn;
	}

	public void turnOff() {
		// TODO - implement Radio.turnOff
		throw new UnsupportedOperationException();
	}

	public void turnOn() {
		this.powerOn = true;
	}

	public int turnVolumeDown() {
		// TODO - implement Radio.turnVolumeDown
		throw new UnsupportedOperationException();
	}

	public int turnVolumeUp() {
		// TODO - implement Radio.turnVolumeUp
		throw new UnsupportedOperationException();
	}

}