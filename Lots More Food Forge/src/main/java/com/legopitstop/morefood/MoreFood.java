package com.legopitstop.morefood;

import com.legopitstop.morefood.entities.ExoticTraderEntity;
import com.legopitstop.morefood.init.*;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("morefood")
public class MoreFood
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "morefood";

    public MoreFood() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MorefoodFluid.FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MorefoodSounds.SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MorefoodBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MorefoodItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MorefoodEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    // set attrubites to extoic trader
    private void setup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(()-> {
            // func_233813_a_ -> create
            GlobalEntityTypeAttributes.put(MorefoodEntityTypes.EXOTIC_TRADER.get(), ExoticTraderEntity.setCustomAttributes().func_233813_a_());
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    // Custom tab
    public static final ItemGroup TAB = new ItemGroup("morefoodTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(MorefoodItems.HAMBURGER.get());
        }
    };
}
