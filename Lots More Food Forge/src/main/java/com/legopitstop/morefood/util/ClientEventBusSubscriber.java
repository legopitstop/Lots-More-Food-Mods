package com.legopitstop.morefood.util;

import com.legopitstop.morefood.MoreFood;
import com.legopitstop.morefood.client.render.ExoticTraderRenderer;
import com.legopitstop.morefood.init.MorefoodBlocks;
import com.legopitstop.morefood.init.MorefoodEntityTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MoreFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(MorefoodEntityTypes.EXOTIC_TRADER.get(), ExoticTraderRenderer::new);
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.STOVE.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.BARLEY.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.CORN.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.HOPS.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.LETTUCE.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.ONION.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.RICE.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.COFFEE_BUSH.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.GHERKIN_BUSH.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.GRAPE_BUSH.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.RASPBERRY_BUSH.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.STRAWBERRY_BUSH.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.TEA_BUSH.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.TOMATO_BUSH.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.VANILLA_BUSH.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MorefoodBlocks.PEPPER_BUSH.get(),RenderType.getCutout());
    }
}
