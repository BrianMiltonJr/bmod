package com.briansmod.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;

import com.briansmod.blocks.OlCrop;
import com.briansmod.blocks.PerpCrop;
import com.briansmod.blocks.PresidentialCrop;
import com.briansmod.blocks.WeedCrop;
import com.briansmod.blocks.purpKushCrop;
import com.briansmod.blocks.sourDCrop;
import com.briansmod.items.ECookie;
import com.briansmod.items.OompaLoompaBlunt;
import com.briansmod.items.PerpBlunt;
import com.briansmod.items.PigSkin;
import com.briansmod.items.PresidentialBlunt;
import com.briansmod.items.PurpKushBlunt;
import com.briansmod.items.SourDBlunt;
import com.briansmod.items.blunt;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="theWeedMod", name="The Weed Mod", version="2.2")
public class Main {
	
	//Sets Up Creative Tab
	
	public static CreativeTabs tabWeed = new CreativeTabs("tabWeed") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return eCookie;
		}
	};
	
	//Tool Materials
	public static ToolMaterial pigSkinToolMaterial = EnumHelper.addToolMaterial("pigSkinToolMaterial",3, 450, 4.5f, 15.0f, 10);
	
	/*
	----------------------------------------------------------
	----------------------------------------------------------
	|                         Item Variables                  |
	|        												  |
	----------------------------------------------------------
	---------------------------------------------------------- 
	*/
	
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
	
	//Weed plants
	public static Block reggieWeedPlant;
	public static Block perpWeedPlant;
	public static Block presidentialWeedPlant;
	public static Block olWeedPlant;
	public static Block purpKushWeedPlant;
	public static Block sourDWeedPlant;
	
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
	
	public static final String modid = "briansmod";

	
	@EventHandler
     public void preInit(FMLPreInitializationEvent event) {
		
		/*
		----------------------------------------------------------
		----------------------------------------------------------
		|                         Items                           |
		|        												  |
		----------------------------------------------------------
		---------------------------------------------------------- 
		*/
		
		//Weed Crops
		reggieWeedPlant = new WeedCrop().setBlockName("reggieWeedPlant");
		perpWeedPlant = new PerpCrop().setBlockName("perpWeedPlant");
		presidentialWeedPlant = new PresidentialCrop().setBlockName("presidentialWeedPlant");
		olWeedPlant = new OlCrop().setBlockName("olWeedPlant");
		purpKushWeedPlant = new purpKushCrop().setBlockName("purpKushWeedPlant");
		sourDWeedPlant = new sourDCrop().setBlockName("sourDWeedPlant");
		
		//Weed Seeds
		reggieSeed = new ItemSeeds(reggieWeedPlant, Blocks.farmland).setCreativeTab(this.tabWeed).setUnlocalizedName("reggieSeed").setTextureName("briansmod:reggieseed");
		perpSeed = new ItemSeeds(perpWeedPlant, Blocks.farmland).setCreativeTab(this.tabWeed).setUnlocalizedName("perpSeed").setTextureName("briansmod:perpseed");
		presidentialSeed = new ItemSeeds(presidentialWeedPlant, Blocks.farmland).setCreativeTab(this.tabWeed).setUnlocalizedName("presidentialSeed").setTextureName("briansmod:presidentialseed");
		olSeed = new ItemSeeds(olWeedPlant, Blocks.farmland).setCreativeTab(this.tabWeed).setUnlocalizedName("olSeed").setTextureName("briansmod:olseed");
		purpKushSeed = new ItemSeeds(purpKushWeedPlant, Blocks.farmland).setCreativeTab(this.tabWeed).setUnlocalizedName("purpKushSeed").setTextureName("briansmod:presidentialseed");
		sourDSeed = new ItemSeeds(sourDWeedPlant, Blocks.farmland).setCreativeTab(this.tabWeed).setUnlocalizedName("sourDSeed").setTextureName("briansmod:sourdseed");
		
		//Weed Strains
		reggieStrain = new Item().setUnlocalizedName("reggieStrain").setCreativeTab(this.tabWeed).setMaxStackSize(30).setTextureName("briansmod:reggieWeed");
		perpStrain = new Item().setUnlocalizedName("perpStrain").setCreativeTab(this.tabWeed).setMaxStackSize(30).setTextureName("briansmod:perpWeed");
		presidentialStrain = new Item().setUnlocalizedName("presidentialStrain").setCreativeTab(this.tabWeed).setMaxStackSize(30).setTextureName("briansmod:presidentialWeed");
		olStrain = new Item().setUnlocalizedName("olStrain").setCreativeTab(this.tabWeed).setMaxStackSize(30).setTextureName("briansmod:olWeed");
		purpKushStrain = new Item().setUnlocalizedName("purpKushStrain").setCreativeTab(this.tabWeed).setMaxStackSize(30).setTextureName("briansmod:presidentialWeed");
		sourDStrain = new Item().setUnlocalizedName("sourDStrain").setCreativeTab(this.tabWeed).setMaxStackSize(30).setTextureName("briansmod:sourdWeed");

		//Blunts
		rollingPapers = new Item().setCreativeTab(this.tabWeed).setUnlocalizedName("rollingPapers").setTextureName("briansmod:rollingpaper").setMaxStackSize(8);
		reggieBlunt = new blunt(20, 1.0F, false).setCreativeTab(this.tabWeed).setUnlocalizedName("reggieBlunt").setTextureName("briansmod:blunt").setMaxStackSize(8);
		perpBlunt = new PerpBlunt(20, 1.0F, false).setCreativeTab(this.tabWeed).setUnlocalizedName("perpBlunt").setTextureName("briansmod:blunt").setMaxStackSize(8);
		presidentialBlunt = new PresidentialBlunt(0, 1.0F, false).setCreativeTab(this.tabWeed).setUnlocalizedName("presidentialBlunt").setTextureName("briansmod:blunt").setMaxStackSize(8);
		olBlunt = new OompaLoompaBlunt(20, 1.0F, false).setCreativeTab(this.tabWeed).setUnlocalizedName("olBlunt").setTextureName("briansmod:blunt").setMaxStackSize(8);
		purpKushBlunt = new PurpKushBlunt(20, 1.0F, false).setCreativeTab(this.tabWeed).setUnlocalizedName("purpKushBlunt").setTextureName("briansmod:blunt").setMaxStackSize(8);
		sourDBlunt = new SourDBlunt(20, 1.0F, false).setCreativeTab(this.tabWeed).setUnlocalizedName("sourDBlunt").setTextureName("briansmod:blunt").setMaxStackSize(8);
		
		//Edibles Update
		butter = new Item().setCreativeTab(this.tabWeed).setUnlocalizedName("butter").setTextureName("briansmod:butter").setMaxStackSize(64);
		iButter = new Item().setCreativeTab(this.tabWeed).setUnlocalizedName("iButter").setTextureName("briansmod:iButter").setMaxStackSize(64);
		dough = new Item().setCreativeTab(this.tabWeed).setUnlocalizedName("dough").setTextureName("briansmod:dough").setMaxStackSize(64);
		eCookie = new ECookie(20, 1f, true).setCreativeTab(this.tabWeed).setUnlocalizedName("eCookie").setTextureName("briansmod:eCookie").setMaxStackSize(32);
		
		/*
		----------------------------------------------------------
		----------------------------------------------------------
		|                     Game Registry                       |
		|        												  |
		----------------------------------------------------------
		---------------------------------------------------------- 
		*/
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
		
		//Weed Crops
		GameRegistry.registerBlock(reggieWeedPlant, "reggieWeedPlant");
		GameRegistry.registerBlock(perpWeedPlant, "perpWeedPlant");
		GameRegistry.registerBlock(presidentialWeedPlant, "presidentialWeedPlant");
		GameRegistry.registerBlock(olWeedPlant, "olWeedPlant");
		GameRegistry.registerBlock(purpKushWeedPlant, "purpKushWeedPlant");
		GameRegistry.registerBlock(sourDWeedPlant, "sourDWeedPlant");

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
		
		/*
		----------------------------------------------------------
		----------------------------------------------------------
		|                         Recipes                         |
		|        												  |
		----------------------------------------------------------
		---------------------------------------------------------- 
		*/
		//Seeds
		GameRegistry.addShapelessRecipe(new ItemStack(reggieSeed, 1), new ItemStack(Items.wheat_seeds, 1), new ItemStack(Items.wheat_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(perpSeed, 1), new ItemStack(reggieSeed,1 ), new ItemStack(Items.melon_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(presidentialSeed, 1), new ItemStack(Items.melon_seeds, 1), new ItemStack(Items.pumpkin_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(olSeed, 1), new ItemStack(perpSeed, 1), new ItemStack(Items.pumpkin_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(purpKushSeed, 1), new ItemStack(perpSeed, 1), new ItemStack(presidentialSeed, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(sourDSeed, 1), new ItemStack(presidentialSeed, 1), new ItemStack(Items.coal, 1));

		//Blunts
		GameRegistry.addShapelessRecipe(new ItemStack(rollingPapers, 1), new ItemStack(Items.paper, 1), new ItemStack(Items.paper, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(reggieBlunt, 1), new ItemStack(rollingPapers, 1), new ItemStack(reggieStrain, 1), new ItemStack(reggieStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(presidentialBlunt, 1), new ItemStack(rollingPapers, 1), new ItemStack(presidentialStrain, 1), new ItemStack(presidentialStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(perpBlunt, 1), new ItemStack(rollingPapers, 1), new ItemStack(perpStrain, 1), new ItemStack(perpStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(olBlunt, 1), new ItemStack(rollingPapers, 1), new ItemStack(olStrain, 1), new ItemStack(olStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(purpKushBlunt, 1), new ItemStack(rollingPapers, 1), new ItemStack(purpKushStrain, 1), new ItemStack(purpKushStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(sourDBlunt, 1), new ItemStack(rollingPapers, 1), new ItemStack(sourDStrain, 1), new ItemStack(sourDStrain, 1));
		
		//Edibles Update
		GameRegistry.addShapelessRecipe(new ItemStack(butter, 4), new ItemStack(Items.milk_bucket, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(iButter, 1), new ItemStack(butter), new ItemStack(butter), new ItemStack(perpStrain));
		GameRegistry.addShapedRecipe(new ItemStack(dough, 2), new Object[]{"   ", "WMW", "BWB", 'W', Items.wheat, 'M', Items.milk_bucket, 'B', iButter});
		GameRegistry.addSmelting(new ItemStack(dough), new ItemStack(eCookie, 3), 200);
		
	}
     
	@EventHandler
     public void load(FMLInitializationEvent event) {       

		
	}
     
     @EventHandler
     public void postInit(FMLPostInitializationEvent event) {
     }
}
