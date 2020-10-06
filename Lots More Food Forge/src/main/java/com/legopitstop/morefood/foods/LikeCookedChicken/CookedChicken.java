package com.legopitstop.morefood.foods.LikeCookedChicken;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedChicken extends Item {

    public CookedChicken() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .meat()
                .hunger(6)
                .saturation(0.6f)
                .build())
                //.effect(new EffectInstance(Effects.HUNGER, 600, 0), 0.3F)

        );

    }
}
