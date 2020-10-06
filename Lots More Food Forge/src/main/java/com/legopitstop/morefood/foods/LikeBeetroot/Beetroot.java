package com.legopitstop.morefood.foods.LikeBeetroot;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Beetroot extends Item {

    public Beetroot() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(1)
                .saturation(0.6f)
                .build())

        );

    }
}
