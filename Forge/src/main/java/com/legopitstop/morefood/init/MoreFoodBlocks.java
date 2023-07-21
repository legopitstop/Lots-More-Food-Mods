package com.legopitstop.morefood.init;

import com.legopitstop.morefood.MoreFood;
import com.legopitstop.morefood.blocks.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.openjdk.nashorn.internal.runtime.regexp.joni.constants.RegexState;

public class MoreFoodBlocks {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreFood.MOD_ID);

    // CROPS
    public static final RegistryObject<Block> BARLEY = BLOCKS.register("barley", () -> new BarleyCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<Block> CORN = BLOCKS.register("corn", () -> new CornCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<Block> HOPS = BLOCKS.register("hops", () -> new HopsCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<Block> LETTUCE = BLOCKS.register("lettuce", () -> new LettuceCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS)));
    public static final RegistryObject<Block> ONION = BLOCKS.register("onion", () -> new OnionCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS)));
    public static final RegistryObject<Block> RICE = BLOCKS.register("rice", () -> new RiceCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS)));

    // BUSHES
    public static final RegistryObject<Block> COFFEE_BUSH = BLOCKS.register("coffee_bush", () -> new CoffeeBush(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> GHERKIN_BUSH = BLOCKS.register("gherkin_bush", () -> new GherkinBush(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> GRAPE_BUSH = BLOCKS.register("grape_bush", () -> new GrapeBush(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> RASPBERRY_BUSH = BLOCKS.register("raspberry_bush", () -> new RaspberryBush(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> STRAWBERRY_BUSH = BLOCKS.register("strawberry_bush", () -> new StrawberryBush(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> TEA_BUSH = BLOCKS.register("tea_bush", () -> new TeaBush(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> TOMATO_BUSH = BLOCKS.register("tomato_bush", () -> new TomatoBush(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> VANILLA_BUSH = BLOCKS.register("vanilla_bush", () -> new VanillaBush(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> PEPPER_BUSH = BLOCKS.register("pepper_bush", () -> new PepperBush(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    // SAPLINGS
    // CAKES
    public static final RegistryObject<Block> CHOCOLATE_CAKE = BLOCKS.register("chocolate_cake", () -> new MoreFoodCake(Block.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> RAINBOW_CAKE = BLOCKS.register("rainbow_cake", () -> new MoreFoodCake(Block.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> REDWHITEBLUE_CAKE = BLOCKS.register("redwhiteblue_cake", () -> new MoreFoodCake(Block.Properties.copy(Blocks.CAKE)));

    // CANDLE CAKES
    public static final RegistryObject<Block> CANDLE_CHOCOLATE_CAKE = BLOCKS.register("candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(Blocks.CANDLE_CAKE)));
    public static final RegistryObject<Block> WHITE_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("white_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.WHITE_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> ORANGE_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("orange_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.ORANGE_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> MAGENTA_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("magenta_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.MAGENTA_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("light_blue_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.LIGHT_BLUE_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> YELLOW_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("yellow_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.YELLOW_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> LIME_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("lime_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.LIME_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> PINK_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("pink_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.PINK_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("light_gray_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.LIGHT_GRAY_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> GRAY_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("gray_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.GRAY_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> CYAN_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("cyan_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.CYAN_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> PURPLE_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("purple_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.PURPLE_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> BLUE_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("blue_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.BLUE_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> BROWN_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("brown_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.BROWN_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> GREEN_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("green_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.GREEN_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> RED_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("red_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.RED_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));
    public static final RegistryObject<Block> BLACK_CANDLE_CHOCOLATE_CAKE = BLOCKS.register("black_candle_chocolate_cake", () -> new MoreFoodCandleCake(Blocks.BLACK_CANDLE, MoreFoodBlocks.CHOCOLATE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE.get())));

    public static final RegistryObject<Block> CANDLE_RAINBOW_CAKE = BLOCKS.register("candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(), Block.Properties.copy(Blocks.CANDLE_CAKE)));
    public static final RegistryObject<Block> WHITE_CANDLE_RAINBOW_CAKE = BLOCKS.register("white_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.WHITE_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> ORANGE_CANDLE_RAINBOW_CAKE = BLOCKS.register("orange_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.ORANGE_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> MAGENTA_CANDLE_RAINBOW_CAKE = BLOCKS.register("magenta_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.MAGENTA_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_CANDLE_RAINBOW_CAKE = BLOCKS.register("light_blue_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.LIGHT_BLUE_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> YELLOW_CANDLE_RAINBOW_CAKE = BLOCKS.register("yellow_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.YELLOW_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> LIME_CANDLE_RAINBOW_CAKE = BLOCKS.register("lime_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.LIME_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> PINK_CANDLE_RAINBOW_CAKE = BLOCKS.register("pink_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.PINK_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_CANDLE_RAINBOW_CAKE = BLOCKS.register("light_gray_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.LIGHT_GRAY_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> GRAY_CANDLE_RAINBOW_CAKE = BLOCKS.register("gray_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.GRAY_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> CYAN_CANDLE_RAINBOW_CAKE = BLOCKS.register("cyan_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.CYAN_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> PURPLE_CANDLE_RAINBOW_CAKE = BLOCKS.register("purple_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.PURPLE_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> BLUE_CANDLE_RAINBOW_CAKE = BLOCKS.register("blue_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.BLUE_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> BROWN_CANDLE_RAINBOW_CAKE = BLOCKS.register("brown_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.BROWN_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> GREEN_CANDLE_RAINBOW_CAKE = BLOCKS.register("green_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.GREEN_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> RED_CANDLE_RAINBOW_CAKE = BLOCKS.register("red_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.RED_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));
    public static final RegistryObject<Block> BLACK_CANDLE_RAINBOW_CAKE = BLOCKS.register("black_candle_rainbow_cake", () -> new MoreFoodCandleCake(Blocks.BLACK_CANDLE, MoreFoodBlocks.RAINBOW_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_RAINBOW_CAKE.get())));

    public static final RegistryObject<Block> CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(Blocks.CANDLE_CAKE)));
    public static final RegistryObject<Block> WHITE_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("white_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.WHITE_CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> ORANGE_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("orange_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.ORANGE_CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> MAGENTA_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("magenta_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.MAGENTA_CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("light_blue_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.LIGHT_BLUE_CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> YELLOW_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("yellow_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.YELLOW_CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> LIME_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("lime_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.LIME_CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> PINK_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("pink_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.PINK_CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("light_gray_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.LIGHT_GRAY_CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> GRAY_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("gray_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.GRAY_CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> CYAN_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("cyan_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.CYAN_CANDLE,MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> PURPLE_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("purple_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.PURPLE_CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> BLUE_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("blue_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.BLUE_CANDLE,MoreFoodBlocks.REDWHITEBLUE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> BROWN_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("brown_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.BROWN_CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> GREEN_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("green_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.GREEN_CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> RED_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("red_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.RED_CANDLE, MoreFoodBlocks.REDWHITEBLUE_CAKE.get(),Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
    public static final RegistryObject<Block> BLACK_CANDLE_REDWHITEBLUE_CAKE = BLOCKS.register("black_candle_redwhiteblue_cake", () -> new MoreFoodCandleCake(Blocks.BLACK_CANDLE,MoreFoodBlocks.REDWHITEBLUE_CAKE.get(), Block.Properties.copy(MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE.get())));
}
