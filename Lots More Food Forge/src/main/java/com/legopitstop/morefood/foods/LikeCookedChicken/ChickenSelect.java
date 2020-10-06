package com.legopitstop.morefood.foods.LikeCookedChicken;

import com.legopitstop.morefood.foods.LikeBeetrootSoup.BeetrootSoup;
import com.legopitstop.morefood.init.MorefoodItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class ChickenSelect extends CookedChicken {

   public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);
        return entityLiving instanceof PlayerEntity && ((PlayerEntity)entityLiving).abilities.isCreativeMode ? itemstack : new ItemStack(MorefoodItems.CHICKEN_SELECT_BOX.get());
    }
}