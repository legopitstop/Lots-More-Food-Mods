package com.legopitstop.morefood.foods.LikeApple;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Apple extends Item {

    public Apple() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(4)
                .saturation(0.3f)
                .build())

        );

    }
}
