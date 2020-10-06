package com.legopitstop.morefood.foods.LikeBeetrootSoup;

import com.legopitstop.morefood.init.MorefoodItems;
import com.legopitstop.morefood.init.MorefoodSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class Soda extends BeetrootSoup {

   public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);
        return entityLiving instanceof PlayerEntity && ((PlayerEntity)entityLiving).abilities.isCreativeMode ? itemstack : new ItemStack(MorefoodItems.SODA_CAN_EMPTY.get());
    }
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    public SoundEvent getDrinkSound() {
        return MorefoodSounds.ITEM_SODA_DRINK.get();
    }

    public SoundEvent getEatSound() {
        return MorefoodSounds.ITEM_SODA_DRINK.get();
    }
}