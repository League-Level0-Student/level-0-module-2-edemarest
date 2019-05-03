package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		int i = 0;
		
		for (i = 0; i < 50; i++) {
			
			String animal = JOptionPane.showInputDialog("Pick an animal: duck, cow, dog, cat, llama");
			
			if (animal.equals ("duck")) {
				
				playNoise(quackFile);
				
			}
			if (animal.equals ("cow")) {
				
				playNoise(mooFile);
				
			}
			if (animal.equals ("dog")) {
				
				playNoise(woofFile);
				
			}
			if (animal.equals ("cat")) {
				
				playNoise(meowFile);
				
			}
			if (animal.equals ("llama")) {
				
				playNoise(llamaFile);
				
			}
		}
		/* 2. Make it so that the user can keep entering new animals. */
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
		

			
			
			

		
		
	}

	

	
}
