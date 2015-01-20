package com.theweedmod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.theweedmod.main.Main;

public class ECookie extends ItemFood
{

	public ECookie()
	{
		super(20, 1f, true);
		setAlwaysEdible();
		setCreativeTab(Main.tabWeed);
		setUnlocalizedName("eCookie");
		setTextureName("briansmod:eCookie");
		setMaxStackSize(32);
	}

	protected void onFoodEaten(ItemStack itemStack, World world,
			EntityPlayer player)
	{
		if (!world.isRemote)
		{
			player.addPotionEffect(new PotionEffect(Potion.confusion.id, 1200, 5));
		} else
		{
			super.onFoodEaten(itemStack, world, player);
		}
	}

}
