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
				System.out.println("L: 요청하신 " + name + "을 찾았습니다.");
				return child;
			}
		}

		throw new RuntimeException("이름이 맞는 아이가 없습니다. ");
	}

	public Radio requestRadio() {
		System.out.println("L: 제가 가지고 있는 " + radio.getName() + "라디오를 드리겠습니다.");
		return this.radio;
	}

	public void enter(Child child) {
		if ( playingChildren == null ) {
			playingChildren = new ArrayList<>();
		}

		System.out.println("L: " + child.whatYourName() + "가 거실에 들어왔습니다.");

		this.playingChildren.add(child);
	}

	public void setup(Radio radio) {
		System.out.println("L: " + radio.getName() + "가 설치되었습니다.");
		this.radio = radio;
	}
}