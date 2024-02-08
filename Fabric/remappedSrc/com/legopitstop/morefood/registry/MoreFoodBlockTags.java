package com.legopitstop.morefood.registry;


import com.legopitstop.morefood.MoreFood;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MoreFoodBlockTags {
    public static final TagKey<Block> SACKS = TagKey.of(RegistryKeys.BLOCK, new Identifier(MoreFood.MOD_ID, "sacks"));
    public static final TagKey<Block> BUSHES = TagKey.of(RegistryKeys.BLOCK, new Identifier(MoreFood.MOD_ID, "bushes"));
    public static final TagKey<Block> CROPS = TagKey.of(RegistryKeys.BLOCK, new Identifier(MoreFood.MOD_ID, "crops"));
}
