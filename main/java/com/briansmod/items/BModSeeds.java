package com.briansmod.items;

import com.briansmod.main.Main;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class BModSeeds extends ItemSeeds
{
	public BModSeeds(Block plant, String unlocalizedName)
	{
		super(plant, Blocks.farmland);
		setCreativeTab(Main.tabWeed);
		setUnlocalizedName(unlocalizedName);
	}

}
