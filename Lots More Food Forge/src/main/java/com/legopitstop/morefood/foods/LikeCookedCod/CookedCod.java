package com.legopitstop.morefood.foods.LikeCookedCod;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedCod extends Item {

    public CookedCod() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .meat()
                .hunger(5)
                .saturation(0.6f)
                .build())

        );

    }
}
