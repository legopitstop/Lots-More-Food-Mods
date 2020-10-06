package com.legopitstop.morefood.foods.LikeGoldenApple;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Hamburger extends Item {

    public Hamburger() {
        super(new Item.Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(4)
                .saturation(1.2f)
                .effect(new EffectInstance(Effects.ABSORPTION, 2*60*20, 0),1)
                .effect(new EffectInstance(Effects.REGENERATION, 5*20, 1),1)
                .build())

        );

    }
}
