package com.theweedmod.items;

import com.theweedmod.main.Main;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class WModSeeds extends ItemSeeds
{
	public WModSeeds(Block plant, String unlocalizedName)
	{
		super(plant, Blocks.farmland);
		setCreativeTab(Main.tabWeed);
		setUnlocalizedName(unlocalizedName);
	}

}
