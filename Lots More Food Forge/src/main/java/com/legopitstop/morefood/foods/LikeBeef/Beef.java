package com.legopitstop.morefood.foods.LikeBeef;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Beef extends Item {

    public Beef() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .meat()
                .hunger(3)
                .saturation(0.3f)
                .build())

        );

    }
}
