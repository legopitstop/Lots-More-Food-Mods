package com.legopitstop.morefood.world.tree;

import com.legopitstop.morefood.world.MoreFoodConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class PalmSaplingGenerator extends SaplingGenerator {
    public PalmSaplingGenerator() {
    }

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return bees ? MoreFoodConfiguredFeatures.PALM_BEES_005 : MoreFoodConfiguredFeatures.PALM;
    }
}
