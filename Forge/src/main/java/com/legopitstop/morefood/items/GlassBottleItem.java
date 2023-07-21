package com.legopitstop.morefood.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class GlassBottleItem extends DrinkItemBase{
    public GlassBottleItem(int hunger, float saturation) {
        super(hunger, saturation);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving) {
        ItemStack itemstack = super.finishUsingItem(stack, worldIn, entityLiving);
        return entityLiving instanceof Player && ((Player)entityLiving).isCreative() ? itemstack : new ItemStack(Items.GLASS_BOTTLE);
    }
}
