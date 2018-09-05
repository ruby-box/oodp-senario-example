package com.oop.model;

import java.util.ArrayList;
import java.util.Collection;

public class LivingRoom {

	private String name;
	public Collection<Child> playingChildren;
	public Radio radio;

	/**
	 *
	 * @param name
	 */
	public Child callChild(String name) {
		for ( Child child:playingChildren ) {
			if ( child.whatYourName().equals(name) ) {
				return child;
			}
		}

		throw new RuntimeException("이름이 맞는 아이가 없습니다. ");
	}

	public Radio requestRadio() {
		return this.radio;
	}

	public void enter(Child child) {
		if ( playingChildren == null ) {
			playingChildren = new ArrayList<>();
		}

		this.playingChildren.add(child);
	}

	public void setup(Radio radio) {
		this.radio = radio;
	}
}