package com.legopitstop.morefood.world.tree;

import com.legopitstop.morefood.world.ModConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class AppleSaplingGenerator extends SaplingGenerator {
    public AppleSaplingGenerator() {
    }

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return bees ? ModConfiguredFeatures.APPLE_BEES_005 : ModConfiguredFeatures.APPLE;
    }
}
