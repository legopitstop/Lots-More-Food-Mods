package com.legopitstop.morefood.foods.LikeCookedPorkchop;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedPorkchop extends Item {

    public CookedPorkchop() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .meat()
                .hunger(8)
                .saturation(0.8f)
                .build())

        );

    }
}
