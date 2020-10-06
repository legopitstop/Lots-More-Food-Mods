package com.legopitstop.morefood.init;

import com.legopitstop.morefood.MoreFood;
import com.legopitstop.morefood.entities.ExoticTraderEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MorefoodEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, MoreFood.MOD_ID);

    // Entity Types
    public static final RegistryObject<EntityType<ExoticTraderEntity>> EXOTIC_TRADER = ENTITY_TYPES.register("exotic_trader",
            () -> EntityType.Builder.create(ExoticTraderEntity::new, EntityClassification.CREATURE)
                    .size(1.0f, 2.0f)
                    .build(new ResourceLocation(MoreFood.MOD_ID, "extoic_trader").toString()));
}