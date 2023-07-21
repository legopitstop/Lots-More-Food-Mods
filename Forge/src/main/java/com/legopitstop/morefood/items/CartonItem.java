package com.legopitstop.morefood.items;

import com.legopitstop.morefood.init.MoreFoodItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CartonItem extends DrinkItemBase{
    public CartonItem(int hunger, float saturation) {
        super(hunger, saturation);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving) {
        ItemStack itemstack = super.finishUsingItem(stack, worldIn, entityLiving);
        return entityLiving instanceof Player && ((Player)entityLiving).isCreative() ? itemstack : new ItemStack(MoreFoodItems.CARTON.get());
    }
}
