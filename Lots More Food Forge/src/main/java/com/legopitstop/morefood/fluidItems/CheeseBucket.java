package com.legopitstop.morefood.fluidItems;

import com.legopitstop.morefood.MoreFood;
import com.legopitstop.morefood.init.MorefoodFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class CheeseBucket extends BucketItem {

    public CheeseBucket() {
        super(MorefoodFluid.CHEESE_FLUID, (new Item.Properties()
                .containerItem(Items.BUCKET)
                .maxStackSize(1)
                .group(MoreFood.TAB)));
    }
}