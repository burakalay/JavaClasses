package com.neotech.lesson21;

public class PianoTeacher extends Teacher{

	boolean ownPiano;
	
	public void playsPiano() {
		System.out.println(fullName+" plays piano very well");
		if(ownPiano) {
			System.out.println(fullName+" owns a piano");
		} else {
			System.out.println(fullName+" doesn't have own piano");
		}
	}
	
	
	public static void main(String[] args) {
		PianoTeacher pt = new PianoTeacher();
		pt.fullName="Fazıl Say";
		pt.major="Music";
		
		pt.playsPiano();
		pt.teaches();

	}

}
