package com.briansmod.items;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class blunt extends ItemFood{
	public blunt(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setPotionEffect(Potion.confusion.id, 40, 20, 1.0f);
	}
}
