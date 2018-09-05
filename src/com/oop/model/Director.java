package com.oop.model;

public class Director {

	LivingRoom livingRoom;
	public Mom mom;

	// Scene 2
	public void playAdjustValumeScene() {

	}

	// Scene 1
	public void playTurnOnRadioScene() {
		// 무대를 준비하는 단계
		this.livingRoom = new LivingRoom();
		this.mom = new Mom("MinsuMom");
		livingRoom.enter(new Child(15, "Minsu"));
		livingRoom.setup(new Radio("LG"));

		// 시뮬레이터 동작
		mom.listenToRadio(livingRoom);
	}

}