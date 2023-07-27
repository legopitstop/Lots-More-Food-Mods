package com.legopitstop.morefood.block.cauldron;

import com.legopitstop.morefood.registry.ModBlocks;
import com.legopitstop.morefood.registry.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;

import java.util.Map;

public class ModCauldronBehavior {
    public static final CauldronBehavior FILL_WITH_SAP = (state, world, pos, player, hand, stack) -> CauldronBehavior.fillCauldron(world, pos, player, hand, stack, (BlockState) ModBlocks.SAP_CAULDRON.getDefaultState(), SoundEvents.ITEM_BUCKET_EMPTY);

    public static final Map<Item, CauldronBehavior> SAP_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();

    public static void register() {
        SAP_CAULDRON_BEHAVIOR.put(Items.BUCKET, (state, world, pos, player, hand, stack) -> CauldronBehavior.emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(ModItems.MAPLE_SAP_BUCKET), statex -> true, SoundEvents.ITEM_BUCKET_FILL));
        CauldronBehavior.registerBucketBehavior(SAP_CAULDRON_BEHAVIOR);


        CauldronBehavior.EMPTY_CAULDRON_BEHAVIOR.put(ModItems.MAPLE_SAP_BUCKET, FILL_WITH_SAP);
    }
}
