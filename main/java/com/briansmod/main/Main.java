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

import com.briansmod.blocks.OlCrop;
import com.briansmod.blocks.PerpCrop;
import com.briansmod.blocks.PigSkinBlock;
import com.briansmod.blocks.PresidentialCrop;
import com.briansmod.blocks.WeedCrop;
import com.briansmod.blocks.purpKushCrop;
import com.briansmod.blocks.sourDCrop;
import com.briansmod.items.PigSkin;
import com.briansmod.items.blunt;
import com.briansmod.tools.PigSkinAxe;
import com.briansmod.tools.PigSkinHoe;
import com.briansmod.tools.PigSkinShovel;
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
	        return mPlate;
	    }
	};
	
	public static CreativeTabs tabWeed = new CreativeTabs("tabWeed") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return perpStrain;
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
	
	//PigSkin
	public static Item pigAxe;
	public static Item pigSpade;
	public static Item pigHoe;
	public static Item pigPick;
	public static Item flipper;
	public static Block pigSkinBlock;
	public static Item pigSkin;

	// Machine Items
	public static Item mPlate;
	public static Item geneticModule;
	
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
		purpKushSeed = new ItemSeeds(purpKushWeedPlant, Blocks.farmland).setCreativeTab(this.tabWeed).setUnlocalizedName("purpKushSeed").setTextureName("briansmod:presidentialSeed");
		sourDSeed = new ItemSeeds(sourDWeedPlant, Blocks.farmland).setCreativeTab(this.tabWeed).setUnlocalizedName("sourDSeed").setTextureName("briansmod:sourdSeed");
		
		//Weed Strains
		reggieStrain = new Item().setUnlocalizedName("reggieStrain").setCreativeTab(this.tabWeed).setMaxStackSize(30).setTextureName("briansmod:reggieWeed");
		perpStrain = new Item().setUnlocalizedName("perpStrain").setCreativeTab(this.tabWeed).setMaxStackSize(30).setTextureName("briansmod:perpWeed");
		presidentialStrain = new Item().setUnlocalizedName("presidentialStrain").setCreativeTab(this.tabWeed).setMaxStackSize(30).setTextureName("briansmod:presidentialWeed");
		olStrain = new Item().setUnlocalizedName("olStrain").setCreativeTab(this.tabWeed).setMaxStackSize(30).setTextureName("briansmod:olWeed");
		purpKushStrain = new Item().setUnlocalizedName("purpKushStrain").setCreativeTab(this.tabWeed).setMaxStackSize(30).setTextureName("briansmod:presidentialWeed");
		sourDStrain = new Item().setUnlocalizedName("sourDStrain").setCreativeTab(this.tabWeed).setMaxStackSize(30).setTextureName("briansmod:sourdWeed");
		
		//Machines
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
		
		//Blunts
		rollingPapers = new Item().setCreativeTab(this.tabWeed).setUnlocalizedName("rollingPapers").setTextureName("briansmod:rollingpaper").setMaxStackSize(8);
		reggieBlunt = new blunt(0, 0, false, 40, 2, 1.0f).setCreativeTab(this.tabWeed).setUnlocalizedName("reggieBlunt").setTextureName("briansmod:blunt").setMaxStackSize(8);
		perpBlunt = new blunt(0, 0, false, 60, 3, 1.0f).setCreativeTab(this.tabWeed).setUnlocalizedName("perpBlunt").setTextureName("briansmod:blunt").setMaxStackSize(8);
		presidentialBlunt = new blunt(0, 0, false, 80, 4, 1.0f).setCreativeTab(this.tabWeed).setUnlocalizedName("presidentialBlunt").setTextureName("briansmod:blunt").setMaxStackSize(8);
		olBlunt = new blunt(0, 0, false, 100, 5, 1.0f).setCreativeTab(this.tabWeed).setUnlocalizedName("olBlunt").setTextureName("briansmod:blunt").setMaxStackSize(8);
		purpKushBlunt = new blunt(0, 0, false, 30, 12, 1.0f).setCreativeTab(this.tabWeed).setUnlocalizedName("purpKushBlunt").setTextureName("briansmod:blunt").setMaxStackSize(8);
		sourDBlunt = new blunt(0, 0, false, 55, 8, 1.0f).setCreativeTab(this.tabWeed).setUnlocalizedName("sourDBlunt").setTextureName("briansmod:blunt").setMaxStackSize(8);
		
		
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
		
		//Machines
		GameRegistry.registerItem(mPlate, "mPlate");
		GameRegistry.registerItem(geneticModule, "geneticModule");
		
		//Pig Skin Mod (My First Project Intergrated)
		GameRegistry.registerItem(pigAxe, "pigAxe");
		GameRegistry.registerItem(pigSpade, "pigSpade");
		GameRegistry.registerItem(pigHoe, "pigHoe");
		GameRegistry.registerItem(pigPick, "pigPick");
		GameRegistry.registerItem(flipper, "flipper");
		GameRegistry.registerBlock(pigSkinBlock, "pigSkinBlock");
		GameRegistry.registerItem(pigSkin, "pigSkin");
		
		//Blunts
		GameRegistry.registerItem(rollingPapers, "rollingPapers");
		GameRegistry.registerItem(reggieBlunt, "reggieBlunt");
		GameRegistry.registerItem(perpBlunt, "perpBlunt");
		GameRegistry.registerItem(presidentialBlunt, "presidentialBlunt");
		GameRegistry.registerItem(olBlunt, "olBlunt");
		GameRegistry.registerItem(purpKushBlunt, "purpKushBlunt");
		GameRegistry.registerItem(sourDBlunt, "sourDBlunt");
		
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
		
		//Machines
		GameRegistry.addShapedRecipe(new ItemStack(mPlate, 1), new Object[] {"III", "III", "   ", 'I', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(mPlate, 1), new Object[] {"   ", "III", "III", 'I', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(geneticModule, 1), new Object[] {"MRM", "RGR", "MRM", 'M', mPlate, 'R', Items.redstone, 'G', Items.glowstone_dust});
	
		//PigSkin Mod
		GameRegistry.addShapedRecipe(new ItemStack(flipper, 1), new Object[] {" GG", " PG", "P  ", 'P', pigSkinBlock, 'G', Blocks.gold_block});
		GameRegistry.addShapedRecipe(new ItemStack(pigSkinBlock, 1), new Object[] {"PPP", "PPP", "PPP", 'P', pigSkin});
		GameRegistry.addSmelting(Items.cooked_porkchop, new ItemStack(pigSkin), 450);
		
		//Blunts
		GameRegistry.addShapelessRecipe(new ItemStack(rollingPapers, 1), new ItemStack(Items.paper, 1), new ItemStack(Items.paper, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(reggieBlunt, 1), new ItemStack(rollingPapers, 1), new ItemStack(reggieStrain, 1), new ItemStack(reggieStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(presidentialBlunt, 1), new ItemStack(rollingPapers, 1), new ItemStack(presidentialStrain, 1), new ItemStack(presidentialStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(perpBlunt, 1), new ItemStack(rollingPapers, 1), new ItemStack(perpStrain, 1), new ItemStack(perpStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(olBlunt, 1), new ItemStack(rollingPapers, 1), new ItemStack(olStrain, 1), new ItemStack(olStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(purpKushBlunt, 1), new ItemStack(rollingPapers, 1), new ItemStack(purpKushStrain, 1), new ItemStack(purpKushStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(sourDBlunt, 1), new ItemStack(rollingPapers, 1), new ItemStack(sourDStrain, 1), new ItemStack(sourDStrain, 1));
		
	}
     
	@EventHandler
     public void load(FMLInitializationEvent event) {       

		
	}
     
     @EventHandler
     public void postInit(FMLPostInitializationEvent event) {
     }
}
