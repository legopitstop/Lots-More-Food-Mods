package com.legopitstop.morefood.util;

import com.legopitstop.morefood.MoreFood;
import com.legopitstop.morefood.init.MoreFoodBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MoreFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.COFFEE_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.GHERKIN_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.GRAPE_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.RASPBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.STRAWBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.TEA_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.TOMATO_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.VANILLA_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.PEPPER_BUSH.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.BARLEY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.CORN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.HOPS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.LETTUCE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.RICE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MoreFoodBlocks.ONION.get(), RenderType.cutout());
    }
}