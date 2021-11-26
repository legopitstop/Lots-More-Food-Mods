package com.legopitstop.morefood.items;

import com.legopitstop.morefood.init.MoreFoodItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BeerGlassItem extends DrinkItemBase{
    public BeerGlassItem(int hunger, float saturation) {
        super(hunger, saturation);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving) {
        ItemStack itemstack = super.finishUsingItem(stack, worldIn, entityLiving);
        return entityLiving instanceof Player && ((Player)entityLiving).isCreative() ? itemstack : new ItemStack(MoreFoodItems.BEER_GLASS.get());
    }
}
