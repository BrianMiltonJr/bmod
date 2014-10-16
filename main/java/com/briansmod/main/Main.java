package com.briansmod.main;

import com.briansmod.blocks.PigSkinBlock;
import com.briansmod.items.PigSkin;
import com.briansmod.tools.PigSkinAxe;
import com.briansmod.tools.PigSkinHoe;
import com.briansmod.tools.PigSkinShovel;
import com.briansmod.weapons.Dagger;
import com.briansmod.weapons.Flipper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="briansmod", name="briansmod", version="2.1.0")
public class Main {
	
	public static CreativeTabs tabCustom = new CreativeTabs("briansmod") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return sdagger;
	    }
	};
	
	public static ToolMaterial steeleToolMaterial = EnumHelper.addToolMaterial("steeleToolMaterial", 3, 750, 6.0f, 2.5f, 10);
	public static ToolMaterial tsteeleToolMaterial = EnumHelper.addToolMaterial("tsteeleToolMaterial", 3, 800, 7.5f, 2.7f, 10);
	public static ToolMaterial pigSkinToolMaterial = EnumHelper.addToolMaterial("pigSkinToolMaterial",3, 450, 4.5f, 15.0f, 10);
	
	public static Item pigaxe;
	public static Item pigspade;
	public static Item pighoe;
	public static Item pigpick;
	public static Item flipper;
	public static Block pigskinblock;
	public static Item pigskin;
	public static Item sdagger;
	public static Item tdagger;
	
	@EventHandler
     public void preInit(FMLPreInitializationEvent event) {
		
		pigaxe = new PigSkinAxe(pigSkinToolMaterial).setUnlocalizedName("pigaxe").setCreativeTab(this.tabCustom).setMaxStackSize(1).setTextureName("briansmod:pigaxe");
		pigspade = new PigSkinShovel(pigSkinToolMaterial).setUnlocalizedName("pigspade").setCreativeTab(this.tabCustom).setMaxStackSize(1).setTextureName("briansmod:pigspade");
		pighoe = new PigSkinHoe(pigSkinToolMaterial).setUnlocalizedName("pighoe").setCreativeTab(this.tabCustom).setMaxStackSize(1).setTextureName("briansmod:pighoe");
		pigpick = new PigSkinAxe(pigSkinToolMaterial).setUnlocalizedName("pigpick").setCreativeTab(this.tabCustom).setMaxStackSize(1).setTextureName("briansmod:pigpick");
		flipper = new Flipper(pigSkinToolMaterial).setUnlocalizedName("flipper").setCreativeTab(this.tabCustom).setMaxStackSize(1).setTextureName("briansmod:flipper");
		pigskinblock = new PigSkinBlock(Material.wood).setCreativeTab(this.tabCustom).setBlockName("pigskinblock").setBlockTextureName("briansmod:pigskinblock");
		pigskin = new PigSkin().setCreativeTab(this.tabCustom).setMaxStackSize(16).setUnlocalizedName("pigskin").setTextureName("briansmod:pigskin");
		sdagger = new Dagger(steeleToolMaterial).setCreativeTab(this.tabCustom).setMaxStackSize(1).setUnlocalizedName("sdagger").setTextureName("briansmod:steeledagger");
		tdagger = new Dagger(tsteeleToolMaterial).setCreativeTab(this.tabCustom).setMaxStackSize(1).setUnlocalizedName("tdagger").setTextureName("briansmod:rsteeldagger");
		
		GameRegistry.registerItem(pigaxe, "pigaxe");
		GameRegistry.registerItem(pigspade, "pigspade");
		GameRegistry.registerItem(pighoe, "pighoe");
		GameRegistry.registerItem(pigpick, "pigpick");
		GameRegistry.registerItem(flipper, "flipper");
		GameRegistry.registerBlock(pigskinblock, "pigskinblock");
		GameRegistry.registerItem(pigskin, "pigskin");
		GameRegistry.registerItem(sdagger, "sdagger");
		GameRegistry.registerItem(tdagger, "tdagger");
		
		GameRegistry.addShapedRecipe(new ItemStack(flipper, 1), new Object[] {" GG", " PG", "P  ", 'P', pigskinblock, 'G', Blocks.gold_block});
		GameRegistry.addShapedRecipe(new ItemStack(pigskinblock, 1), new Object[] {"PPP", "PPP", "PPP", 'P', pigskin});
		GameRegistry.addSmelting(Items.cooked_porkchop, new ItemStack(pigskin), 450);
	
	}
     
	@EventHandler
     public void load(FMLInitializationEvent event) {       
	}
     
     @EventHandler
     public void postInit(FMLPostInitializationEvent event) {
     }
}
