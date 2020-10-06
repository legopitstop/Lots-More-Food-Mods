package com.legopitstop.morefood.foods.LikeMilkBucket;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class MilkBucket extends Item {

    public MilkBucket() {
        super(new Properties()
                .maxStackSize(1)
                .group(MoreFood.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2f)
                        .build())

        );

    }
}
