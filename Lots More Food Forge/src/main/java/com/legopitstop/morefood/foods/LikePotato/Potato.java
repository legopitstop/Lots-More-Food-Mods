package com.legopitstop.morefood.foods.LikePotato;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Potato extends Item {

    public Potato() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(1)
                .saturation(0.3f)
                .build())

        );

    }
}
