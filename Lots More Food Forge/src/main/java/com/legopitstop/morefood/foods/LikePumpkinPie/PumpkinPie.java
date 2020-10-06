package com.legopitstop.morefood.foods.LikePumpkinPie;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class PumpkinPie extends Item {

    public PumpkinPie() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(8)
                .saturation(0.3f)
                .build())

        );

    }
}
