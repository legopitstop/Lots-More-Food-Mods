package com.legopitstop.morefood.init;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MorefoodFluid {
    // Register Fluids
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, MoreFood.MOD_ID);

    // Fluid Resource Locations
    public static final ResourceLocation CHEESE_STILL_RL = new ResourceLocation(MoreFood.MOD_ID,"block/cheese_still");
    public static final ResourceLocation CHEESE_FLOW_RL = new ResourceLocation(MoreFood.MOD_ID,"block/cheese_flow");

    public static final ResourceLocation SPARKLING_WATER_STILL_RL = new ResourceLocation(MoreFood.MOD_ID,"block/sparkling_water_still");
    public static final ResourceLocation SPARKLING_WATER_FLOW_RL = new ResourceLocation(MoreFood.MOD_ID,"block/sparkling_water_flow");

    // Fluids
    public static final RegistryObject<FlowingFluid> CHEESE_FLUID = FLUIDS.register("cheese_fluid",
            () -> new ForgeFlowingFluid.Source(MorefoodFluid.CHEESE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> CHEESE_FLOW = FLUIDS.register("cheese_flow",
            ()-> new ForgeFlowingFluid.Flowing(MorefoodFluid.CHEESE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SPARKLING_WATER_FLUID = FLUIDS.register("sparkling_water_fluid",
            () -> new ForgeFlowingFluid.Flowing(MorefoodFluid.SPARKLING_WATER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SPARKLING_WATER_FLOW = FLUIDS.register("sparkling_water_flow",
            () -> new ForgeFlowingFluid.Flowing(MorefoodFluid.SPARKLING_WATER_PROPERTIES));

    // Fluid Properties
    public static final ForgeFlowingFluid.Properties CHEESE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> CHEESE_FLUID.get(),()-> CHEESE_FLOW.get(), FluidAttributes.builder(CHEESE_STILL_RL,CHEESE_FLOW_RL)
            .density(5)
            .viscosity(12)
            .rarity(Rarity.RARE)
            .sound(SoundEvents.ITEM_BUCKET_FILL,SoundEvents.ITEM_BUCKET_EMPTY))
            .block(()-> MorefoodFluid.CHEESE_BLOCK.get());

    public static final ForgeFlowingFluid.Properties SPARKLING_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> SPARKLING_WATER_FLUID.get(),()-> SPARKLING_WATER_FLOW.get(), FluidAttributes.builder(SPARKLING_WATER_STILL_RL,SPARKLING_WATER_FLOW_RL)
            .density(5)
            .viscosity(12)
            .rarity(Rarity.RARE)
            .sound(SoundEvents.ITEM_BUCKET_FILL,SoundEvents.ITEM_BUCKET_EMPTY))
            .block(()-> MorefoodFluid.SPARKLING_WATER_BLOCK.get());


    // Fluid Block
    public static final RegistryObject<FlowingFluidBlock> CHEESE_BLOCK = MorefoodBlocks.BLOCKS.register("cheese",
            () -> new FlowingFluidBlock(() -> MorefoodFluid.CHEESE_FLUID.get(), Block.Properties.create(Material.WATER)
                    .hardnessAndResistance(100f)
                    .noDrops()
                    .doesNotBlockMovement()
                    .notSolid()));

    public static final RegistryObject<FlowingFluidBlock> SPARKLING_WATER_BLOCK = MorefoodBlocks.BLOCKS.register("sparkling_water",
            () -> new FlowingFluidBlock(() -> MorefoodFluid.SPARKLING_WATER_FLUID.get(), Block.Properties.create(Material.WATER)
                    .hardnessAndResistance(100f)
                    .noDrops()
                    .doesNotBlockMovement()
                    .notSolid()));
}