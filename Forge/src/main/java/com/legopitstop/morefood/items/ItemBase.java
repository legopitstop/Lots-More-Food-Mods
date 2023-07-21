package com.legopitstop.morefood.items;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.world.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties()
                .tab(MoreFood.TAB));
    }

}
