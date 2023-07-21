package com.legopitstop.morefood;

import com.legopitstop.morefood.init.MoreFoodBlocks;
import com.legopitstop.morefood.init.MoreFoodItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("morefood")
public class MoreFood {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "morefood";

    public MoreFood() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        MoreFoodBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MoreFoodItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);

    }
    private void setup(final FMLCommonSetupEvent event) { }

    // tab
    public static final CreativeModeTab TAB =  new CreativeModeTab("morefoodTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MoreFoodItems.HAMBURGER.get());
        }
    };

}
