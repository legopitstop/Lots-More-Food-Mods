package com.legopitstop.morefood.foods.LikeMelonSlice;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class MelonSlice extends Item {

    public MelonSlice() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(2)
                .saturation(0.3f)
                .build())

        );

    }
}
