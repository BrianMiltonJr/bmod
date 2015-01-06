package com.briansmod.init;

import com.briansmod.items.BModSeeds;
import com.briansmod.items.BModStrain;
import com.briansmod.items.ECookie;
import com.briansmod.items.OompaLoompaBlunt;
import com.briansmod.items.PerpBlunt;
import com.briansmod.items.PresidentialBlunt;
import com.briansmod.items.PurpKushBlunt;
import com.briansmod.items.SourDBlunt;
import com.briansmod.items.Blunt;
import com.briansmod.main.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class BModItems
{
	//Weed Seeds
	public static Item reggieSeed;
	public static Item perpSeed;
	public static Item presidentialSeed;
	public static Item olSeed;
	public static Item purpKushSeed;
	public static Item sourDSeed;
	
	//Weed Strains
	public static Item reggieStrain;
	public static Item perpStrain;
	public static Item presidentialStrain;
	public static Item olStrain;
	public static Item purpKushStrain;
	public static Item sourDStrain;
	
	//Blunt Items
	public static Item rollingPapers;
	public static Item reggieBlunt;
	public static Item perpBlunt;
	public static Item presidentialBlunt;
	public static Item olBlunt;
	public static Item purpKushBlunt;
	public static Item sourDBlunt;

	// Edibles Update
	public static Item dough;
	public static Item butter;
	public static Item iButter;
	public static Item eCookie;
	
	public static void init()
	{
		//Weed Seeds
		reggieSeed = new BModSeeds(BModBlocks.reggieWeedPlant, "reggieSeed").setTextureName("briansmod:reggieseed");
		perpSeed = new BModSeeds(BModBlocks.perpWeedPlant, "perpSeed").setTextureName("briansmod:perpseed");
		presidentialSeed = new BModSeeds(BModBlocks.presidentialWeedPlant, "presidentialSeed").setTextureName("briansmod:presidentialseed");
		olSeed = new BModSeeds(BModBlocks.olWeedPlant, "olSeed").setTextureName("briansmod:olseed");
		purpKushSeed = new BModSeeds(BModBlocks.purpKushWeedPlant, "purpKushSeed").setTextureName("briansmod:presidentialseed");
		sourDSeed = new BModSeeds(BModBlocks.sourDWeedPlant, "sourDSeed").setTextureName("briansmod:sourdseed");
		
		//Weed Strains
		reggieStrain = new BModStrain().setUnlocalizedName("reggieStrain").setTextureName("briansmod:reggieWeed");
		perpStrain = new BModStrain().setUnlocalizedName("perpStrain").setTextureName("briansmod:perpWeed");
		presidentialStrain = new BModStrain().setUnlocalizedName("presidentialStrain").setTextureName("briansmod:presidentialWeed");
		olStrain = new BModStrain().setUnlocalizedName("olStrain").setTextureName("briansmod:olWeed");
		purpKushStrain = new BModStrain().setUnlocalizedName("purpKushStrain").setTextureName("briansmod:presidentialWeed");
		sourDStrain = new BModStrain().setUnlocalizedName("sourDStrain").setTextureName("briansmod:sourdWeed");

		//Blunts
		rollingPapers = new Item().setCreativeTab(Main.tabWeed).setUnlocalizedName("rollingPapers").setTextureName("briansmod:rollingpaper");
		
		reggieBlunt = new Blunt(20, 1.0F, false).setUnlocalizedName("reggieBlunt").setTextureName("briansmod:blunt");
		perpBlunt = new PerpBlunt(20, 1.0F, false).setUnlocalizedName("perpBlunt").setTextureName("briansmod:blunt");
		presidentialBlunt = new PresidentialBlunt(0, 1.0F, false).setUnlocalizedName("presidentialBlunt").setTextureName("briansmod:blunt");
		olBlunt = new OompaLoompaBlunt(20, 1.0F, false).setUnlocalizedName("olBlunt").setTextureName("briansmod:blunt");
		purpKushBlunt = new PurpKushBlunt(20, 1.0F, false).setUnlocalizedName("purpKushBlunt").setTextureName("briansmod:blunt");
		sourDBlunt = new SourDBlunt(20, 1.0F, false).setUnlocalizedName("sourDBlunt").setTextureName("briansmod:blunt");
		
		//Edibles Update
		butter = new Item().setUnlocalizedName("butter").setTextureName("briansmod:butter");
		iButter = new Item().setUnlocalizedName("iButter").setTextureName("briansmod:iButter");
		dough = new Item().setUnlocalizedName("dough").setTextureName("briansmod:dough");
		eCookie = new ECookie();
		
		//Weed Seeds
		GameRegistry.registerItem(reggieSeed, "reggieSeed");
		GameRegistry.registerItem(perpSeed, "perpSeed");
		GameRegistry.registerItem(presidentialSeed, "presidentialSeed");
		GameRegistry.registerItem(olSeed, "olSeed");
		GameRegistry.registerItem(purpKushSeed, "purpKushSeed");
		GameRegistry.registerItem(sourDSeed, "sourDSeed");
		
		//Weed Strains
		GameRegistry.registerItem(reggieStrain, "reggieStrain");
		GameRegistry.registerItem(perpStrain, "perpStrain");
		GameRegistry.registerItem(presidentialStrain, "presidentialStrain");
		GameRegistry.registerItem(olStrain, "olStrain");
		GameRegistry.registerItem(purpKushStrain, "purpKushStrain");
		GameRegistry.registerItem(sourDStrain, "sourDStrain");

		//Blunts
		GameRegistry.registerItem(rollingPapers, "rollingPapers");
		GameRegistry.registerItem(reggieBlunt, "reggieBlunt");
		GameRegistry.registerItem(perpBlunt, "perpBlunt");
		GameRegistry.registerItem(presidentialBlunt, "presidentialBlunt");
		GameRegistry.registerItem(olBlunt, "olBlunt");
		GameRegistry.registerItem(purpKushBlunt, "purpKushBlunt");
		GameRegistry.registerItem(sourDBlunt, "sourDBlunt");
		
		//Edibles Update
		GameRegistry.registerItem(butter, "butter");
		GameRegistry.registerItem(iButter, "iButter");
		GameRegistry.registerItem(dough, "dough");
		GameRegistry.registerItem(eCookie, "eCookie");
	}
}
