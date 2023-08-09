package com.legopitstop.morefood;

import com.legopitstop.morefood.block.cauldron.MoreFoodCauldronBehavior;
import com.legopitstop.morefood.registry.*;
import com.legopitstop.morefood.world.gen.MoreFoodWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.WearableCarvedPumpkinBlock;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.entity.mob.SkeletonEntity;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class MoreFood implements ModInitializer {
    public static final String MOD_ID = "morefood";

    @Override
    public void onInitialize() {
        MoreFoodCauldronBehavior.register();
        MoreFoodItems.register();
        MoreFoodBlocks.register();
        MoreFoodItemGroups.register();

        MoreFoodBlockEntityType.register();
        MoreFoodComposting.register();

        MoreFoodWorldGeneration.generateModWorldGen();

    }
}
