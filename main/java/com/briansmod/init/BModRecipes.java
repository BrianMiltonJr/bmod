package com.briansmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class BModRecipes
{
	public static void init()
	{
		//Seeds
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.reggieSeed, 1), new ItemStack(Items.wheat_seeds, 1), new ItemStack(Items.wheat_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.perpSeed, 1), new ItemStack(BModItems.reggieSeed,1 ), new ItemStack(Items.melon_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.presidentialSeed, 1), new ItemStack(Items.melon_seeds, 1), new ItemStack(Items.pumpkin_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.olSeed, 1), new ItemStack(BModItems.perpSeed, 1), new ItemStack(Items.pumpkin_seeds, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.purpKushSeed, 1), new ItemStack(BModItems.perpSeed, 1), new ItemStack(BModItems.presidentialSeed, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.sourDSeed, 1), new ItemStack(BModItems.presidentialSeed, 1), new ItemStack(Items.coal, 1));
		
		//Blunts
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.rollingPapers, 1), new ItemStack(Items.paper, 1), new ItemStack(Items.paper, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.reggieBlunt, 1), new ItemStack(BModItems.rollingPapers, 1), new ItemStack(BModItems.reggieStrain, 1), new ItemStack(BModItems.reggieStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.presidentialBlunt, 1), new ItemStack(BModItems.rollingPapers, 1), new ItemStack(BModItems.presidentialStrain, 1), new ItemStack(BModItems.presidentialStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.perpBlunt, 1), new ItemStack(BModItems.rollingPapers, 1), new ItemStack(BModItems.perpStrain, 1), new ItemStack(BModItems.perpStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.olBlunt, 1), new ItemStack(BModItems.rollingPapers, 1), new ItemStack(BModItems.olStrain, 1), new ItemStack(BModItems.olStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.purpKushBlunt, 1), new ItemStack(BModItems.rollingPapers, 1), new ItemStack(BModItems.purpKushStrain, 1), new ItemStack(BModItems.purpKushStrain, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.sourDBlunt, 1), new ItemStack(BModItems.rollingPapers, 1), new ItemStack(BModItems.sourDStrain, 1), new ItemStack(BModItems.sourDStrain, 1));
		
		//Edibles Update
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.butter, 4), new ItemStack(Items.milk_bucket, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BModItems.iButter, 1), new ItemStack(BModItems.butter), new ItemStack(BModItems.butter), new ItemStack(BModItems.perpStrain));
		GameRegistry.addShapedRecipe(new ItemStack(BModItems.dough, 2), new Object[]{"   ", "WMW", "BWB", 'W', Items.wheat, 'M', Items.milk_bucket, 'B', BModItems.iButter});
		GameRegistry.addSmelting(new ItemStack(BModItems.dough), new ItemStack(BModItems.eCookie, 3), 200);
	}
}
