package com.legopitstop.morefood;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.legopitstop.morefood.client.render.ToqueEntityModel;
import com.legopitstop.morefood.client.toque.*;
import com.legopitstop.morefood.registry.MoreFoodBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

@Environment(EnvType.CLIENT)
public class MoreFoodClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("LMF");
    public static final EntityModelLayer TOQUE_LAYER = new EntityModelLayer(new Identifier(MoreFood.MOD_ID, "chef_toque"), "tier1_chef_toque");
    public static Toque cachedToque = null;

    public static Toque getToque(UUID playerUuid) {
        if (cachedToque == null) {
            if (playerUuid == null) {
                MinecraftClient client = MinecraftClient.getInstance();
                playerUuid = client.player.getUuid();
            }
            try {
                JsonObject json = ToqueReader.fromUrl("https://legopitstop.weebly.com/files/theme/supporters.json");
                for (JsonElement e : json.getAsJsonArray("players")) {
                    JsonObject obj = e.getAsJsonObject();
                    String uuidString = JsonHelper.getString(obj, "uuid");
                    if (!Objects.equals(uuidString, "")) {
                        UUID uuid = UUID.fromString(uuidString);
                        if (uuid == playerUuid) {
                            int tier = JsonHelper.getInt(obj, "tier");
                            switch (tier) {
                                case 1: cachedToque = new Tier1Toque();
                                case 2: cachedToque = new Tier2Toque();
                                case 3: cachedToque = new Tier3Toque();
                            }
                        }
                    }
                }
            } catch (IOException err) {
                LOGGER.warn(err.toString());
            }
        }
        return cachedToque;
    }

    @Override
    public void onInitializeClient() {
//        EntityModelLayerRegistry.registerModelLayer(TOQUE_LAYER, ToqueEntityModel::getTexturedModelData);

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
