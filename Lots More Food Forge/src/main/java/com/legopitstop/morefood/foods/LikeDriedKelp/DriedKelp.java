package com.legopitstop.morefood.foods.LikeDriedKelp;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class DriedKelp extends Item {

    public DriedKelp() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(1)
                .saturation(0.3f)
                .fastToEat()
                .build())

        );

    }
}
