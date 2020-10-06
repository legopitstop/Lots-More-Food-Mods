package com.legopitstop.morefood.foods.LikePufferfish;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Pufferfish extends Item {

    public Pufferfish() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(1)
                .saturation(0.1f)
                //
                .effect(new EffectInstance(Effects.POISON, 1200, 3), 1.0F)
                .effect(new EffectInstance(Effects.HUNGER, 300, 2), 1.0F)
                .effect(new EffectInstance(Effects.NAUSEA, 300, 1), 1.0F)
                .effect(new EffectInstance(Effects.SPEED, 60*20, 1), 1.0F)
                .build())
        );

    }
}
