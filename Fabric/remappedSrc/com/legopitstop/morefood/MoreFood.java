package com.legopitstop.morefood;

import com.legopitstop.morefood.block.cauldron.MoreFoodCauldronBehavior;
import com.legopitstop.morefood.registry.*;
import com.legopitstop.morefood.world.gen.MoreFoodWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.entity.feature.CapeFeatureRenderer;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.TagEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.util.Identifier;

public class MoreFood implements ModInitializer {
    public static final String MOD_ID = "morefood";
    private static final Identifier SHORT_GRASS_LOOT_TABLE_ID = Blocks.SHORT_GRASS.getLootTableId();
    private static final Identifier TALL_GRASS_LOOT_TABLE_ID = Blocks.TALL_GRASS.getLootTableId();

    @Override
    public void onInitialize() {
        MoreFoodCauldronBehavior.register();
        MoreFoodItems.register();
        MoreFoodBlocks.register();
        MoreFoodItemGroups.register();

        MoreFoodBlockEntityType.register();
        MoreFoodComposting.register();

        MoreFoodWorldGeneration.generateModWorldGen();

        LootPool.Builder poolBuilder = LootPool.builder()
                .conditionally(RandomChanceLootCondition.builder(0.125F))
                .apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE, 2))
                .with(TagEntry.builder(MoreFoodItemTags.SEEDS_FROM_GRASS).build());
        // Inject items into grass loot tables
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && SHORT_GRASS_LOOT_TABLE_ID.equals(id)) {
                tableBuilder.pool(poolBuilder);
            }
        });

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && TALL_GRASS_LOOT_TABLE_ID.equals(id)) {
                tableBuilder.pool(poolBuilder);
            }
        });
    }
}
