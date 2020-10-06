package com.legopitstop.morefood.foods.LikeGoldenCarrot;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class GoldenCarrot extends Item {

    public GoldenCarrot() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(6)
                .saturation(1.2f)
                .build())

        );

    }
}
