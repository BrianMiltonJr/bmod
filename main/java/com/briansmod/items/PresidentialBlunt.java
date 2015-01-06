package com.briansmod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.briansmod.main.Main;

public class PresidentialBlunt extends ItemFood
{

	/**
	 * By Making a class called blunt and making the constructor to require the
	 * Effect, Duration, how strong the effect is, and how likely the effect is
	 * to happen
	 */

	public int id;
	public int duration;
	public int amplify;

	public int id2;
	public int duaration2;
	public int amplify2;

	public PresidentialBlunt(int hunger, float saturation, boolean isWolfFood)
	{
		super(hunger, saturation, isWolfFood);
		setAlwaysEdible();
		setCreativeTab(Main.tabWeed);
		setMaxStackSize(8);
	}

	protected void onFoodEaten(ItemStack itemStack, World world,
			EntityPlayer player)
	{
		if (!world.isRemote)
		{
			player.addPotionEffect(new PotionEffect(Potion.confusion.id, 1200,
					4));
			player.addPotionEffect(new PotionEffect(Potion.hunger.id, 1200, 2));
		} else
		{
			super.onFoodEaten(itemStack, world, player);
		}
	}

	public EnumAction getItemUseAction(ItemStack itemStack)
	{
		return EnumAction.none;
	}

	public int getMaxItemUseDuration(ItemStack itemStack)
	{
		return 1;
	}
}