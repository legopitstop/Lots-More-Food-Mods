package com.legopitstop.morefood.items;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class BowlItemBase extends Item {

    public BowlItemBase(int hunger, float saturation) {
        super(new Properties()
                .stacksTo(1)
                .tab(MoreFood.TAB)
                .food( new FoodProperties.Builder()
                        .nutrition(hunger)
                        .saturationMod(saturation)
                        .build()
                )
        );
    }
    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving) {
        ItemStack itemstack = super.finishUsingItem(stack, worldIn, entityLiving);
        return entityLiving instanceof Player && ((Player)entityLiving).isCreative() ? itemstack : new ItemStack(Items.BOWL);
    }
}
