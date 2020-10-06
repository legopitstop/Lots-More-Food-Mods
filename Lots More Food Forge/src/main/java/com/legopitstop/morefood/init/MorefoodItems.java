package com.legopitstop.morefood.init;

import com.legopitstop.morefood.MoreFood;
import com.legopitstop.morefood.blocks.BlockItemBase;
import com.legopitstop.morefood.fluidItems.SparklingWaterBucket;
import com.legopitstop.morefood.fluidItems.CheeseBucket;
import com.legopitstop.morefood.foods.Custom.CreativeHunger;
import com.legopitstop.morefood.foods.LikeApple.*;
import com.legopitstop.morefood.foods.LikeBakedPotato.BakedPotato;
import com.legopitstop.morefood.foods.LikeBeef.Beef;
import com.legopitstop.morefood.foods.LikeBeetroot.Beetroot;
import com.legopitstop.morefood.foods.LikeBeetroot.DrinkBeetroot;
import com.legopitstop.morefood.foods.LikeBeetrootSoup.*;
import com.legopitstop.morefood.foods.LikeBread.Bread;
import com.legopitstop.morefood.foods.LikeChicken.Chicken;
import com.legopitstop.morefood.foods.LikeCod.Cod;
import com.legopitstop.morefood.foods.LikeCookedBeef.CookedBeef;
import com.legopitstop.morefood.foods.LikeCookedChicken.ChickenSelect;
import com.legopitstop.morefood.foods.LikeCookedChicken.CookedChicken;
import com.legopitstop.morefood.foods.LikeCookedCod.CookedCod;
import com.legopitstop.morefood.foods.LikeCookedPorkchop.CookedPorkchop;
import com.legopitstop.morefood.foods.LikeCookedSalmon.CookedSalmon;
import com.legopitstop.morefood.foods.LikeCookie.Cookie;
import com.legopitstop.morefood.foods.LikeCookie.Jelly;
import com.legopitstop.morefood.foods.LikeDriedKelp.DriedKelp;
import com.legopitstop.morefood.foods.LikeDriedKelp.WarpedBerries;
import com.legopitstop.morefood.foods.LikeGoldenApple.*;
import com.legopitstop.morefood.foods.LikeGoldenCarrot.GoldenCarrot;
import com.legopitstop.morefood.foods.LikeGoldenCarrot.PopcornBucket;
import com.legopitstop.morefood.foods.LikeMelonSlice.MelonSlice;
import com.legopitstop.morefood.foods.LikeMelonSlice.ShroomLight;
import com.legopitstop.morefood.foods.LikeMilkBucket.DrinkMilkBucket;
import com.legopitstop.morefood.foods.LikeMushroomStew.MushroomStew;
import com.legopitstop.morefood.foods.LikePorkchop.Porkchop;
import com.legopitstop.morefood.foods.LikePotato.Potato;
import com.legopitstop.morefood.foods.LikePufferfish.Beer;
import com.legopitstop.morefood.foods.LikePufferfish.Cider;
import com.legopitstop.morefood.foods.LikePufferfish.Wine;
import com.legopitstop.morefood.foods.LikePumpkinPie.PumpkinPie;
import com.legopitstop.morefood.foods.LikeRabbitStew.RabbitStew;
import com.legopitstop.morefood.foods.LikeRottenFlesh.RottenPorkchop;
import com.legopitstop.morefood.foods.LikeSuspiciousStew.SuspiciousStew;
import com.legopitstop.morefood.items.ItemBase;
import com.legopitstop.morefood.items.KnifeItem;
import com.legopitstop.morefood.items.SpoonItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MorefoodItems {

    // Register items & blocks
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreFood.MOD_ID);

    public static final RegistryObject<Item> GLOWBERRIES = ITEMS.register("glowberries",
            ()-> new BlockItem(MorefoodBlocks.GLOWBERRIES_VINES.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    // Crop Item
    public static final RegistryObject<Item> BARLEY_SEEDS = ITEMS.register("barley_seeds",
            ()-> new BlockItem(MorefoodBlocks.BARLEY.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            ()-> new BlockItem(MorefoodBlocks.CORN.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    public static final RegistryObject<Item> HOPS_SEEDS = ITEMS.register("hops_seeds",
            ()-> new BlockItem(MorefoodBlocks.HOPS.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    public static final RegistryObject<Item> LETTUCE_SEEDS = ITEMS.register("lettuce_seeds",
            ()-> new BlockItem(MorefoodBlocks.LETTUCE.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_seeds",
            ()-> new BlockItem(MorefoodBlocks.RICE.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    public static final RegistryObject<Item> ONION_SEEDS = ITEMS.register("onion_seeds",
            ()-> new BlockItem(MorefoodBlocks.ONION.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    // Bushes
    public static final RegistryObject<Item> COFFEE_BEANS = ITEMS.register("coffee_beans",
            ()-> new BlockItem(MorefoodBlocks.COFFEE_BUSH.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    public static final RegistryObject<Item> GHERKIN_SEEDS = ITEMS.register("gherkin_seeds",
            ()-> new BlockItem(MorefoodBlocks.GHERKIN_BUSH.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    public static final RegistryObject<Item> GRAPE_SEEDS = ITEMS.register("grape_seeds",
            ()-> new BlockItem(MorefoodBlocks.GRAPE_BUSH.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    public static final RegistryObject<Item> RASPBERRY_SEEDS = ITEMS.register("raspberry_seeds",
            ()-> new BlockItem(MorefoodBlocks.RASPBERRY_BUSH.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
            ()-> new BlockItem(MorefoodBlocks.STRAWBERRY_BUSH.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    public static final RegistryObject<Item> TEA_SEEDS = ITEMS.register("tea_seeds",
            ()-> new BlockItem(MorefoodBlocks.TEA_BUSH.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            ()-> new BlockItem(MorefoodBlocks.TOMATO_BUSH.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    public static final RegistryObject<Item> VANILLA_SEEDS = ITEMS.register("vanilla_seeds",
            ()-> new BlockItem(MorefoodBlocks.VANILLA_BUSH.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    public static final RegistryObject<Item> PEPPER_SEEDS = ITEMS.register("pepper_seeds",
            ()-> new BlockItem(MorefoodBlocks.PEPPER_BUSH.get(),
                    new Item.Properties().group(MoreFood.TAB)));
    // Sapling

    // Block Items
    public static final RegistryObject<Item> APPLE_BLOCK_ITEM = ITEMS.register("apple_block",
            () -> new BlockItemBase(MorefoodBlocks.APPLE_BLOCK.get()));

    public static final RegistryObject<Item> BAKED_POTATO_BLOCK_ITEM = ITEMS.register("baked_potato_block",
            () -> new BlockItemBase(MorefoodBlocks.BAKED_POTATO_BLOCK.get()));

    public static final RegistryObject<Item> BANANA_BLOCK_ITEM = ITEMS.register("banana_block",
            () -> new BlockItemBase(MorefoodBlocks.BANANA_BLOCK.get()));

    public static final RegistryObject<Item> CARROT_BLOCK_ITEM = ITEMS.register("carrot_block",
            () -> new BlockItemBase(MorefoodBlocks.CARROT_BLOCK.get()));

    public static final RegistryObject<Item> COOKED_BEEF_BLOCK_ITEM = ITEMS.register("cooked_beef_block",
            () -> new BlockItemBase(MorefoodBlocks.COOKED_BEEF_BLOCK.get()));

    public static final RegistryObject<Item> COOKED_CHICKEN_BLOCK_ITEM = ITEMS.register("cooked_chicken_block",
            () -> new BlockItemBase(MorefoodBlocks.COOKED_CHICKEN_BLOCK.get()));

    public static final RegistryObject<Item> COOKED_MUTTON_BLOCK_ITEM = ITEMS.register("cooked_mutton_block",
            () -> new BlockItemBase(MorefoodBlocks.COOKED_MUTTON_BLOCK.get()));

    public static final RegistryObject<Item> COOKED_RABBIT_BLOCK_ITEM = ITEMS.register("cooked_rabbit_block",
            () -> new BlockItemBase(MorefoodBlocks.COOKED_RABBIT_BLOCK.get()));

    public static final RegistryObject<Item> COOKED_SQUID_BLOCK_ITEM = ITEMS.register("cooked_squid_block",
            () -> new BlockItemBase(MorefoodBlocks.COOKED_SQUID_BLOCK.get()));

    public static final RegistryObject<Item> COOKIE_BLOCK_ITEM = ITEMS.register("cookie_block",
            () -> new BlockItemBase(MorefoodBlocks.COOKIE_BLOCK.get()));

    public static final RegistryObject<Item> DARK_CHOCOLATE_BLOCK_ITEM = ITEMS.register("dark_chocolate_block",
            () -> new BlockItemBase(MorefoodBlocks.DARK_CHOCOLATE_BLOCK.get()));

    public static final RegistryObject<Item> GOLDEN_APPLE_BLOCK_ITEM = ITEMS.register("golden_apple_block",
            () -> new BlockItemBase(MorefoodBlocks.GOLDEN_APPLE_BLOCK.get()));

    public static final RegistryObject<Item> GRAPE_BLOCK_ITEM = ITEMS.register("grape_block",
            () -> new BlockItemBase(MorefoodBlocks.GRAPE_BLOCK.get()));

    public static final RegistryObject<Item> HOPS_BLOCK_ITEM = ITEMS.register("hops_block",
            () -> new BlockItemBase(MorefoodBlocks.HOPS_BLOCK.get()));

    public static final RegistryObject<Item> LEMON_BLOCK_ITEM = ITEMS.register("lemon_block",
            () -> new BlockItemBase(MorefoodBlocks.LEMON_BLOCK.get()));

    public static final RegistryObject<Item> MILK_CHOCOLATE_BLOCK_ITEM = ITEMS.register("milk_chocolate_block",
            () -> new BlockItemBase(MorefoodBlocks.MILK_CHOCOLATE_BLOCK.get()));

    public static final RegistryObject<Item> OLIVE_BLOCK_ITEM = ITEMS.register("olive_block",
            () -> new BlockItemBase(MorefoodBlocks.OLIVE_BLOCK.get()));

    public static final RegistryObject<Item> ORANGE_BLOCK_ITEM = ITEMS.register("orange_block",
            () -> new BlockItemBase(MorefoodBlocks.ORANGE_BLOCK.get()));

    public static final RegistryObject<Item> PLUM_BLOCK_ITEM = ITEMS.register("plum_block",
            () -> new BlockItemBase(MorefoodBlocks.PLUM_BLOCK.get()));

    public static final RegistryObject<Item> POTATO_BLOCK_ITEM = ITEMS.register("potato_block",
            () -> new BlockItemBase(MorefoodBlocks.POTATO_BLOCK.get()));

    public static final RegistryObject<Item> RASPBERRY_BLOCK_ITEM = ITEMS.register("raspberry_block",
            () -> new BlockItemBase(MorefoodBlocks.RASPBERRY_BLOCK.get()));

    public static final RegistryObject<Item> RAW_BEEF_BLOCK_ITEM = ITEMS.register("raw_beef_block",
            () -> new BlockItemBase(MorefoodBlocks.RAW_BEEF_BLOCK.get()));

    public static final RegistryObject<Item> RAW_CHICKEN_BLOCK_ITEM = ITEMS.register("raw_chicken_block",
            () -> new BlockItemBase(MorefoodBlocks.RAW_CHICKEN_BLOCK.get()));

    public static final RegistryObject<Item> RAW_MUTTON_BLOCK_ITEM = ITEMS.register("raw_mutton_block",
            () -> new BlockItemBase(MorefoodBlocks.RAW_MUTTON_BLOCK.get()));

    public static final RegistryObject<Item> RAW_RABBIT_BLOCK_ITEM = ITEMS.register("raw_rabbit_block",
            () -> new BlockItemBase(MorefoodBlocks.RAW_RABBIT_BLOCK.get()));

    public static final RegistryObject<Item> RAW_SQUID_BLOCK_ITEM = ITEMS.register("raw_squid_block",
            () -> new BlockItemBase(MorefoodBlocks.RAW_SQUID_BLOCK.get()));

    public static final RegistryObject<Item> STRAWBERRY_BLOCK_ITEM = ITEMS.register("strawberry_block",
            () -> new BlockItemBase(MorefoodBlocks.STRAWBERRY_BLOCK.get()));

    public static final RegistryObject<Item> TOMATO_BLOCK_ITEM = ITEMS.register("tomato_block",
            () -> new BlockItemBase(MorefoodBlocks.TOMATO_BLOCK.get()));

    public static final RegistryObject<Item> WHITE_CHOCOLATE_BLOCK_ITEM = ITEMS.register("white_chocolate_block",
            () -> new BlockItemBase(MorefoodBlocks.WHITE_CHOCOLATE_BLOCK.get()));

    public static final RegistryObject<Item> CHOCOLATE_CAKE_ITEM = ITEMS.register("chocolate_cake",
            () -> new BlockItemBase(MorefoodBlocks.CHOCOLATE_CAKE.get()));

    public static final RegistryObject<Item> RAINBOW_CAKE_ITEM = ITEMS.register("rainbow_cake",
            () -> new BlockItemBase(MorefoodBlocks.RAINBOW_CAKE.get()));

    public static final RegistryObject<Item> REDWHITEBLUE_CAKE_ITEM = ITEMS.register("redwhiteblue_cake",
            () -> new BlockItemBase(MorefoodBlocks.REDWHITEBLUE_CAKE.get()));


    public static final RegistryObject<Item> STOVE_ITEM = ITEMS.register("stove",
            () -> new BlockItemBase(MorefoodBlocks.STOVE.get()));

    // Foods
    public static final RegistryObject<Item> COCONUT = ITEMS.register("coconut", ItemBase::new);

    public static final RegistryObject<CreativeHunger> CREATIVE_HUNGER = ITEMS.register("creative_hunger", CreativeHunger::new);
    public static final RegistryObject<Hamburger> HAMBURGER = ITEMS.register("hamburger", Hamburger::new);
    public static final RegistryObject<Veganburger> VEGANBURGER = ITEMS.register("veganburger", Veganburger::new);
    public static final RegistryObject<JellySandwich> JELLY_SANDWICH = ITEMS.register("jelly_sandwich", JellySandwich::new);
    public static final RegistryObject<RoundCheese> ROUND_CHEESE = ITEMS.register("round_cheese", RoundCheese::new);
    public static final RegistryObject<GoldenApple> BACON_EGG_MUFFIN = ITEMS.register("bacon_egg_muffin", GoldenApple::new);
    public static final RegistryObject<NetheriteApple> NETHERITE_APPLE = ITEMS.register("netherite_apple", NetheriteApple::new);

    public static final RegistryObject<Apple> ORANGE = ITEMS.register("orange", Apple::new);
    public static final RegistryObject<Apple> GRAPE = ITEMS.register("grape", Apple::new);
    public static final RegistryObject<Apple> TOMATO = ITEMS.register("tomato", Apple::new);
    public static final RegistryObject<Apple> BANANA = ITEMS.register("banana", Apple::new);
    public static final RegistryObject<Apple> LEMON = ITEMS.register("lemon", Apple::new);
    public static final RegistryObject<Apple> STRAWBERRY = ITEMS.register("strawberry", Apple::new);
    public static final RegistryObject<Apple> TEA_LEAVES = ITEMS.register("tea_leaves", Apple::new);
    public static final RegistryObject<Apple> PLUM = ITEMS.register("plum", Apple::new);
    public static final RegistryObject<Apple> OLIVES = ITEMS.register("olives", Apple::new);
    public static final RegistryObject<Apple> RASPBERRY = ITEMS.register("raspberry", Apple::new);

    public static final RegistryObject<BakedPotato> CUTFRIES = ITEMS.register("cut_fries", BakedPotato::new);
    public static final RegistryObject<BakedPotato> WEDGESPOT = ITEMS.register("wedges_pot", BakedPotato::new);
    public static final RegistryObject<BakedPotato> COOKED_WEDGES = ITEMS.register("cooked_wedges", BakedPotato::new);

    public static final RegistryObject<Beef> RAW_HAMBURGER_PATTY = ITEMS.register("raw_hamburger_patty", Beef::new);
    public static final RegistryObject<Beef> RAW_VEGANBURGER_PATTY = ITEMS.register("raw_veganburger_patty", Beef::new);

    public static final RegistryObject<Beetroot> FRIES = ITEMS.register("fries", Beetroot::new);
    public static final RegistryObject<Beetroot> CORN_ON_COB = ITEMS.register("corn_on_cob", Beetroot::new);
    public static final RegistryObject<Beetroot> DOUGH = ITEMS.register("dough", Beetroot::new);
    public static final RegistryObject<DrinkBeetroot> TOMATO_KETCHUP = ITEMS.register("tomato_ketchup", DrinkBeetroot::new);
    public static final RegistryObject<Beetroot> JAM = ITEMS.register("jam", Beetroot::new);
    public static final RegistryObject<Beetroot> LETTUCE = ITEMS.register("lettuce", Beetroot::new);
    public static final RegistryObject<Beetroot> HOPS = ITEMS.register("hops", Beetroot::new);
    public static final RegistryObject<DrinkBeetroot> VANILLA_EXTRACT = ITEMS.register("vanilla_extract", DrinkBeetroot::new);
    public static final RegistryObject<Beetroot> VANILLA_POD = ITEMS.register("vanilla_pod", Beetroot::new);
    public static final RegistryObject<Beetroot> YEAST = ITEMS.register("yeast", Beetroot::new);
    public static final RegistryObject<Beetroot> TOMATO_PUREE = ITEMS.register("tomato_puree", Beetroot::new);
    public static final RegistryObject<Beetroot> GHERKIN = ITEMS.register("gherkin", Beetroot::new);
    public static final RegistryObject<Beetroot> PEPPER = ITEMS.register("pepper", Beetroot::new);

    public static final RegistryObject<Juice> ORANGE_JUICE = ITEMS.register("orange_juice", Juice::new);
    public static final RegistryObject<Juice> APPLE_JUICE = ITEMS.register("apple_juice", Juice::new);
    public static final RegistryObject<Juice> GRAPE_JUICE = ITEMS.register("grape_juice", Juice::new);
    public static final RegistryObject<Juice> TOMATO_JUICE = ITEMS.register("tomato_juice", Juice::new);
    public static final RegistryObject<Juice> BERRY_JUICE = ITEMS.register("berry_juice", Juice::new);
    public static final RegistryObject<Juice> STRAWBERRY_JUICE = ITEMS.register("strawberry_juice", Juice::new);
    public static final RegistryObject<Juice> MIXED_FRUIT_JUICE = ITEMS.register("mixed_fruit_juice", Juice::new);
    public static final RegistryObject<Juice> MELON_JUICE = ITEMS.register("melon_juice", Juice::new);
    public static final RegistryObject<Juice> LEMON_JUICE = ITEMS.register("lemon_juice", Juice::new);
    public static final RegistryObject<Soda> APPLE_SODA = ITEMS.register("apple_soda", Soda::new);
    public static final RegistryObject<Soda> BERRY_SODA = ITEMS.register("berry_soda", Soda::new);
    public static final RegistryObject<Soda> GRAPE_SODA = ITEMS.register("grape_soda", Soda::new);
    public static final RegistryObject<Soda> LEMON_SODA = ITEMS.register("lemon_soda", Soda::new);
    public static final RegistryObject<Soda> ORANGE_SODA = ITEMS.register("orange_soda", Soda::new);
    public static final RegistryObject<Soda> STRAWBERRY_SODA = ITEMS.register("strawberry_soda", Soda::new);
    public static final RegistryObject<MilkShake> CHOCOLATE_MILKSHAKE = ITEMS.register("chocolate_milkshake", MilkShake::new);
    public static final RegistryObject<MilkShake> STRAWBERRY_MILKSHAKE = ITEMS.register("strawberry_milkshake", MilkShake::new);
    public static final RegistryObject<MilkShake> BANANA_MILKSHAKE = ITEMS.register("banana_milkshake", MilkShake::new);
    public static final RegistryObject<Smoothie> BANANA_SMOOTHIE = ITEMS.register("banana_smoothie", Smoothie::new);
    public static final RegistryObject<Smoothie> BERRY_SMOOTHIE = ITEMS.register("berry_smoothie", Smoothie::new);
    public static final RegistryObject<Smoothie> GRAPE_SMOOTHIE = ITEMS.register("grape_smoothie", Smoothie::new);
    public static final RegistryObject<Smoothie> STRAWBERRY_SMOOTHIE = ITEMS.register("strawberry_smoothie", Smoothie::new);
    public static final RegistryObject<Smoothie> RASPBERRY_SMOOTHIE = ITEMS.register("raspberry_smoothie", Smoothie::new);
    public static final RegistryObject<Smoothie> MIXED_FRUIT_SMOOTHIE = ITEMS.register("mixed_fruit_smoothie", Smoothie::new);
    public static final RegistryObject<Icecrush> APPLE_ICECRUSH = ITEMS.register("apple_icecrush", Icecrush::new);
    public static final RegistryObject<Icecrush> BERRY_ICECRUSH = ITEMS.register("berry_icecrush", Icecrush::new);
    public static final RegistryObject<Icecrush> GRAPE_ICECRUSH = ITEMS.register("grape_icecrush", Icecrush::new);
    public static final RegistryObject<Icecrush> LEMON_ICECRUSH = ITEMS.register("lemon_icecrush", Icecrush::new);
    public static final RegistryObject<Icecrush> MELON_ICERUSH = ITEMS.register("melon_icecrush", Icecrush::new);
    public static final RegistryObject<Icecrush> MIXED_FRUIT_ICECRUSH = ITEMS.register("mixed_fruit_icecrush", Icecrush::new);
    public static final RegistryObject<Icecrush> ORANGE_ICERUSH = ITEMS.register("orange_icecrush", Icecrush::new);
    public static final RegistryObject<Icecrush> STRAWBERRY_ICECRUSH = ITEMS.register("strawberry_icecrush", Icecrush::new);
    public static final RegistryObject<Icecrush> APPLE_RASPBERRY_ICERUSH = ITEMS.register("apple_raspberry_icecrush", Icecrush::new);
    public static final RegistryObject<Coffee> AMERICANO = ITEMS.register("americano", Coffee::new);
    public static final RegistryObject<Coffee> CAPPUCCINO = ITEMS.register("cappuccino", Coffee::new);
    public static final RegistryObject<Coffee> MACCHIATO = ITEMS.register("macchiato", Coffee::new);
    public static final RegistryObject<Coffee> MOCHA = ITEMS.register("mocha", Coffee::new);
    public static final RegistryObject<Coffee> TOFFEE_LATTE = ITEMS.register("toffee_latte", Coffee::new);
    public static final RegistryObject<Coffee> VANILLA_LATTE = ITEMS.register("vanilla_latte", Coffee::new);
    public static final RegistryObject<Coffee> HOT_COFFEE = ITEMS.register("hot_coffee", Coffee::new);
    public static final RegistryObject<Coffee> HOT_TEA = ITEMS.register("hot_tea", Coffee::new);
    public static final RegistryObject<Coffee> HOT_COCOA = ITEMS.register("hot_cocoa", Coffee::new);
    public static final RegistryObject<Cereal> CEREAL = ITEMS.register("cereal", Cereal::new);
    public static final RegistryObject<CoconutMilk> COCONUT_MILK = ITEMS.register("coconut_milk", CoconutMilk::new);
    public static final RegistryObject<SparklingWaterBottle> SPARKLING_WATER_BOTTLE = ITEMS.register("sparkling_water_bottle", SparklingWaterBottle::new);

    public static final RegistryObject<Bread> TOAST = ITEMS.register("toast", Bread::new);
    public static final RegistryObject<Bread> SUB_BUN = ITEMS.register("sub_bun", Bread::new);
    public static final RegistryObject<Bread> CUT_BREAD = ITEMS.register("cut_bread", Bread::new);
    public static final RegistryObject<Bread> HOTDOG_BUN = ITEMS.register("hotdog_bun", Bread::new);
    public static final RegistryObject<Bread> TORTILLA = ITEMS.register("tortilla", Bread::new);
    public static final RegistryObject<Bread> MUFFIN_BUN = ITEMS.register("muffin_bun", Bread::new);
    public static final RegistryObject<Bread> BURGER_BUN = ITEMS.register("burger_bun", Bread::new);
    public static final RegistryObject<Bread> PITTA_BREAD = ITEMS.register("pitta_bread", Bread::new);
    public static final RegistryObject<Bread> PIZZA_BASE = ITEMS.register("pizza_base", Bread::new);
    public static final RegistryObject<Bread> BREAD_LOAF = ITEMS.register("bread_loaf", Bread::new);

    public static final RegistryObject<Chicken> BAT_MEAT = ITEMS.register("bat_meat", Chicken::new);

    public static final RegistryObject<Cod> RAW_SQUID = ITEMS.register("raw_squid", Cod::new);

    public static final RegistryObject<CookedBeef> HAMBURGER_PATTY = ITEMS.register("hamburger_patty", CookedBeef::new);
    public static final RegistryObject<CookedBeef> VEGANBURGER_PATTY = ITEMS.register("veganburger_patty", CookedBeef::new);

    public static final RegistryObject<CookedChicken> CHICKEN_SELECT = ITEMS.register("chicken_select", ChickenSelect::new);
    public static final RegistryObject<CookedChicken> COOKED_BAT = ITEMS.register("cooked_bat", CookedChicken::new);
    public static final RegistryObject<CookedChicken> COOKED_CHICKEN_PIECE = ITEMS.register("cooked_chicken_piece", CookedChicken::new);


    public static final RegistryObject<CookedCod> TOFFEE = ITEMS.register("toffee", CookedCod::new);
    public static final RegistryObject<CookedCod> FRIED_SQUID = ITEMS.register("fried_squid", CookedCod::new);
    public static final RegistryObject<CookedCod> SUSHI = ITEMS.register("sushi", CookedCod::new);
    public static final RegistryObject<CookedCod> ONIGIRI = ITEMS.register("onigiri", CookedCod::new);
    public static final RegistryObject<CookedCod> SASHIMI = ITEMS.register("sashimi", CookedCod::new);

    public static final RegistryObject<CookedPorkchop> COOKED_BACON = ITEMS.register("cooked_bacon", CookedPorkchop::new);
    public static final RegistryObject<CookedPorkchop> BEEF_SUB = ITEMS.register("beef_sub", CookedPorkchop::new);
    public static final RegistryObject<CookedPorkchop> COOKED_HOTDOG_SAUSAGE = ITEMS.register("cooked_hotdog_sausage", CookedPorkchop::new);
    public static final RegistryObject<CookedPorkchop> CHICKEN_SUB = ITEMS.register("chicken_sub", CookedPorkchop::new);
    public static final RegistryObject<CookedPorkchop> COOKED_SAUSAGE = ITEMS.register("cooked_sausage", CookedPorkchop::new);
    public static final RegistryObject<CookedPorkchop> COOKED_HOGLIN_MEAT = ITEMS.register("cooked_hoglin_meat", CookedPorkchop::new);

    public static final RegistryObject<CookedSalmon> CHEESE_WEDGE = ITEMS.register("cheese_wedge", CookedSalmon::new);

    public static final RegistryObject<Cookie> MILK_CHOCOLATE = ITEMS.register("milk_chocolate", Cookie::new);
    public static final RegistryObject<Cookie> WHITE_CHOCOLATE = ITEMS.register("white_chocolate", Cookie::new);
    public static final RegistryObject<Cookie> DARK_CHOCOLATE = ITEMS.register("dark_chocolate", Cookie::new);
    public static final RegistryObject<Cookie> ICECREAM_CONE = ITEMS.register("icecream_cone", Cookie::new);
    public static final RegistryObject<Cookie> STRAWBERRY_JELLY = ITEMS.register("strawberry_jelly", Jelly::new);
    public static final RegistryObject<Cookie> TURKISH_DELIGHT = ITEMS.register("turkish_delight", Cookie::new);
    public static final RegistryObject<Cookie> BANANA_ICECREAM = ITEMS.register("banana_icecream", Cookie::new);
    public static final RegistryObject<Cookie> CHOCOLATE_ICECREAM = ITEMS.register("chocolate_icecream", Cookie::new);
    public static final RegistryObject<Cookie> STRAWBERRY_ICECREAM = ITEMS.register("strawberry_icecream", Cookie::new);
    public static final RegistryObject<Cookie> CHOCOLATE_DONUT = ITEMS.register("chocolate_donut", Cookie::new);
    public static final RegistryObject<Cookie> COFFEE_DONUT = ITEMS.register("coffee_donut", Cookie::new);
    public static final RegistryObject<Cookie> ICED_DONUT = ITEMS.register("iced_donut", Cookie::new);
    public static final RegistryObject<Cookie> PINK_ICE_DONUT = ITEMS.register("pink_ice_donut", Cookie::new);
    public static final RegistryObject<Cookie> PLAIN_DONUT = ITEMS.register("plain_donut", Cookie::new);
    public static final RegistryObject<Cookie> STRAWBERRY_DONUT = ITEMS.register("strawberry_donut", Cookie::new);
    public static final RegistryObject<Cookie> PINK_CUPCAKE = ITEMS.register("pink_cupcake", Cookie::new);
    public static final RegistryObject<Cookie> BLUE_CUPCAKE = ITEMS.register("blue_cupcake", Cookie::new);
    public static final RegistryObject<Cookie> TOFFEE_ICECREAM = ITEMS.register("toffee_icecream", Cookie::new);
    public static final RegistryObject<Cookie> VANILLA_ICECREAM = ITEMS.register("vanilla_icecream", Cookie::new);
    public static final RegistryObject<Cookie> WAFFLE = ITEMS.register("waffle", Cookie::new);
    public static final RegistryObject<Cookie> TOFFEE_DONUT = ITEMS.register("toffee_donut", Cookie::new);
    public static final RegistryObject<Jelly> ORANGE_JELLY = ITEMS.register("orange_jelly", Jelly::new);
    public static final RegistryObject<Cookie> PANCAKES = ITEMS.register("pancakes", Cookie::new);
    public static final RegistryObject<Cookie> NETHER_COOKIE = ITEMS.register("nether_cookie", Cookie::new);

    public static final RegistryObject<DriedKelp> PICKLES = ITEMS.register("pickles", DriedKelp::new);
    public static final RegistryObject<DriedKelp> POPCORN = ITEMS.register("popcorn", DriedKelp::new);
    public static final RegistryObject<WarpedBerries> WARPED_BERRIES = ITEMS.register("warped_berries", WarpedBerries::new);
    public static final RegistryObject<DriedKelp> CHICKEN_NUGGET = ITEMS.register("chicken_nugget", DriedKelp::new);
    public static final RegistryObject<DriedKelp> COOKED_CHICKEN_NUGGET = ITEMS.register("cooked_chicken_nugget", DriedKelp::new);

    public static final RegistryObject<GoldenCarrot> PIZZA_SLICE = ITEMS.register("pizza_slice", GoldenCarrot::new);
    public static final RegistryObject<GoldenCarrot> PIZZA = ITEMS.register("pizza", GoldenCarrot::new);
    public static final RegistryObject<GoldenCarrot> HOTDOG = ITEMS.register("hotdog", GoldenCarrot::new);
    public static final RegistryObject<GoldenCarrot> POPCORN_BUCKET = ITEMS.register("popcorn_bucket", PopcornBucket::new);
    public static final RegistryObject<GoldenCarrot> TACO = ITEMS.register("taco", GoldenCarrot::new);
    public static final RegistryObject<GoldenCarrot> CHICKEN_FAJITA = ITEMS.register("chicken_fajita", GoldenCarrot::new);
    public static final RegistryObject<GoldenCarrot> BURRITO = ITEMS.register("burrito", GoldenCarrot::new);
    public static final RegistryObject<GoldenCarrot> KEBAB = ITEMS.register("kebab", GoldenCarrot::new);
    public static final RegistryObject<GoldenCarrot> BACON_EGG_SANDWICH = ITEMS.register("bacon_egg_sandwich", GoldenCarrot::new);
    public static final RegistryObject<GoldenCarrot> BREAKFAST_SUB = ITEMS.register("breakfast_sub", GoldenCarrot::new);
    public static final RegistryObject<GoldenCarrot> SAUSAGE_EGG_MUFFIN = ITEMS.register("sausage_egg_muffin", GoldenCarrot::new);
    public static final RegistryObject<GoldenCarrot> SAUSAGE_EGG_SANDWICH = ITEMS.register("sausage_egg_sandwich", GoldenCarrot::new);

    public static final RegistryObject<MelonSlice> FRIED_EGG = ITEMS.register("fried_egg", MelonSlice::new);
    public static final RegistryObject<MelonSlice> CHEESE_TOASTIE = ITEMS.register("cheese_toastie", MelonSlice::new);
    public static final RegistryObject<MelonSlice> BUTTER = ITEMS.register("butter", MelonSlice::new);
    public static final RegistryObject<ShroomLight> SHROOMLIGHT_SLICES = ITEMS.register("shroomlight_slices", ShroomLight::new);

    public static final RegistryObject<DrinkMilkBucket> MILK_CARTON = ITEMS.register("milk_carton", DrinkMilkBucket::new);
    public static final RegistryObject<DrinkMilkBucket> CREAM_CARTON = ITEMS.register("cream_carton", DrinkMilkBucket::new);

    public static final RegistryObject<MushroomStew> NETHERWART_CHICKEN_SOUP = ITEMS.register("netherwart_chicken_soup", MushroomStew::new);
    public static final RegistryObject<MushroomStew> NETHERWART_MUSHROOM_SOUP = ITEMS.register("netherwart_mushroom_soup", MushroomStew::new);

    public static final RegistryObject<Porkchop> BACON = ITEMS.register("bacon", Porkchop::new);
    public static final RegistryObject<Porkchop> HOTDOG_SAUSAGE = ITEMS.register("hotdog_sausage", Porkchop::new);
    public static final RegistryObject<Porkchop> RAW_SAUSAGE = ITEMS.register("raw_sausage", Porkchop::new);
    public static final RegistryObject<Porkchop> HOGLIN_MEAT = ITEMS.register("hoglin_meat", Porkchop::new);

    public static final RegistryObject<Potato> RAW_WEDGES = ITEMS.register("raw_wedges", Potato::new);
    public static final RegistryObject<Potato> ONION = ITEMS.register("onion", Potato::new);
    public static final RegistryObject<Potato> COCONUT_MEAT = ITEMS.register("coconut_meat", Potato::new);

    public static final RegistryObject<Cider> CIDER = ITEMS.register("cider", Cider::new);
    public static final RegistryObject<Wine> RED_WINE = ITEMS.register("red_wine", Wine::new);
    public static final RegistryObject<Wine> WHITE_WINE = ITEMS.register("white_wine", Wine::new);
    public static final RegistryObject<Beer> BEER = ITEMS.register("beer", Beer::new);

    public static final RegistryObject<PumpkinPie> APPLE_PIE = ITEMS.register("apple_pie", PumpkinPie::new);
    public static final RegistryObject<PumpkinPie> CHEESE_PIE = ITEMS.register("cheese_pie", PumpkinPie::new);
    public static final RegistryObject<PumpkinPie> CHICKEN_PIE = ITEMS.register("chicken_pie", PumpkinPie::new);
    public static final RegistryObject<PumpkinPie> CHOCOLATE_PIE = ITEMS.register("chocolate_pie", PumpkinPie::new);
    public static final RegistryObject<PumpkinPie> LEMON_PIE = ITEMS.register("lemon_pie", PumpkinPie::new);
    public static final RegistryObject<PumpkinPie> PIE_BASE = ITEMS.register("pie_base", PumpkinPie::new);
    public static final RegistryObject<PumpkinPie> PORK_PIE = ITEMS.register("pork_pie", PumpkinPie::new);
    public static final RegistryObject<PumpkinPie> STEAK_PIE = ITEMS.register("steak_pie", PumpkinPie::new);
    public static final RegistryObject<PumpkinPie> STRAWBERRY_PIE = ITEMS.register("strawberry_pie", PumpkinPie::new);
    public static final RegistryObject<PumpkinPie> PLUM_PIE = ITEMS.register("plum_pie", PumpkinPie::new);
    public static final RegistryObject<PumpkinPie> TOFFEE_PIE = ITEMS.register("toffee_pie", PumpkinPie::new);
    public static final RegistryObject<PumpkinPie> BERRY_PIE = ITEMS.register("berry_pie", PumpkinPie::new);
    public static final RegistryObject<PumpkinPie> APPLE_RASPBERRY_PIE = ITEMS.register("apple_raspberry_pie", PumpkinPie::new);
    public static final RegistryObject<PumpkinPie> WART_PIE = ITEMS.register("wart_pie", PumpkinPie::new);

    public static final RegistryObject<RabbitStew> SPAGHETTI = ITEMS.register("spaghetti", RabbitStew::new);
    public static final RegistryObject<RabbitStew> ICE_BOWL = ITEMS.register("ice_bowl", RabbitStew::new);
    public static final RegistryObject<RabbitStew> RAMEN_NOODLES = ITEMS.register("ramen_noodles", RabbitStew::new);
    public static final RegistryObject<RabbitStew> CUSTARD = ITEMS.register("custard", RabbitStew::new);
    public static final RegistryObject<RabbitStew> RICE_PUDDING = ITEMS.register("rice_pudding", RabbitStew::new);

    public static final RegistryObject<RottenPorkchop> ROTTEN_PORKCHOP = ITEMS.register("rotten_porkchop", RottenPorkchop::new);

    public static final RegistryObject<SuspiciousStew> FUNGUS_STEW = ITEMS.register("fungus_stew", SuspiciousStew::new);

    // Fluid Buckets
    public static final RegistryObject<CheeseBucket> CHEESE_BUCKET = ITEMS.register("cheese_bucket", CheeseBucket::new);
    public static final RegistryObject<SparklingWaterBucket> SPARKLING_WATER_BUCKET = ITEMS.register("sparkling_water_bucket", SparklingWaterBucket::new);

    // Items
    public static final RegistryObject<Item> CORNFLOUR = ITEMS.register("cornflour", ItemBase::new);
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", ItemBase::new);
    public static final RegistryObject<Item> GELATIN = ITEMS.register("gelatin", ItemBase::new);
    public static final RegistryObject<Item> NOODLES = ITEMS.register("noodles", ItemBase::new);
    public static final RegistryObject<Item> OIL = ITEMS.register("oil", ItemBase::new);
    public static final RegistryObject<Item> PASTA = ITEMS.register("pasta", ItemBase::new);
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", ItemBase::new);
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", ItemBase::new);

    public static final RegistryObject<Item> BEER_GLASS = ITEMS.register("beer_glass", ItemBase::new);
    public static final RegistryObject<Item> BEVERAGE_CUP = ITEMS.register("beverage_cup", ItemBase::new);
    public static final RegistryObject<Item> BOTTLE = ITEMS.register("bottle", ItemBase::new);
    public static final RegistryObject<Item> BOTTLED_BEER = ITEMS.register("bottled_beer", ItemBase::new);
    public static final RegistryObject<Item> BOTTLED_CIDER = ITEMS.register("bottled_cider", ItemBase::new);
    public static final RegistryObject<Item> BOTTLED_RED_WINE = ITEMS.register("bottled_red_wine", ItemBase::new);
    public static final RegistryObject<Item> BOTTLED_WHITE_WINE = ITEMS.register("bottled_white_wine", ItemBase::new);
    public static final RegistryObject<Item> CARTON = ITEMS.register("carton", ItemBase::new);
    public static final RegistryObject<Item> CHICKEN_SELECT_BOX = ITEMS.register("chicken_select_box", ItemBase::new);
    public static final RegistryObject<Item> EMPTY_ICECRUSH_GLASS = ITEMS.register("empty_icecrush_glass", ItemBase::new);
    public static final RegistryObject<Item> EMPTY_POPCORN_BUCKET = ITEMS.register("empty_popcorn_bucket", ItemBase::new);
    public static final RegistryObject<Item> EMPTY_TUMBLER_GLASS = ITEMS.register("empty_tumbler_glass", ItemBase::new);
    public static final RegistryObject<Item> EMPTY_WEDGES_POT = ITEMS.register("empty_wedges_pot", ItemBase::new);
    public static final RegistryObject<Item> FRY_WRAPPER = ITEMS.register("fry_wrapper", ItemBase::new);
    public static final RegistryObject<Item> HOT_BEVERAGE_CUP = ITEMS.register("hot_beverage_cup", ItemBase::new);
    public static final RegistryObject<Item> ICING = ITEMS.register("icing", ItemBase::new);
    public static final RegistryObject<Item> JAR = ITEMS.register("jar", ItemBase::new);
    public static final RegistryObject<Item> SODA_CAN_EMPTY = ITEMS.register("soda_can_empty", ItemBase::new);
    public static final RegistryObject<Item> STARCH = ITEMS.register("starch", ItemBase::new);
    public static final RegistryObject<Item> WINE_GLASS = ITEMS.register("wine_glass", ItemBase::new);
    public static final RegistryObject<Item> SUB_WRAPPER = ITEMS.register("sub_wrapper", ItemBase::new);

    // Tools
    public static final RegistryObject<KnifeItem> WOODEN_KNIFE = ITEMS.register("wooden_knife",
            () -> new KnifeItem(ItemTier.WOOD, 2, 0, new Item.Properties().group(MoreFood.TAB)));

    public static final RegistryObject<KnifeItem> STONE_KNIFE = ITEMS.register("stone_knife",
            () -> new KnifeItem(ItemTier.STONE, 2, 0, new Item.Properties().group(MoreFood.TAB)));

    public static final RegistryObject<KnifeItem> IRON_KNIFE = ITEMS.register("iron_knife",
            () -> new KnifeItem(ItemTier.IRON, 2, 0, new Item.Properties().group(MoreFood.TAB)));

    public static final RegistryObject<KnifeItem> GOLDEN_KNIFE = ITEMS.register("golden_knife",
            () -> new KnifeItem(ItemTier.GOLD, 2, 0, new Item.Properties().group(MoreFood.TAB)));

    public static final RegistryObject<KnifeItem> DIAMOND_KNIFE = ITEMS.register("diamond_knife",
            () -> new KnifeItem(ItemTier.DIAMOND, 2, 0, new Item.Properties().group(MoreFood.TAB)));

    public static final RegistryObject<KnifeItem> NETHERITE_KNIFE = ITEMS.register("netherite_knife",
            () -> new KnifeItem(ItemTier.NETHERITE, 2, 0, new Item.Properties().group(MoreFood.TAB)));

    public static final RegistryObject<SpoonItem> WOODEN_SPOON = ITEMS.register("wooden_spoon",
            () -> new SpoonItem(ItemTier.WOOD, 0, -3, new Item.Properties().group(MoreFood.TAB)));
}