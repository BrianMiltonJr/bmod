package com.briansmod.init;

import com.briansmod.blocks.OlCrop;
import com.briansmod.blocks.PerpCrop;
import com.briansmod.blocks.PresidentialCrop;
import com.briansmod.blocks.WeedCrop;
import com.briansmod.blocks.PurpKushCrop;
import com.briansmod.blocks.SourDCrop;

import net.minecraft.block.Block;

public class BModBlocks
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
		reggieWeedPlant = new WeedCrop();
		perpWeedPlant = new PerpCrop();
		presidentialWeedPlant = new PresidentialCrop();
		olWeedPlant = new OlCrop();
		purpKushWeedPlant = new PurpKushCrop();
		sourDWeedPlant = new SourDCrop();
	}
}
