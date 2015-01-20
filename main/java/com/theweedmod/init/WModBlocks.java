package com.theweedmod.init;

import com.theweedmod.blocks.OlCrop;
import com.theweedmod.blocks.PerpCrop;
import com.theweedmod.blocks.PresidentialCrop;
import com.theweedmod.blocks.WeedCrop;
import com.theweedmod.blocks.PurpKushCrop;
import com.theweedmod.blocks.SourDCrop;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class WModBlocks
{
	// Weed plants
	public static Block reggieWeedPlant;
	public static Block perpWeedPlant;
	public static Block presidentialWeedPlant;
	public static Block olWeedPlant;
	public static Block purpKushWeedPlant;
	public static Block sourDWeedPlant;
	
	public static void init()
	{
		//Weed Crops
		reggieWeedPlant = new WeedCrop().setBlockName("reggieWeedPlant");
		perpWeedPlant = new PerpCrop().setBlockName("perpWeedPlant");
		presidentialWeedPlant = new PresidentialCrop().setBlockName("presidentialWeedPlant");
		olWeedPlant = new OlCrop().setBlockName("olWeedPlant");
		purpKushWeedPlant = new PurpKushCrop().setBlockName("purpKushWeedPlant");
		sourDWeedPlant = new SourDCrop().setBlockName("sourDWeedPlant");

	}
}
