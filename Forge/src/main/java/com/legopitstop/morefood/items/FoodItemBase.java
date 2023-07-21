package com.legopitstop.morefood.items;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class FoodItemBase extends Item {
    public FoodItemBase(int hunger, float saturation, int max_stack) {
        super(new Properties()
                .stacksTo(max_stack)
                .tab(MoreFood.TAB)
                .food(new FoodProperties.Builder()
                    .nutrition(hunger)
                    .saturationMod(saturation)
                    .build()
                )
        );
    }
}