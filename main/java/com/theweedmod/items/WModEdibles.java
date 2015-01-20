package com.theweedmod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.theweedmod.main.Main;

public class WModEdibles extends ItemFood
{
	public WModEdibles(int hunger, float saturation, boolean isWolfFood)
	{	
		super(hunger, saturation, isWolfFood);
		
		setAlwaysEdible();
		setCreativeTab(Main.tabWeed);
		setMaxStackSize(64);
	}
	
	protected void onFoodEaten(ItemStack itemStack, World world,
			EntityPlayer player)
	{
		if (!world.isRemote)
		{
			player.addPotionEffect(new PotionEffect(Potion.confusion.id,
					1125, 1));
			player.addPotionEffect(new PotionEffect(Potion.hunger.id, 300,
					1));
		} else
		{
			super.onFoodEaten(itemStack, world, player);
		}
	}
}
