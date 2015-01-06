package com.briansmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BModTabs extends CreativeTabs
{
	public BModTabs()
	{
		super(CreativeTabs.getNextID(), "tabWeed");
	}

	public Item getTabIconItem()
	{
		return BModItems.eCookie;
	}
}
