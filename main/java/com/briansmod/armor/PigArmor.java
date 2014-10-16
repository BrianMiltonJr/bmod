package com.briansmod.armor;

import com.sun.xml.internal.stream.Entity;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class PigArmor extends ItemArmor{

	public PigArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}
	
	public String getArmorTexture(ItemStack armor, Entity entity, int slot, int layer) {
		if(slot == 0 || slot == 1 || slot == 3)
			return "briansmod:pigarmor_1";
		else if(slot == 2)
			return "briansmod:pigarmor_2";
		else
			return null;
	}
}
