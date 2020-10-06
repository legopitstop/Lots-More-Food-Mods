package com.legopitstop.morefood.init;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MorefoodSounds {

    // Register Sounds
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            MoreFood.MOD_ID);

    // Sounds item.soda.drink
    public static RegistryObject<SoundEvent> ITEM_SODA_OPEN = SOUNDS.register("item.soda.open",
            () -> new SoundEvent(new ResourceLocation(MoreFood.MOD_ID,"item.soda.open")));

    public static RegistryObject<SoundEvent> ITEM_SODA_DRINK = SOUNDS.register("item.soda.drink",
            () -> new SoundEvent(new ResourceLocation(MoreFood.MOD_ID,"item.soda.drink")));
}