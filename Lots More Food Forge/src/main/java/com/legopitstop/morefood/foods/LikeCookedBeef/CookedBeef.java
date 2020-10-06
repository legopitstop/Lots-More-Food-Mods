package com.legopitstop.morefood.foods.LikeCookedBeef;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedBeef extends Item {

    public CookedBeef() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .meat()
                .hunger(8)
                .saturation(0.8f)
                .build())

        );

    }
}
