package com.legopitstop.morefood.foods.LikePorkchop;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Porkchop extends Item {

    public Porkchop() {
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
