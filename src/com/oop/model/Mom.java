package com.oop.model;

import java.util.*;

public class Mom {

	public Collection<Child> son;
	private String name;
	private int age;

	public Mom(String name) {
		this.name = name;
	}

	/**
	 *
	 * @param livingRoom
	 */
	public void adjustRadioVolume(LivingRoom livingRoom) {
		// TODO - implement Mom.adjustRadioVolume
		throw new UnsupportedOperationException();
	}

	public boolean feelAsLowVolume() {
		// TODO - implement Mom.feelAsLowVolume
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param livingRoom
	 */
	public void listenToRadio(LivingRoom livingRoom) {
		//livingRoom을 통해서 민수를 데려온다
		Child minsu = livingRoom.callChild("Minsu");
		Radio radio = livingRoom.requestRadio();

		if ( minsu.canYouTurnOnRadio() ) {
			minsu.turnOnRadio(radio);
		} else {
			radio.turnOn();
		}
	}

}