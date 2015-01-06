package com.briansmod.items;

import java.util.Random;

import com.briansmod.main.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class OompaLoompaBlunt extends ItemFood
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

	public OompaLoompaBlunt(int hunger, float saturation, boolean isWolfFood)
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
			Random rn = new Random();
			int answer = rn.nextInt(3);

			if (answer == 0)
			{
				player.addPotionEffect(new PotionEffect(Potion.hunger.id, 1125,
						2));
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id,
						1125, 2));
			}
			if (answer == 1)
			{
				player.addPotionEffect(new PotionEffect(Potion.confusion.id,
						1125, 2));
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id,
						1125, 2));
			}
			if (answer == 2)
			{
				player.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 2));
				player.addPotionEffect(new PotionEffect(Potion.resistance.id,
						1125, 2));
			}

			System.out.println(answer);
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