package com.legopitstop.morefood.fluidItems;

import com.legopitstop.morefood.MoreFood;
import com.legopitstop.morefood.init.MorefoodFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Items;

public class SparklingWaterBucket extends BucketItem {

    public SparklingWaterBucket() {
        super(MorefoodFluid.SPARKLING_WATER_FLUID, (new Properties()
                .containerItem(Items.BUCKET)
                .maxStackSize(1)
                .group(MoreFood.TAB)));
    }
}