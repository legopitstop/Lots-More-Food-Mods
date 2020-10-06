package com.legopitstop.morefood.foods.LikeGoldenApple;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class GoldenApple extends Item {

    public GoldenApple() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(1)
                .saturation(0.3f)
                .setAlwaysEdible()

                .effect(new EffectInstance(Effects.REGENERATION, 100, 1), 1.0F)
                .effect(new EffectInstance(Effects.ABSORPTION, 2400, 0), 1.0F)
                .build())

        );

    }
}
