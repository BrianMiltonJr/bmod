package com.briansmod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ECookie extends ItemFood{

	public ECookie(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		// TODO Auto-generated constructor stub
		setAlwaysEdible();
	}
	
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
    {
        if (!p_77849_2_.isRemote)
        {
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.confusion.id, 1200, 5));
        }
        else
        {
            super.onFoodEaten(p_77849_1_, p_77849_2_, p_77849_3_);
        }
    }
	
}
