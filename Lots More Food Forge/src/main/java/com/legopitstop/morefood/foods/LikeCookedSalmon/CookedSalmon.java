package com.legopitstop.morefood.foods.LikeCookedSalmon;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedSalmon extends Item {

    public CookedSalmon() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .meat()
                .hunger(6)
                .saturation(0.8f)
                .build())

        );

    }
}
