package com.legopitstop.morefood.foods.LikeBread;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Bread extends Item {

    public Bread() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(5)
                .saturation(0.6f)
                .build())

        );

    }
}
