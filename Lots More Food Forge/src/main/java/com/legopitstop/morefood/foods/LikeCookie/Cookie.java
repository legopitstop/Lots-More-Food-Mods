package com.legopitstop.morefood.foods.LikeCookie;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Cookie extends Item {

    public Cookie() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(2)
                .saturation(0.1f)
                .build())

        );

    }
}
