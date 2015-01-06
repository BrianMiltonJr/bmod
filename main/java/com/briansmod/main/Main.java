package com.briansmod.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.briansmod.init.BModBlocks;
import com.briansmod.init.BModItems;
import com.briansmod.init.BModRecipes;
import com.briansmod.init.BModTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "theWeedMod", name = "The Weed Mod", version = "2.2")
public class Main
{
	// Tool Materials
	public static ToolMaterial pigSkinToolMaterial = EnumHelper.addToolMaterial("pigSkinToolMaterial", 3, 450, 4.5f, 15.0f, 10);

	//Creative Tabs
	public static CreativeTabs tabWeed = new BModTabs();
	
	public static final String modid = "briansmod";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		BModBlocks.init();
		BModItems.init();
		BModRecipes.init();
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
