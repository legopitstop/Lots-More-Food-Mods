package com.legopitstop.morefood.foods.LikeBakedPotato;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class BakedPotato extends Item {

    public BakedPotato() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(5)
                .saturation(0.6f)
                .build())

        );

    }
}
