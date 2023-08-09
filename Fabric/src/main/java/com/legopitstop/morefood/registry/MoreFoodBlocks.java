package com.legopitstop.morefood.registry;

import com.legopitstop.morefood.MoreFood;
import com.legopitstop.morefood.block.*;
import com.legopitstop.morefood.world.tree.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.blockpredicate.SolidBlockPredicate;

public class MoreFoodBlocks {
    // MISC
    public static Block WATERMINT = new FernBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XYZ).burnable().pistonBehavior(PistonBehavior.DESTROY));
    public static Block SPEARMINT = new FernBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XYZ).burnable().pistonBehavior(PistonBehavior.DESTROY));

    // SACKS
    public static Block ALMOND_SACK = createSack(MapColor.STONE_GRAY);
    public static Block CHERRY_SACK = createSack(MapColor.STONE_GRAY);
    public static Block AVOCADO_SACK = createSack(MapColor.STONE_GRAY);
    public static Block BANANA_SACK = createSack(MapColor.STONE_GRAY);
    public static Block BARLEY_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block BEAN_SACK = createSack(MapColor.STONE_GRAY);
    public static Block BLUEBERRY_SACK = createSack(MapColor.STONE_GRAY);
    public static Block BLUEBERRY_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block BUCKWHEAT_SACK = createSack(MapColor.STONE_GRAY);
    public static Block CABBAGE_SACK = createSack(MapColor.STONE_GRAY);
    public static Block CABBAGE_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block CHOCOLATE_CHUNK_OATMEAL_COOKIE_SACK = createSack(MapColor.STONE_GRAY);
    public static Block COCONUT_SACK = createSack(MapColor.STONE_GRAY);
    public static Block COFFEE_BEAN_SACK = createSack(MapColor.STONE_GRAY);
    public static Block CORN_FLOUR_SACK = createSack(MapColor.STONE_GRAY);
    public static Block CORN_COB_SACK = createSack(MapColor.STONE_GRAY);
    public static Block CORN_SACK = createSack(MapColor.STONE_GRAY);
    public static Block CRANBERRY_SACK = createSack(MapColor.STONE_GRAY);
    public static Block EGGPLANT_SACK = createSack(MapColor.STONE_GRAY);
    public static Block EGGPLANT_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block FLOUR_SACK = createSack(MapColor.STONE_GRAY);
    public static Block GARLIC_SACK = createSack(MapColor.STONE_GRAY);
    public static Block GHERKIN_SACK = createSack(MapColor.STONE_GRAY);
    public static Block GHERKIN_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block GRAPE_SACK = createSack(MapColor.STONE_GRAY);
    public static Block GRAPE_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block HOPS_SACK = createSack(MapColor.STONE_GRAY);
    public static Block HOPS_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block LEMON_SACK = createSack(MapColor.STONE_GRAY);
    public static Block LETTUCE_SACK = createSack(MapColor.STONE_GRAY);
    public static Block LETTUCE_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block NETHER_COOKIE_SACK = createSack(MapColor.STONE_GRAY);
    public static Block OATMEAL_COOKIE_SACK = createSack(MapColor.STONE_GRAY);
    public static Block OAT_SACK = createSack(MapColor.STONE_GRAY);
    public static Block OAT_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block OLIVES_SACK = createSack(MapColor.STONE_GRAY);
    public static Block ONION_SACK = createSack(MapColor.STONE_GRAY);
    public static Block ONION_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block ORANGE_SACK = createSack(MapColor.STONE_GRAY);
    public static Block PEANUT_SACK = createSack(MapColor.STONE_GRAY);
    public static Block PEANUT_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block PEPPER_SACK = createSack(MapColor.STONE_GRAY);
    public static Block PEPPER_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block PLUM_SACK = createSack(MapColor.STONE_GRAY);
    public static Block POISONOUS_SWEET_POTATO_SACK = createSack(MapColor.STONE_GRAY);
    public static Block POISON_BERRY_SACK = createSack(MapColor.STONE_GRAY);
    public static Block RASPBERRY_SACK = createSack(MapColor.STONE_GRAY);
    public static Block RASPBERRY_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block RICE_SACK = createSack(MapColor.STONE_GRAY);
    public static Block RICE_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block SOYBEAN_SACK = createSack(MapColor.STONE_GRAY);
    public static Block SPINACH_SACK = createSack(MapColor.STONE_GRAY);
    public static Block SPINACH_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block STRAWBERRY_SACK = createSack(MapColor.STONE_GRAY);
    public static Block STRAWBERRY_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block SUGAR_COOKIE_SACK = createSack(MapColor.STONE_GRAY);
    public static Block SWEET_POTATO_SACK = createSack(MapColor.STONE_GRAY);
    public static Block TEA_LEAF_SACK = createSack(MapColor.STONE_GRAY);
    public static Block TEA_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block TOMATO_SACK = createSack(MapColor.STONE_GRAY);
    public static Block TOMATO_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block VANILLA_POD_SACK = createSack(MapColor.STONE_GRAY);
    public static Block VANILLA_SEED_SACK = createSack(MapColor.STONE_GRAY);
    public static Block YEAST_SACK = createSack(MapColor.STONE_GRAY);

    // Custom
    public static Block WOODEN_TREE_TAP = new TreeTapBlock(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(2.0f, 3.0f).ticksRandomly().sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY));
    public static Block SAP_CAULDRON = new SapCauldronBlock(FabricBlockSettings.copy(Blocks.CAULDRON));
    public static Block LARGE_PUMPKIN_PALE = new LargePaleBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(2.0f, 3.0f).ticksRandomly().sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.DESTROY));
    public static Block SMALL_PUMPKIN_PALE = new SmallPaleBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(2.0f, 3.0f).ticksRandomly().sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.DESTROY));

    // SAPLING
    public static final Block AVOCADO_SAPLING = createSapling(new AvocadoSaplingGenerator());
    public static final Block ALMOND_SAPLING = createSapling(new AlmondSaplingGenerator());
    public static final Block PLUM_SAPLING = createSapling(new PlumSaplingGenerator());
    public static final Block BANANA_SAPLING = createSapling(new BananaSaplingGenerator());
    public static final Block LEMON_SAPLING = createSapling(new LemonSaplingGenerator());
    public static final Block PALM_SAPLING = createSapling(new PalmSaplingGenerator());
    public static final Block OLIVE_SAPLING = createSapling(new OliveSaplingGenerator());
    public static final Block ORANGE_SAPLING = createSapling(new OrangeSaplingGenerator());
    public static final Block APPLE_SAPLING = createSapling(new AppleSaplingGenerator());

    // HANGING
    public static final Block HANGING_CHERRY = createHangingCrop("morefood:cherries", Blocks.CHERRY_SAPLING);
    public static final Block HANGING_APPLE = createHangingCrop("minecraft:apple", APPLE_SAPLING);
    public static final Block HANGING_BANANA = createHangingCrop("morefood:banana", BANANA_SAPLING);
    public static final Block HANGING_ALMOND = createHangingCrop("morefood:almonds", ALMOND_SAPLING);
    public static final Block HANGING_AVOCADO = createHangingCrop("morefood:avocado", AVOCADO_SAPLING);
    public static final Block HANGING_COCONUT = createHangingCrop("morefood:coconut", PALM_SAPLING);
    public static final Block HANGING_LEMON = createHangingCrop("morefood:lemon", LEMON_SAPLING);
    public static final Block HANGING_OLIVE = createHangingCrop("morefood:olives", OLIVE_SAPLING);
    public static final Block HANGING_ORANGE = createHangingCrop("morefood:orange", ORANGE_SAPLING);
    public static final Block HANGING_PLUM = createHangingCrop("morefood:plum", PLUM_SAPLING);

    // POTTED PLANTS
    public static final Block POTTED_WATERMINT = createFlowerPot(WATERMINT);
    public static final Block POTTED_SPEARMINT = createFlowerPot(SPEARMINT);
    public static final Block POTTED_AVOCADO_SAPLING = createFlowerPot(AVOCADO_SAPLING);
    public static final Block POTTED_ALMOND_SAPLING = createFlowerPot(ALMOND_SAPLING);
    public static final Block POTTED_PLUM_SAPLING = createFlowerPot(PLUM_SAPLING);
    public static final Block POTTED_BANANA_SAPLING = createFlowerPot(BANANA_SAPLING);
    public static final Block POTTED_LEMON_SAPLING = createFlowerPot(LEMON_SAPLING);
    public static final Block POTTED_PALM_SAPLING = createFlowerPot(PALM_SAPLING);
    public static final Block POTTED_OLIVE_SAPLING = createFlowerPot(OLIVE_SAPLING);
    public static final Block POTTED_ORANGE_SAPLING = createFlowerPot(ORANGE_SAPLING);
    public static final Block POTTED_APPLE_SAPLING = createFlowerPot(APPLE_SAPLING);


    // CAKE
    public static Block CHOCOLATE_CAKE = createCake();
    public static Block RAINBOW_CAKE = createCake();
    public static Block REDWHITEBLUE_CAKE = createCake();
    public static Block POUND_CAKE = createCake();
    public static Block CAKE_WITH_CHERRIES = createCake();

    // CANDLE_CAKE
    public static Block CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.CANDLE);
    public static Block WHITE_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.WHITE_CANDLE);
    public static Block ORANGE_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.ORANGE_CANDLE);
    public static Block MAGENTA_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.MAGENTA_CANDLE);
    public static Block LIGHT_BLUE_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.LIGHT_BLUE_CANDLE);
    public static Block YELLOW_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.YELLOW_CANDLE);
    public static Block LIME_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.LIME_CANDLE);
    public static Block PINK_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.PINK_CANDLE);
    public static Block GRAY_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.GRAY_CANDLE);
    public static Block LIGHT_GRAY_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.LIGHT_GRAY_CANDLE);
    public static Block CYAN_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.CYAN_CANDLE);
    public static Block PURPLE_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.PURPLE_CANDLE);
    public static Block BLUE_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.BLUE_CANDLE);
    public static Block BROWN_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.BROWN_CANDLE);
    public static Block GREEN_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.GREEN_CANDLE);
    public static Block RED_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.RED_CANDLE);
    public static Block BLACK_CANDLE_CHOCOLATE_CAKE = createCandleCake(CHOCOLATE_CAKE, Blocks.BLACK_CANDLE);

    public static Block CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.CANDLE);
    public static Block WHITE_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.WHITE_CANDLE);
    public static Block ORANGE_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.ORANGE_CANDLE);
    public static Block MAGENTA_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.MAGENTA_CANDLE);
    public static Block LIGHT_BLUE_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.LIGHT_BLUE_CANDLE);
    public static Block YELLOW_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.YELLOW_CANDLE);
    public static Block LIME_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.LIME_CANDLE);
    public static Block PINK_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.PINK_CANDLE);
    public static Block GRAY_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.GRAY_CANDLE);
    public static Block LIGHT_GRAY_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.LIGHT_GRAY_CANDLE);
    public static Block CYAN_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.CYAN_CANDLE);
    public static Block PURPLE_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.PURPLE_CANDLE);
    public static Block BLUE_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.BLUE_CANDLE);
    public static Block BROWN_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.BROWN_CANDLE);
    public static Block GREEN_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.GREEN_CANDLE);
    public static Block RED_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.RED_CANDLE);
    public static Block BLACK_CANDLE_RAINBOW_CAKE = createCandleCake(RAINBOW_CAKE, Blocks.BLACK_CANDLE);

    public static Block CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.CANDLE);
    public static Block WHITE_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.WHITE_CANDLE);
    public static Block ORANGE_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.ORANGE_CANDLE);
    public static Block MAGENTA_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.MAGENTA_CANDLE);
    public static Block LIGHT_BLUE_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.LIGHT_BLUE_CANDLE);
    public static Block YELLOW_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.YELLOW_CANDLE);
    public static Block LIME_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.LIME_CANDLE);
    public static Block PINK_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.PINK_CANDLE);
    public static Block GRAY_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.GRAY_CANDLE);
    public static Block LIGHT_GRAY_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.LIGHT_GRAY_CANDLE);
    public static Block CYAN_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.CYAN_CANDLE);
    public static Block PURPLE_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.PURPLE_CANDLE);
    public static Block BLUE_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.BLUE_CANDLE);
    public static Block BROWN_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.BROWN_CANDLE);
    public static Block GREEN_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.GREEN_CANDLE);
    public static Block RED_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.RED_CANDLE);
    public static Block BLACK_CANDLE_REDWHITEBLUE_CAKE = createCandleCake(REDWHITEBLUE_CAKE, Blocks.BLACK_CANDLE);

    public static Block CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.CANDLE);
    public static Block WHITE_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.WHITE_CANDLE);
    public static Block ORANGE_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.ORANGE_CANDLE);
    public static Block MAGENTA_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.MAGENTA_CANDLE);
    public static Block LIGHT_BLUE_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.LIGHT_BLUE_CANDLE);
    public static Block YELLOW_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.YELLOW_CANDLE);
    public static Block LIME_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.LIME_CANDLE);
    public static Block PINK_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.PINK_CANDLE);
    public static Block GRAY_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.GRAY_CANDLE);
    public static Block LIGHT_GRAY_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.LIGHT_GRAY_CANDLE);
    public static Block CYAN_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.CYAN_CANDLE);
    public static Block PURPLE_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.PURPLE_CANDLE);
    public static Block BLUE_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.BLUE_CANDLE);
    public static Block BROWN_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.BROWN_CANDLE);
    public static Block GREEN_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.GREEN_CANDLE);
    public static Block RED_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.RED_CANDLE);
    public static Block BLACK_CANDLE_POUND_CAKE = createCandleCake(POUND_CAKE, Blocks.BLACK_CANDLE);

    public static Block CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.CANDLE);
    public static Block WHITE_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.WHITE_CANDLE);
    public static Block ORANGE_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.ORANGE_CANDLE);
    public static Block MAGENTA_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.MAGENTA_CANDLE);
    public static Block LIGHT_BLUE_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.LIGHT_BLUE_CANDLE);
    public static Block YELLOW_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.YELLOW_CANDLE);
    public static Block LIME_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.LIME_CANDLE);
    public static Block PINK_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.PINK_CANDLE);
    public static Block GRAY_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.GRAY_CANDLE);
    public static Block LIGHT_GRAY_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.LIGHT_GRAY_CANDLE);
    public static Block CYAN_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.CYAN_CANDLE);
    public static Block PURPLE_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.PURPLE_CANDLE);
    public static Block BLUE_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.BLUE_CANDLE);
    public static Block BROWN_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.BROWN_CANDLE);
    public static Block GREEN_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.GREEN_CANDLE);
    public static Block RED_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.RED_CANDLE);
    public static Block BLACK_CANDLE_CAKE_WITH_CHERRIES = createCandleCake(CAKE_WITH_CHERRIES, Blocks.BLACK_CANDLE);

    // BUSH
    public static final Block BEAN_BUSH = createBush("morefood:beans");
    public static final Block BLUEBERRY_BUSH = createBush("morefood:blueberries");
    public static final Block COFFEE_BUSH = createBush("morefood:coffee_beans.json");
    public static final Block CRANBERRY_BUSH = createBush("morefood:cranberries");
    public static final Block EGGPLANT_BUSH = createBush("morefood:eggplant");
    public static final Block GHERKIN_BUSH = createBush("morefood:gherkin");
    public static final Block GRAPE_BUSH = createBush("morefood:grape");
    public static final Block PEPPER_BUSH = createBush("morefood:pepper");
    public static final Block PEPPERMINT_BUSH = createBush("morefood:peppermint");
    public static final Block POISON_BERRY_BUSH = createBush("morefood:poison_berries");
    public static final Block RASPBERRY_BUSH = createBush("morefood:raspberry");
    public static final Block SOYBEAN_BUSH = createBush("morefood:soybeans");
    public static final Block STRAWBERRY_BUSH = createBush("morefood:strawberry");
    public static final Block TEA_BUSH = createBush("morefood:tea_leaves");
    public static final Block TOMATO_BUSH = createBush("morefood:tomato");
    public static final Block VANILLA_BUSH = createBush("morefood:vanilla_pod");

    // CROP
    public static final Block BARLEY_CROP = createCrop();
    public static final Block CORN_CROP = createCrop();
    public static final Block HOPS_CROP = createCrop();
    public static final Block OAT_CROP = createCrop();
    public static final Block BUCKWHEAT_CROP = createCrop();
    public static final Block PEANUT_CROP = createCrop();
    public static final Block LETTUCE_CROP = createCrop();
    public static final Block RICE_CROP = createCrop();
    public static final Block ONION_CROP = createCrop();
    public static final Block CABBAGE_CROP = createCrop();
    public static final Block SPINACH_CROP = createCrop();
    public static final Block GARLIC_CROP = createCrop();

    public static Block createBush(String cropItem) {
        return new MoreFoodBushBlock(cropItem,FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY));
    }
    public static Block createSack(MapColor mapColor) {
        return new SackBlock(AbstractBlock.Settings.create().mapColor(mapColor).strength(0.3f, 0.3f));
    }

    public static Block createCrop() {
        return new MoreFoodCropBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY));
    }

    public static Block createCandleCake(Block cake, Block candle) {
        return new MoreFoodCandleCakeBlock(cake, candle, FabricBlockSettings.copy(Blocks.CANDLE_CAKE));
    }

    public static Block createCake() {
        return new MoreFoodCakeBlock(FabricBlockSettings.copy(Blocks.CAKE));
    }

    public static Block createFlowerPot(Block content) {
        return new FlowerPotBlock(content, FabricBlockSettings.create().breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
    }

    public static Block createHangingCrop(String cropItem, Block saplingBlock) {
        return new HangingCropBlock(cropItem, saplingBlock, FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY));
    }

    public static Block createSapling(SaplingGenerator generator) {
        return new SaplingBlock(generator, FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY).nonOpaque());
    }

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "cherry_sack"), CHERRY_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "almond_sack"), ALMOND_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "avocado_sack"), AVOCADO_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "banana_sack"), BANANA_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "barley_seed_sack"), BARLEY_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "bean_sack"), BEAN_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "blueberry_sack"), BLUEBERRY_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "blueberry_seed_sack"), BLUEBERRY_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "buckwheat_sack"), BUCKWHEAT_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "cabbage_sack"), CABBAGE_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "cabbage_seed_sack"), CABBAGE_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "chocolate_chunk_oatmeal_cookie_sack"), CHOCOLATE_CHUNK_OATMEAL_COOKIE_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "coconut_sack"), COCONUT_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "coffee_bean_sack"), COFFEE_BEAN_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "corn_flour_sack"), CORN_FLOUR_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "corn_cob_sack"), CORN_COB_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "corn_sack"), CORN_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "cranberry_sack"), CRANBERRY_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "eggplant_sack"), EGGPLANT_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "eggplant_seed_sack"), EGGPLANT_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "flour_sack"), FLOUR_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "garlic_sack"), GARLIC_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "gherkin_sack"), GHERKIN_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "gherkin_seed_sack"), GHERKIN_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "grape_sack"), GRAPE_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "grape_seed_sack"), GRAPE_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "hops_sack"), HOPS_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "hops_seed_sack"), HOPS_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "lemon_sack"), LEMON_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "lettuce_sack"), LETTUCE_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "lettuce_seed_sack"), LETTUCE_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "nether_cookie_sack"), NETHER_COOKIE_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "oatmeal_cookie_sack"), OATMEAL_COOKIE_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "oat_sack"), OAT_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "oat_seed_sack"), OAT_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "olives_sack"), OLIVES_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "onion_sack"), ONION_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "onion_seed_sack"), ONION_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "orange_sack"), ORANGE_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "peanut_sack"), PEANUT_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "peanut_seed_sack"), PEANUT_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "pepper_sack"), PEPPER_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "pepper_seed_sack"), PEPPER_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "plum_sack"), PLUM_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "poisonous_sweet_potato_sack"), POISONOUS_SWEET_POTATO_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "poison_berry_sack"), POISON_BERRY_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "raspberry_sack"), RASPBERRY_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "raspberry_seed_sack"), RASPBERRY_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "rice_sack"), RICE_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "rice_seed_sack"), RICE_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "soybean_sack"), SOYBEAN_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "spinach_sack"), SPINACH_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "spinach_seed_sack"), SPINACH_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "strawberry_sack"), STRAWBERRY_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "strawberry_seed_sack"), STRAWBERRY_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "sugar_cookie_sack"), SUGAR_COOKIE_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "sweet_potato_sack"), SWEET_POTATO_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "tea_leaf_sack"), TEA_LEAF_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "tea_seed_sack"), TEA_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "tomato_sack"), TOMATO_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "tomato_seed_sack"), TOMATO_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "vanilla_pod_sack"), VANILLA_POD_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "vanilla_seed_sack"), VANILLA_SEED_SACK);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "yeast_sack"), YEAST_SACK);

        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "potted_avocado_sapling"), POTTED_AVOCADO_SAPLING );
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "potted_almond_sapling"), POTTED_ALMOND_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "potted_plum_sapling"), POTTED_PLUM_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "potted_banana_sapling"), POTTED_BANANA_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "potted_lemon_sapling"), POTTED_LEMON_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "potted_palm_sapling"), POTTED_PALM_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "potted_olive_sapling"), POTTED_OLIVE_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "potted_orange_sapling"), POTTED_ORANGE_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "potted_apple_sapling"), POTTED_APPLE_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "potted_watermint"), POTTED_WATERMINT);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "potted_spearmint"), POTTED_SPEARMINT);

        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "large_pumpkin_pale"), LARGE_PUMPKIN_PALE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "small_pumpkin_pale"), SMALL_PUMPKIN_PALE);

        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "wooden_tree_tap"), WOODEN_TREE_TAP);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "sap_cauldron"), SAP_CAULDRON);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "watermint"), WATERMINT);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "spearmint"), SPEARMINT);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "chocolate_cake"), CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "rainbow_cake"), RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "redwhiteblue_cake"), REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "pound_cake"), POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "cake_with_cherries"), CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "candle_chocolate_cake"), CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "white_candle_chocolate_cake"), WHITE_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "orange_candle_chocolate_cake"), ORANGE_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "magenta_candle_chocolate_cake"), MAGENTA_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "light_blue_candle_chocolate_cake"), LIGHT_BLUE_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "yellow_candle_chocolate_cake"), YELLOW_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "lime_candle_chocolate_cake"), LIME_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "pink_candle_chocolate_cake"), PINK_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "gray_candle_chocolate_cake"), GRAY_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "light_gray_candle_chocolate_cake"), LIGHT_GRAY_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "cyan_candle_chocolate_cake"), CYAN_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "purple_candle_chocolate_cake"), PURPLE_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "blue_candle_chocolate_cake"), BLUE_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "brown_candle_chocolate_cake"), BROWN_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "green_candle_chocolate_cake"), GREEN_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "red_candle_chocolate_cake"), RED_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "black_candle_chocolate_cake"), BLACK_CANDLE_CHOCOLATE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "candle_rainbow_cake"), CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "white_candle_rainbow_cake"), WHITE_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "orange_candle_rainbow_cake"), ORANGE_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "magenta_candle_rainbow_cake"), MAGENTA_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "light_blue_candle_rainbow_cake"), LIGHT_BLUE_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "yellow_candle_rainbow_cake"), YELLOW_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "lime_candle_rainbow_cake"), LIME_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "pink_candle_rainbow_cake"), PINK_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "gray_candle_rainbow_cake"), GRAY_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "light_gray_candle_rainbow_cake"), LIGHT_GRAY_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "cyan_candle_rainbow_cake"), CYAN_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "purple_candle_rainbow_cake"), PURPLE_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "blue_candle_rainbow_cake"), BLUE_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "brown_candle_rainbow_cake"), BROWN_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "green_candle_rainbow_cake"), GREEN_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "red_candle_rainbow_cake"), RED_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "black_candle_rainbow_cake"), BLACK_CANDLE_RAINBOW_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "candle_redwhiteblue_cake"), CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "white_candle_redwhiteblue_cake"), WHITE_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "orange_candle_redwhiteblue_cake"), ORANGE_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "magenta_candle_redwhiteblue_cake"), MAGENTA_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "light_blue_candle_redwhiteblue_cake"), LIGHT_BLUE_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "yellow_candle_redwhiteblue_cake"), YELLOW_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "lime_candle_redwhiteblue_cake"), LIME_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "pink_candle_redwhiteblue_cake"), PINK_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "gray_candle_redwhiteblue_cake"), GRAY_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "light_gray_candle_redwhiteblue_cake"), LIGHT_GRAY_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "cyan_candle_redwhiteblue_cake"), CYAN_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "purple_candle_redwhiteblue_cake"), PURPLE_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "blue_candle_redwhiteblue_cake"), BLUE_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "brown_candle_redwhiteblue_cake"), BROWN_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "green_candle_redwhiteblue_cake"), GREEN_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "red_candle_redwhiteblue_cake"), RED_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "black_candle_redwhiteblue_cake"), BLACK_CANDLE_REDWHITEBLUE_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "candle_pound_cake"), CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "white_candle_pound_cake"), WHITE_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "orange_candle_pound_cake"), ORANGE_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "magenta_candle_pound_cake"), MAGENTA_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "light_blue_candle_pound_cake"), LIGHT_BLUE_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "yellow_candle_pound_cake"), YELLOW_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "lime_candle_pound_cake"), LIME_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "pink_candle_pound_cake"), PINK_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "gray_candle_pound_cake"), GRAY_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "light_gray_candle_pound_cake"), LIGHT_GRAY_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "cyan_candle_pound_cake"), CYAN_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "purple_candle_pound_cake"), PURPLE_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "blue_candle_pound_cake"), BLUE_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "brown_candle_pound_cake"), BROWN_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "green_candle_pound_cake"), GREEN_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "red_candle_pound_cake"), RED_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "black_candle_pound_cake"), BLACK_CANDLE_POUND_CAKE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "candle_cake_with_cherries"), CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "white_candle_cake_with_cherries"), WHITE_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "orange_candle_cake_with_cherries"), ORANGE_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "magenta_candle_cake_with_cherries"), MAGENTA_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "light_blue_candle_cake_with_cherries"), LIGHT_BLUE_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "yellow_candle_cake_with_cherries"), YELLOW_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "lime_candle_cake_with_cherries"), LIME_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "pink_candle_cake_with_cherries"), PINK_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "gray_candle_cake_with_cherries"), GRAY_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "light_gray_candle_cake_with_cherries"), LIGHT_GRAY_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "cyan_candle_cake_with_cherries"), CYAN_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "purple_candle_cake_with_cherries"), PURPLE_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "blue_candle_cake_with_cherries"), BLUE_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "brown_candle_cake_with_cherries"), BROWN_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "green_candle_cake_with_cherries"), GREEN_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "red_candle_cake_with_cherries"), RED_CANDLE_CAKE_WITH_CHERRIES);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "black_candle_cake_with_cherries"), BLACK_CANDLE_CAKE_WITH_CHERRIES);

        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "avocado_sapling"), AVOCADO_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "almond_sapling"), ALMOND_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "plum_sapling"), PLUM_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "banana_sapling"), BANANA_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "lemon_sapling"), LEMON_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "palm_sapling"), PALM_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "olive_sapling"), OLIVE_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "orange_sapling"), ORANGE_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "apple_sapling"), APPLE_SAPLING);

        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "hanging_cherry"), HANGING_CHERRY);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "hanging_apple"), HANGING_APPLE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "hanging_banana"), HANGING_BANANA);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "hanging_almond"), HANGING_ALMOND);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "hanging_avocado"), HANGING_AVOCADO);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "hanging_coconut"), HANGING_COCONUT);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "hanging_lemon"), HANGING_LEMON);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "hanging_olive"), HANGING_OLIVE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "hanging_orange"), HANGING_ORANGE);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "hanging_plum"), HANGING_PLUM);

        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "bean_bush"), BEAN_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "blueberry_bush"), BLUEBERRY_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "coffee_bush"), COFFEE_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "cranberry_bush"), CRANBERRY_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "eggplant_bush"), EGGPLANT_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "gherkin_bush"), GHERKIN_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "grape_bush"), GRAPE_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "peanut_crop"), PEANUT_CROP);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "pepper_bush"), PEPPER_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "peppermint_bush"), PEPPERMINT_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "poison_berry_bush"), POISON_BERRY_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "raspberry_bush"), RASPBERRY_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "soybean_bush"), SOYBEAN_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "strawberry_bush"), STRAWBERRY_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "tea_bush"), TEA_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "tomato_bush"), TOMATO_BUSH);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "vanilla_bush"), VANILLA_BUSH);

        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "barley_crop"), BARLEY_CROP);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "corn_crop"), CORN_CROP);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "hops_crop"), HOPS_CROP);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "lettuce_crop"), LETTUCE_CROP);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "rice_crop"), RICE_CROP);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "onion_crop"), ONION_CROP);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "cabbage_crop"), CABBAGE_CROP);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "oat_crop"), OAT_CROP);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "spinach_crop"), SPINACH_CROP);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "garlic_crop"), GARLIC_CROP);
        Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, "buckwheat_crop"), BUCKWHEAT_CROP);

    }
}
