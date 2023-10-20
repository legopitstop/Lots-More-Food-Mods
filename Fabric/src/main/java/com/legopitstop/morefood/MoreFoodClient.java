package com.legopitstop.morefood;

import com.legopitstop.morefood.registry.MoreFoodBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import java.time.LocalDate;
import java.time.Month;

@Environment(EnvType.CLIENT)
public class MoreFoodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.LARGE_PUMPKIN_PALE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.SMALL_PUMPKIN_PALE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.SAP_CAULDRON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.AVOCADO_SAPLING , RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.ALMOND_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.PLUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.BANANA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.LEMON_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.PALM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.OLIVE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.ORANGE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.APPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.HANGING_CHERRY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.HANGING_APPLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.HANGING_BANANA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.HANGING_ALMOND, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.HANGING_AVOCADO, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.HANGING_COCONUT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.HANGING_LEMON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.HANGING_OLIVE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.HANGING_ORANGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.HANGING_PLUM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.POTTED_WATERMINT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.POTTED_SPEARMINT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.POTTED_AVOCADO_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.POTTED_ALMOND_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.POTTED_PLUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.POTTED_BANANA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.POTTED_LEMON_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.POTTED_PALM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.POTTED_OLIVE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.POTTED_ORANGE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.POTTED_APPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.BEAN_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.BLUEBERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.COFFEE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.CRANBERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.EGGPLANT_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.GHERKIN_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.GRAPE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.PEPPER_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.PEPPERMINT_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.POISON_BERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.RASPBERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.SOYBEAN_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.STRAWBERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.TEA_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.TOMATO_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.VANILLA_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.BARLEY_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.CORN_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.HOPS_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.OAT_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.BUCKWHEAT_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.PEANUT_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.LETTUCE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.RICE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.ONION_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.CABBAGE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.SPINACH_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.GARLIC_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.SPEARMINT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.WATERMINT, RenderLayer.getCutout());
    }
}
