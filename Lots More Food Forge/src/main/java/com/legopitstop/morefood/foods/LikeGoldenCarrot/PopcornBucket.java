package com.legopitstop.morefood.foods.LikeGoldenCarrot;

import com.legopitstop.morefood.foods.LikeCookie.Cookie;
import com.legopitstop.morefood.init.MorefoodItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class PopcornBucket extends GoldenCarrot {

   public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);
        return entityLiving instanceof PlayerEntity && ((PlayerEntity)entityLiving).abilities.isCreativeMode ? itemstack : new ItemStack(MorefoodItems.EMPTY_POPCORN_BUCKET.get());
    }
}