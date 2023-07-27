package com.legopitstop.morefood;

import com.legopitstop.morefood.registry.ModBlocks;
import net.fabricmc.api.ClientModInitializer;

// For some reason these don't exist?
//import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
//import net.minecraft.client.RenderLayer;

// TODO
// - Make plants transparent
public class MoreFoodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

//        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_SAPLING, RenderLayer.getCutout());


        System.out.println("Hello from MoreFoodClient");
    }
}
