package com.legopitstop.morefood.foods.LikeRottenFlesh;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RottenFlesh extends Item {

    public RottenFlesh() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .meat()
                .hunger(4)
                .saturation(0.1f)
                .effect(new EffectInstance(Effects.HUNGER, 30*20, 0), 0.8F)
                .build())
        );

    }
}
