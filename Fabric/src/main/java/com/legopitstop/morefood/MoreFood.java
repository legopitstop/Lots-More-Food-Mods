package com.legopitstop.morefood;

import com.legopitstop.morefood.block.cauldron.ModCauldronBehavior;
import com.legopitstop.morefood.registry.ModBlocks;
import com.legopitstop.morefood.registry.ModItemGroups;
import com.legopitstop.morefood.registry.ModItems;
import com.legopitstop.morefood.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

// TODO
// - Create "morefood:holiday" feature & datapack which adds blocks & items related to holidays.
public class MoreFood implements ModInitializer {
    public static final String MOD_ID = "morefood";

    @Override
    public void onInitialize() {
        ModCauldronBehavior.register();
        ModItems.register();
        ModBlocks.register();
        ModItemGroups.register();

        ModWorldGeneration.generateModWorldGen();
    }
}
