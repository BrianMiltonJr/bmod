package com.theweedmod.init;

import com.theweedmod.items.WModEdibles;
import com.theweedmod.items.WModSeeds;
import com.theweedmod.items.WModStrain;
import com.theweedmod.items.ECookie;
import com.theweedmod.items.OompaLoompaBlunt;
import com.theweedmod.items.PerpBlunt;
import com.theweedmod.items.PresidentialBlunt;
import com.theweedmod.items.PurpKushBlunt;
import com.theweedmod.items.SourDBlunt;
import com.theweedmod.items.Blunt;
import com.theweedmod.main.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class WModItems
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
	public static Item cNuggetsRaw;
	public static Item cNuggets;
	public static Item cNuggetsInfusedRaw;
	public static Item cNuggetsInfused;
	public static Item porkchopInfusedRaw;
	public static Item porkchopInfused;
	public static Item steakInfusedRaw;
	public static Item steakInfused;
	public static Item potatoInfusedRaw;
	public static Item potatoInfused;
	
	public static void init()
	{
		//Weed Seeds
		reggieSeed = new WModSeeds(WModBlocks.reggieWeedPlant, "reggieSeed").setTextureName(Main.modid + ":reggieseed");
		perpSeed = new WModSeeds(WModBlocks.perpWeedPlant, "perpSeed").setTextureName(Main.modid + ":perpseed");
		presidentialSeed = new WModSeeds(WModBlocks.presidentialWeedPlant, "presidentialSeed").setTextureName(Main.modid + ":presidentialseed");
		olSeed = new WModSeeds(WModBlocks.olWeedPlant, "olSeed").setTextureName(Main.modid + ":olseed");
		purpKushSeed = new WModSeeds(WModBlocks.purpKushWeedPlant, "purpKushSeed").setTextureName(Main.modid + ":presidentialseed");
		sourDSeed = new WModSeeds(WModBlocks.sourDWeedPlant, "sourDSeed").setTextureName(Main.modid + ":sourdseed");
		
		//Weed Strains
		reggieStrain = new WModStrain().setUnlocalizedName("reggieStrain").setTextureName(Main.modid + ":reggieWeed");
		perpStrain = new WModStrain().setUnlocalizedName("perpStrain").setTextureName(Main.modid + ":perpWeed");
		presidentialStrain = new WModStrain().setUnlocalizedName("presidentialStrain").setTextureName(Main.modid + ":presidentialWeed");
		olStrain = new WModStrain().setUnlocalizedName("olStrain").setTextureName(Main.modid + ":olWeed");
		purpKushStrain = new WModStrain().setUnlocalizedName("purpKushStrain").setTextureName(Main.modid + ":presidentialWeed");
		sourDStrain = new WModStrain().setUnlocalizedName("sourDStrain").setTextureName(Main.modid + ":sourdWeed");

		//Blunts
		rollingPapers = new Item().setCreativeTab(Main.tabWeed).setUnlocalizedName("rollingPapers").setTextureName(Main.modid + ":rollingpaper");
		reggieBlunt = new Blunt(20, 1.0F, false).setUnlocalizedName("reggieBlunt").setTextureName(Main.modid + ":blunt");
		perpBlunt = new PerpBlunt(20, 1.0F, false).setUnlocalizedName("perpBlunt").setTextureName(Main.modid + ":blunt");
		presidentialBlunt = new PresidentialBlunt(0, 1.0F, false).setUnlocalizedName("presidentialBlunt").setTextureName(Main.modid + ":blunt");
		olBlunt = new OompaLoompaBlunt(20, 1.0F, false).setUnlocalizedName("olBlunt").setTextureName(Main.modid + ":blunt");
		purpKushBlunt = new PurpKushBlunt(20, 1.0F, false).setUnlocalizedName("purpKushBlunt").setTextureName(Main.modid + ":blunt");
		sourDBlunt = new SourDBlunt(20, 1.0F, false).setUnlocalizedName("sourDBlunt").setTextureName(Main.modid + ":blunt");
		
		//Edibles Update
		butter = new Item().setUnlocalizedName("butter").setTextureName(Main.modid + ":butter").setCreativeTab(Main.tabWeed);
		iButter = new Item().setUnlocalizedName("iButter").setTextureName(Main.modid + ":iButter").setCreativeTab(Main.tabWeed);
		dough = new Item().setUnlocalizedName("dough").setTextureName(Main.modid + ":dough");
		eCookie = new ECookie().setUnlocalizedName("eCookie").setTextureName(Main.modid + ":eCookie");
		cNuggetsRaw = new Item().setUnlocalizedName("cNuggetsRaw").setTextureName(Main.modid + ":cNuggetRaw").setCreativeTab(CreativeTabs.tabFood);
		cNuggets = new ItemFood(3, .5f, true).setUnlocalizedName("cNuggets").setTextureName(Main.modid + ":cNugget").setCreativeTab(CreativeTabs.tabFood);
		cNuggetsInfusedRaw = new Item().setUnlocalizedName("cNuggetsInfusedRaw").setTextureName(Main.modid + ":cNuggetInfusedRaw").setCreativeTab(Main.tabWeed);
		cNuggetsInfused = new WModEdibles(3, .5f, false).setUnlocalizedName("cNuggetsInfused").setTextureName(Main.modid + ":cNuggetInfused");
		porkchopInfusedRaw = new Item().setUnlocalizedName("porkchopInfusedRaw").setTextureName(Main.modid + ":porkchopInfusedRaw").setCreativeTab(Main.tabWeed);
		porkchopInfused = new WModEdibles(10, 1f, false).setUnlocalizedName("porkchopInfused").setTextureName(Main.modid + ":porkchopInfused");
		steakInfusedRaw = new Item().setUnlocalizedName("steakInfusedRaw").setTextureName(Main.modid + ":steakInfusedRaw").setCreativeTab(Main.tabWeed);
		steakInfused = new WModEdibles(10, 1f, false).setUnlocalizedName("steakInfused").setTextureName(Main.modid + ":steakInfused");
		potatoInfusedRaw = new Item().setUnlocalizedName("potatoInfusedRaw").setTextureName(Main.modid + ":potatoInfusedRaw").setCreativeTab(Main.tabWeed);
		potatoInfused = new WModEdibles(5, .3f, false).setUnlocalizedName("potatoInfused").setTextureName(Main.modid + ":potatoInfused");
		
		
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
		GameRegistry.registerItem(cNuggetsRaw, "cNuggetsRaw");
		GameRegistry.registerItem(cNuggets, "cNuggets");
		GameRegistry.registerItem(cNuggetsInfusedRaw, "cNuggetsInfusedRaw");
		GameRegistry.registerItem(cNuggetsInfused, "cNuggetsInfused");
		GameRegistry.registerItem(porkchopInfusedRaw, "porkchopInfusedRaw");
		GameRegistry.registerItem(porkchopInfused, "porkchopInfused");
		GameRegistry.registerItem(steakInfusedRaw, "steakInfusedRaw");
		GameRegistry.registerItem(steakInfused, "steakInfused");
		GameRegistry.registerItem(potatoInfusedRaw, "potatoInfusedRaw");
		GameRegistry.registerItem(potatoInfused, "potatoInfused");
	}
}
