package com.briansmod.items;

import java.util.Random;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class blunt extends ItemFood{
	public blunt(int hunger, float saturation, boolean isWolfFood, int duration, int amplify, float probability) {
		super(hunger, saturation, isWolfFood);
		
		Random rand = new Random();
		rand.nextInt(1);
			
		if(rand.nextInt() == 0){
			setPotionEffect(Potion.confusion.id, duration, amplify, probability);
		}if(rand.nextInt() == 1){
			setPotionEffect(Potion.hunger.id, duration, amplify, probability);
			setPotionEffect(Potion.confusion.id, duration, amplify, probability);
		}
	}
}

