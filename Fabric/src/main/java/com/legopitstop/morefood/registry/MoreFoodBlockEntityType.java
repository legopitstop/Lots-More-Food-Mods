package com.legopitstop.morefood.registry;

import com.legopitstop.morefood.MoreFood;
import com.legopitstop.morefood.block.entity.LargePaleBlockEntity;
import com.legopitstop.morefood.block.entity.SmallPaleBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MoreFoodBlockEntityType {
    public static final BlockEntityType<LargePaleBlockEntity> LARGE_PALE_BLOCK_ENTITY = FabricBlockEntityTypeBuilder.create(LargePaleBlockEntity::new, MoreFoodBlocks.LARGE_PUMPKIN_PALE).build();
    public static final BlockEntityType<SmallPaleBlockEntity> SMALL_PALE_BLOCK_ENTITY = FabricBlockEntityTypeBuilder.create(SmallPaleBlockEntity::new, MoreFoodBlocks.SMALL_PUMPKIN_PALE).build();

    public static void register() {
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MoreFood.MOD_ID, "large_pale_block_entity"), LARGE_PALE_BLOCK_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MoreFood.MOD_ID, "small_pale_block_entity"), SMALL_PALE_BLOCK_ENTITY);
    }
}
