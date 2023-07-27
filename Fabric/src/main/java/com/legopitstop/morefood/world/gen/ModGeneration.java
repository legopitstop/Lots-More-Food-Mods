package com.legopitstop.morefood.world.gen;

import com.legopitstop.morefood.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModGeneration {
    public static void generate() {

        // NORMAL
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TREES_ALMOND);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TREES_APPLE);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TREES_AVOCADO);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TREES_BANANA);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TREES_LEMON);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TREES_OLIVE);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TREES_ORANGE);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TREES_PLUM);

        // BEES
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ALMOND_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.APPLE_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.AVOCADO_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BANANA_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LEMON_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.OLIVE_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ORANGE_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PLUM_BEES_005_PLACED);

        // SPECIAL
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TREES_PALM);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PALM_BEES_005_PLACED);

        // BUSHES
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_BEAN_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_BLUEBERRY_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_COFFEE_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_CRANBERRY_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_EGGPLANT_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_GHERKIN_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_GRAPE_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_PEPPER_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_POISON_BERRY_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_RASPBERRY_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_SOYBEAN_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_STRAWBERRY_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_TEA_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_TOMATO_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_VANILLA_BUSH);

    }
}
