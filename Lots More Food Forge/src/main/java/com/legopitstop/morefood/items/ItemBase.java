package com.legopitstop.morefood.items;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(MoreFood.TAB));
    }
}