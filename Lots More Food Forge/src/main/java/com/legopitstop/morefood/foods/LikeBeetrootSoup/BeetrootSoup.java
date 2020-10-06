package com.legopitstop.morefood.foods.LikeBeetrootSoup;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class BeetrootSoup extends Item {

    public BeetrootSoup() {
        super(new Properties()
        .maxStackSize(1)
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(6)
                .saturation(0.6F)
                .build())

        );

    }
}