package com.theweedmod.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.theweedmod.init.WModBlocks;
import com.theweedmod.init.WModItems;
import com.theweedmod.init.WModRecipes;
import com.theweedmod.init.WModTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "theWeedMod", name = "The Weed Mod", version = "2.2.2a")
public class Main
{

	//Creative Tabs
	public static CreativeTabs tabWeed = new WModTabs();
	
	public static final String modid = "theweedmod";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		WModBlocks.init();
		WModItems.init();
		WModRecipes.init();
		
		System.out.println("LOL The Mod Started <3");
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
