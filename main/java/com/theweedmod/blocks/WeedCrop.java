package com.theweedmod.blocks;

import java.util.Random;

import com.theweedmod.init.WModItems;
import com.theweedmod.main.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class WeedCrop extends BlockCrops
{
	private static final String name = "reggieWeedPlant";

	@SideOnly(Side.CLIENT)
	private IIcon[] iconArray;
	
	public WeedCrop()
	{
		setBlockName(name);
		GameRegistry.registerBlock(this, name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.iconArray = new IIcon[4];

		for (int i = 0; i < this.iconArray.length; i++)
		{
			this.iconArray[i] = iconRegister.registerIcon(Main.modid + ":" + this.getUnlocalizedName().substring(5) + (i + 1));
		}
	}

	public IIcon getIcon(int side, int metadata)
	{
		if (metadata < 7)
		{
			if (metadata == 6)
			{
				metadata = 5;
			}
			return this.iconArray[metadata >> 1];
		}
		return this.iconArray[3];
	}

	public int quantityDropped(Random random)
	{
		return 1;
	}

	protected Item func_149866_i()
	{
		return WModItems.reggieSeed;
	}

	protected Item func_149865_P()
	{
		return WModItems.reggieStrain;
	}
}
