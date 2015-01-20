package com.theweedmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WModTabs extends CreativeTabs
{
	public WModTabs()
	{
		super(CreativeTabs.getNextID(), "tabWeed");
	}

	public Item getTabIconItem()
	{
		return WModItems.eCookie;
	}
}
