package com.legopitstop.morefood.block.cauldron;

import com.legopitstop.morefood.registry.MoreFoodBlocks;
import com.legopitstop.morefood.registry.MoreFoodItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;

import java.util.Map;

public class MoreFoodCauldronBehavior {
    public static final CauldronBehavior FILL_WITH_SAP = (state, world, pos, player, hand, stack) -> CauldronBehavior.fillCauldron(world, pos, player, hand, stack, (BlockState) MoreFoodBlocks.SAP_CAULDRON.getDefaultState(), SoundEvents.ITEM_BUCKET_EMPTY);
    public static final CauldronBehavior.CauldronBehaviorMap SAP_CAULDRON_BEHAVIOR = CauldronBehavior.createMap("sap");

    public static void register() {
        Map<Item, CauldronBehavior> map3 = SAP_CAULDRON_BEHAVIOR.map();
        map3.put(Items.BUCKET, (state, world, pos, player, hand, stack) -> CauldronBehavior.emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(MoreFoodItems.MAPLE_SAP_BUCKET), statex -> true, SoundEvents.ITEM_BUCKET_FILL));
        CauldronBehavior.registerBucketBehavior(map3);
        CauldronBehavior.EMPTY_CAULDRON_BEHAVIOR.map().put(MoreFoodItems.MAPLE_SAP_BUCKET, FILL_WITH_SAP);
    }
}
