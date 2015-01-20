package com.theweedmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class WModRecipes
{
	public static void init()
	{
		//Seeds
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.reggieSeed, 1), new ItemStack(Items.wheat_seeds, 1), new ItemStack(Items.wheat_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.perpSeed, 1), new ItemStack(WModItems.reggieSeed,1 ), new ItemStack(Items.melon_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.presidentialSeed, 1), new ItemStack(Items.melon_seeds, 1), new ItemStack(Items.pumpkin_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.olSeed, 1), new ItemStack(WModItems.perpSeed, 1), new ItemStack(Items.pumpkin_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.purpKushSeed, 1), new ItemStack(WModItems.perpSeed, 1), new ItemStack(WModItems.presidentialSeed, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.sourDSeed, 1), new ItemStack(WModItems.presidentialSeed, 1), new ItemStack(Items.coal, 1));
		
		//Blunts
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.rollingPapers, 1), new ItemStack(Items.paper, 1), new ItemStack(Items.paper, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.reggieBlunt, 1), new ItemStack(WModItems.rollingPapers, 1), new ItemStack(WModItems.reggieStrain, 1), new ItemStack(WModItems.reggieStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.presidentialBlunt, 1), new ItemStack(WModItems.rollingPapers, 1), new ItemStack(WModItems.presidentialStrain, 1), new ItemStack(WModItems.presidentialStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.perpBlunt, 1), new ItemStack(WModItems.rollingPapers, 1), new ItemStack(WModItems.perpStrain, 1), new ItemStack(WModItems.perpStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.olBlunt, 1), new ItemStack(WModItems.rollingPapers, 1), new ItemStack(WModItems.olStrain, 1), new ItemStack(WModItems.olStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.purpKushBlunt, 1), new ItemStack(WModItems.rollingPapers, 1), new ItemStack(WModItems.purpKushStrain, 1), new ItemStack(WModItems.purpKushStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.sourDBlunt, 1), new ItemStack(WModItems.rollingPapers, 1), new ItemStack(WModItems.sourDStrain, 1), new ItemStack(WModItems.sourDStrain, 1));
		
		//Edibles Update
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.butter, 4), new ItemStack(Items.milk_bucket, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.iButter, 1), new ItemStack(WModItems.butter), new ItemStack(WModItems.butter), new ItemStack(WModItems.perpStrain));
		GameRegistry.addShapedRecipe(new ItemStack(WModItems.dough, 2), new Object[]{"   ", "WMW", "BWB", 'W', Items.wheat, 'M', Items.milk_bucket, 'B', WModItems.iButter});
		GameRegistry.addSmelting(new ItemStack(WModItems.dough), new ItemStack(WModItems.eCookie, 3), 0);
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.cNuggetsRaw, 4), new ItemStack(Items.chicken));
		GameRegistry.addSmelting(new ItemStack(WModItems.cNuggetsRaw), new ItemStack(WModItems.cNuggets), 0);
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.cNuggetsInfusedRaw), new ItemStack(WModItems.cNuggetsRaw), new ItemStack(WModItems.iButter));
		GameRegistry.addSmelting(new ItemStack(WModItems.cNuggetsInfusedRaw), new ItemStack(WModItems.cNuggetsInfused), 0);
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.porkchopInfusedRaw, 1), new ItemStack(Items.porkchop), new ItemStack(WModItems.iButter));
		GameRegistry.addSmelting(new ItemStack(WModItems.porkchopInfusedRaw), new ItemStack(WModItems.porkchopInfused), 0);
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.steakInfusedRaw, 1), new ItemStack(Items.beef), new ItemStack(WModItems.iButter));
		GameRegistry.addSmelting(new ItemStack(WModItems.steakInfusedRaw), new ItemStack(WModItems.steakInfused), 0);
		GameRegistry.addShapelessRecipe(new ItemStack(WModItems.potatoInfusedRaw, 1), new ItemStack(Items.potato), new ItemStack(WModItems.iButter));
		GameRegistry.addSmelting(new ItemStack(WModItems.potatoInfusedRaw), new ItemStack(WModItems.potatoInfused), 0);
	}
}
