package com.legopitstop.morefood.items;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

public class DrinkItemBase extends Item {

    public DrinkItemBase(int hunger, float saturation) {
        super(new Properties()
                .stacksTo(16)
                .tab(MoreFood.TAB)
                .food( new FoodProperties.Builder()
                        .nutrition(hunger)
                        .saturationMod(saturation)
                        .build()
                )
        );

    }

    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }

    public SoundEvent getDrinkingSound() {
        return SoundEvents.HONEY_DRINK;
    }

    public SoundEvent getEatingSound() {
        return SoundEvents.HONEY_DRINK;
    }
}