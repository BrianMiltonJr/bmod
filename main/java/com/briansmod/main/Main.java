package com.briansmod.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import com.briansmod.blocks.BMCrop;
import com.briansmod.blocks.PigSkinBlock;
import com.briansmod.blocks.PresidentialWeedCrop;
import com.briansmod.blocks.SeedMachine;
import com.briansmod.items.PigSkin;
import com.briansmod.items.blunt;
import com.briansmod.tools.PigSkinAxe;
import com.briansmod.tools.PigSkinHoe;
import com.briansmod.tools.PigSkinShovel;
import com.briansmod.weapons.Dagger;
import com.briansmod.weapons.Flipper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="briansmod", name="briansmod", version="2.1.2")
public class Main {
	
	//Sets Up Creative Tab
	public static CreativeTabs tabCustom = new CreativeTabs("briansmod") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return reggieBlunt;
	    }
	};
	
	//Tool Materials
	public static ToolMaterial steeleToolMaterial = EnumHelper.addToolMaterial("steeleToolMaterial", 3, 750, 6.0f, 2.5f, 10);
	public static ToolMaterial tsteeleToolMaterial = EnumHelper.addToolMaterial("tsteeleToolMaterial", 3, 800, 7.5f, 2.7f, 10);
	public static ToolMaterial pigSkinToolMaterial = EnumHelper.addToolMaterial("pigSkinToolMaterial",3, 450, 4.5f, 15.0f, 10);
	
	/*
	----------------------------------------------------------
	----------------------------------------------------------
	|                         Item Variables                  |
	|        												  |
	----------------------------------------------------------
	---------------------------------------------------------- 
	*/
	
	//PigSkin
	public static Item pigAxe;
	public static Item pigSpade;
	public static Item pigHoe;
	public static Item pigPick;
	public static Item flipper;
	public static Block pigSkinBlock;
	public static Item pigSkin;
	
	//Daggers
	public static Item sDagger;
	public static Item tDagger;
	
	// Machine Items
	public static Item mPlate;
	public static Item geneticModule;
	public static Block seedMachine;
	
	//Seeds
	public static Item reggieSeed;
	public static Item perpSeed;
	public static Item presidentialSeed;
	public static Item olSeed;
	
	//Weed Strains
	public static Item reggieWeed;
	public static Item perpWeed;
	public static Item presidentialWeed;
	public static Item olWeed;
	
	//Plants
	public static Block reggieWeedPlant;
	public static Block perpWeedPlant;
	public static Block presidentialWeedPlant;
	public static Block olWeedPlant;
	
	//Blunts
	public static Item reggieBlunt;
	public static Item perpBlunt;
	public static Item presidentialBlunt;
	public static Item olBlunt;
	public static Item rollingPapers;
	
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
		//Weed Seeds
		reggieSeed = new ItemSeeds(reggieWeedPlant, Blocks.farmland).setCreativeTab(this.tabCustom).setUnlocalizedName("reggieSeed").setTextureName("briansmod:reggieseed");
		perpSeed = new ItemSeeds(perpWeedPlant, Blocks.farmland).setCreativeTab(this.tabCustom).setUnlocalizedName("perpSeed").setTextureName("briansmod:perpseed");
		presidentialSeed = new ItemSeeds(presidentialWeedPlant, Blocks.farmland).setCreativeTab(this.tabCustom).setUnlocalizedName("presidentialSeed").setTextureName("briansmod:presseed");
		olSeed = new ItemSeeds(olWeedPlant, Blocks.farmland).setCreativeTab(this.tabCustom).setUnlocalizedName("olSeed").setTextureName("briansmod:olseed");
		
		//Weed Plants
		reggieWeedPlant = new BMCrop().setBlockName("reggieWeedPlant");
		perpWeedPlant = new BMCrop().setBlockName("perpWeedPlant");
		presidentialWeedPlant = new BMCrop().setBlockName("presidentialWeedPlant");
		olWeedPlant = new BMCrop().setBlockName("olWeedPlant");
		
		//Weed Strains
		reggieWeed = new Item().setUnlocalizedName("reggieWeed").setCreativeTab(this.tabCustom).setMaxStackSize(29).setTextureName("briansmod:reggieweed");
		perpWeed = new Item().setUnlocalizedName("perpWeed").setCreativeTab(this.tabCustom).setMaxStackSize(29).setTextureName("briansmod:perpweed");
		presidentialWeed = new Item().setUnlocalizedName("presidentialWeed").setCreativeTab(this.tabCustom).setMaxStackSize(29).setTextureName("briansmod:presidentialweed");
		olWeed = new Item().setUnlocalizedName("olWeed").setCreativeTab(this.tabCustom).setMaxStackSize(29).setTextureName("briansmod:olweed");
		
		//Blunts
		reggieBlunt = new blunt(0, 0, false, 40, 1, 1.0f).setUnlocalizedName("reggieBlunt").setCreativeTab(this.tabCustom).setMaxStackSize(16).setTextureName("briansmod:blunt");
		rollingPapers = new Item().setUnlocalizedName("rollingPapers").setCreativeTab(this.tabCustom).setMaxStackSize(8).setTextureName("briansmod:rollingpaper");
		
		//Machines
		seedMachine = new SeedMachine(Material.iron).setHardness(5f).setStepSound(Block.soundTypeMetal).setBlockName("seedMachine").setCreativeTab(this.tabCustom).setBlockTextureName("briansmod:seedmachine");
		geneticModule = new Item().setUnlocalizedName("geneticModule").setCreativeTab(this.tabCustom).setMaxStackSize(64).setTextureName("briansmod:gmodule");
		mPlate = new Item().setUnlocalizedName("mPlate").setCreativeTab(this.tabCustom).setMaxStackSize(64).setTextureName("briansmod:mplate");
		
		//PigSkin
		pigAxe = new PigSkinAxe(pigSkinToolMaterial).setUnlocalizedName("pigAxe").setCreativeTab(this.tabCustom).setMaxStackSize(1).setTextureName("briansmod:pigaxe");
		pigSpade = new PigSkinShovel(pigSkinToolMaterial).setUnlocalizedName("pigSpade").setCreativeTab(this.tabCustom).setMaxStackSize(1).setTextureName("briansmod:pigspade");
		pigHoe = new PigSkinHoe(pigSkinToolMaterial).setUnlocalizedName("pigHoe").setCreativeTab(this.tabCustom).setMaxStackSize(1).setTextureName("briansmod:pighoe");
		pigPick = new PigSkinAxe(pigSkinToolMaterial).setUnlocalizedName("pigPick").setCreativeTab(this.tabCustom).setMaxStackSize(1).setTextureName("briansmod:pigpick");
		flipper = new Flipper(pigSkinToolMaterial).setUnlocalizedName("flipper").setCreativeTab(this.tabCustom).setMaxStackSize(1).setTextureName("briansmod:flipper");
		pigSkinBlock = new PigSkinBlock(Material.wood).setHardness(0.5f).setCreativeTab(this.tabCustom).setBlockName("pigSkinBlock").setBlockTextureName("briansmod:pigskinblock");
		pigSkin = new PigSkin().setCreativeTab(this.tabCustom).setMaxStackSize(16).setUnlocalizedName("pigSkin").setTextureName("briansmod:pigskin");
		
		//Daggers
		sDagger = new Dagger(steeleToolMaterial).setCreativeTab(this.tabCustom).setMaxStackSize(1).setUnlocalizedName("sDagger").setTextureName("briansmod:steeledagger");
		tDagger = new Dagger(tsteeleToolMaterial).setCreativeTab(this.tabCustom).setMaxStackSize(1).setUnlocalizedName("tDagger").setTextureName("briansmod:rsteeldagger");
		
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
		
		//Weed Plants
		GameRegistry.registerBlock(reggieWeedPlant, "reggieWeedPlant");
		GameRegistry.registerBlock(perpWeedPlant, "perpWeedPlant");
		GameRegistry.registerBlock(presidentialWeedPlant, "presidentialWeedPlant");
		GameRegistry.registerBlock(olWeedPlant, "olWeedPlant");
		
		//Weed Strains
		GameRegistry.registerItem(reggieWeed, "reggieWeed");
		GameRegistry.registerItem(perpWeed, "perpWeed");
		GameRegistry.registerItem(presidentialWeed, "presidentialWeed");
		GameRegistry.registerItem(olWeed, "olWeed");
		
		//Machines
		GameRegistry.registerBlock(seedMachine, "seedMachine");
		GameRegistry.registerItem(mPlate, "mPlate");
		GameRegistry.registerItem(geneticModule, "geneticModule");
		
		//Blunts
		GameRegistry.registerItem(reggieBlunt, "reggieBlunt");
		GameRegistry.registerItem(rollingPapers, "rollingPapers");
		
		//Pig Skin Mod (My First Project Intergrated)
		GameRegistry.registerItem(pigAxe, "pigAxe");
		GameRegistry.registerItem(pigSpade, "pigSpade");
		GameRegistry.registerItem(pigHoe, "pigHoe");
		GameRegistry.registerItem(pigPick, "pigPick");
		GameRegistry.registerItem(flipper, "flipper");
		GameRegistry.registerBlock(pigSkinBlock, "pigSkinBlock");
		GameRegistry.registerItem(pigSkin, "pigSkin");
		
		//Daggers
		GameRegistry.registerItem(sDagger, "sDagger");
		GameRegistry.registerItem(tDagger, "tDagger");
		
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
		GameRegistry.addShapelessRecipe(new ItemStack(perpSeed, 1), new ItemStack(reggieSeed, 1), new ItemStack(Items.melon_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(presidentialSeed, 1), new ItemStack(Items.melon_seeds, 1), new ItemStack(Items.pumpkin_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(olSeed, 1), new ItemStack(perpSeed, 1), new ItemStack(Items.pumpkin_seeds, 1));
		
		//Machines
		GameRegistry.addShapedRecipe(new ItemStack(mPlate, 1), new Object[] {"III", "III", "   ", 'I', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(mPlate, 1), new Object[] {"   ", "III", "III", 'I', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(geneticModule, 1), new Object[] {"MRM", "RGR", "MRM", 'M', mPlate, 'R', Items.redstone, 'G', Items.glowstone_dust});
		
		//Blunts
		GameRegistry.addShapelessRecipe(new ItemStack(rollingPapers, 1), new ItemStack(Items.paper, 1), new ItemStack(Items.paper));
		GameRegistry.addShapelessRecipe(new ItemStack(reggieBlunt, 1), new ItemStack(reggieWeed, 1), new ItemStack(reggieWeed, 1), new ItemStack(rollingPapers, 1));
		
		//PigSkin Mod
		GameRegistry.addShapedRecipe(new ItemStack(flipper, 1), new Object[] {" GG", " PG", "P  ", 'P', pigSkinBlock, 'G', Blocks.gold_block});
		GameRegistry.addShapedRecipe(new ItemStack(pigSkinBlock, 1), new Object[] {"PPP", "PPP", "PPP", 'P', pigSkin});
		GameRegistry.addSmelting(Items.cooked_porkchop, new ItemStack(pigSkin), 450);
	
	}
     
	@EventHandler
     public void load(FMLInitializationEvent event) {       

		
	}
     
     @EventHandler
     public void postInit(FMLPostInitializationEvent event) {
     }
}
