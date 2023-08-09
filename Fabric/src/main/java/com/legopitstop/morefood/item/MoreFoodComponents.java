package com.legopitstop.morefood.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class MoreFoodComponents {
    // CUSTOM
    public static final FoodComponent CREATIVE_HUNGER = new FoodComponent.Builder().alwaysEdible().hunger(0).saturationModifier(0.0F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 40, 1000), 1.0F).build();

    // APPLE 4 0.3F
    public static final FoodComponent ORANGE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent GRAPE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent BANANA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent LEMON = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent TEA_LEAVES = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent PLUM = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent OLIVES = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent RASPBERRY = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent OIL = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent MILK_CARTON = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent CREAM_CARTON = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent CHOCOLATE_COVERED = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent CRANBERRIES = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent DRIED_CRANBERRIES = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent DRIED_RAISENS = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent EGGPLANT = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent GARLIC = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent POISON_BERRIES = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();

    // BAKED_POTATO 5 0.6F
    public static final FoodComponent CUT_FRIES = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent WEDGES_POT = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent COOKED_WEDGES = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent BEVERAGE = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();

    // BEEF 3 0.3F
    public static final FoodComponent HAMBURGER_PATTY = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).meat().build();
    public static final FoodComponent VEGANBURGER_PATTY = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).meat().build();
    
    // BEETROOT 1 0.6F
    public static final FoodComponent FRIES = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent CORN_COB = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent DOUGH = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent KETCHUP = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent LETTUCE = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent HOPS = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent VANILLA_EXTRACT = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent YEAST = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent TOMATO_PUREE = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent GHERKIN = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent PEPPER = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent BEANS = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent CUT_SWEET_POTATO = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent SWEET_POTATO = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();
    public static final FoodComponent PEPPERMINT_EXTRACT = new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build();

    // BEETROOT_SOUP 6 0.6F
    public static final FoodComponent JUICE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent SODA = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent MILKSHAKE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent SMOOTHIE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent ICECRUSH = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent HOT_BEVERAGE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent COCONUT_MILK = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent CEREAL = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent BREADSTICKS = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent APPLESAUCE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent BAKED_SWEET_POTATO = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent CHOCOLATE_BANANA_MUFFIN = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent MAPLE_MUFFIN = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent MARSHMALLOW = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent OATMEAL_COOKIE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent PEPPERMINT_RING = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent ALMONDS = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent AVOCADO = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent BLUEBERRIES = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent CABBAGE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent PEANUT = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent PRETZEL = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent PRETZEL_NUGGETS = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent PRETZEL_STICKS = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent ROASTED_PEANUT = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent SMOKED_ALMONDS = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent SPINACH = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent TORTILLA_CHIPS = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent TRAIL_MIX = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent BEEF_GOULASH = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent BEEF_RAVIOLI = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent BEEF_STEW = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent SPINACH_FETTUCCINE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent SWEET_MASHED_POTATOES = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent CHEESE_TORTELLINI = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent CHICKEN_SOUP = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent CHILI = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent PUDDING = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent GARLIC_MASHED_POTATOES = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent GUACAMOLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent HASH_BROWNS = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent MASHED_POTATOES = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent OATMEAL = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent ONION_RINGS = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent SYRUP = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent MARSHMALLOW_ON_A_STICK = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent CANDY_CORN_BOWL = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    
    // BREAD 5 0.6F
    public static final FoodComponent TOAST = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent SUB_BUN = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent CUT_BREAD = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent HOT_DOG_BUN = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent TORTILLA = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent MUFFIN_BUN = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent BURGER_BUN = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent PITTA_BREAD = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent PIZZA_BASE = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent BREAD_LOAF = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent CRACKERS = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent CORNBREAD = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();

    // CARROT 3 0.6F
    // CHICKEN 2 0.3F
    public static final FoodComponent BAT_MEAT = new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F).meat().build();

    // CHORUS_FRUIT 4 0.3F
    // COD 2 0.1F
    public static final FoodComponent SQUID = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();

    // COOKED_BEEF 8 0.8F
    public static final FoodComponent COOKED_HAMBURGER_PATTY = new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).meat().build();
    public static final FoodComponent COOKED_VEGANBURGER_PATTY = new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).meat().build();

    // COOKED_CHICKEN 6 0.6F
    public static final FoodComponent CHICKEN_SELECT = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).meat().build();
    public static final FoodComponent COOKED_BAT_MEAT = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).meat().build();
    public static final FoodComponent COOKED_CHICKEN_PIECE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).meat().build();

    // COOKED_COD 5 0.6F
    public static final FoodComponent TOFFEE = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent FRIED_SQUID = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent SUSHI = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent ONIGIRI = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent SASHIMI = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();


    // COOKED_MUTTON 6 0.8F
    // COOKED_PORKCHOP 8 0.8F 
    public static final FoodComponent COOKED_BACON = new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).meat().build();
    public static final FoodComponent SUB = new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).meat().build();
    public static final FoodComponent COOKED_HOT_DOG_SAUSAGE = new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).meat().build();
    public static final FoodComponent COOKED_SAUSAGE = new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).meat().build();
    public static final FoodComponent COOKED_HOGLIN_MEAT = new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).meat().build();

    // COOKED_RABBIT 5 0.6F
    // COOKED_SALMON 6 0.8F
    public static final FoodComponent CHEESE_WEDGE = new FoodComponent.Builder().hunger(6).saturationModifier(0.8F).build();

    // COOKIE 2 0.1F
    public static final FoodComponent CHOCOLATE_BAR = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent ICE_CREAM_CONE = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent JELLY = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent TURKISH_DELIGHT = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent ICE_CREAM = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent DONUT = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent CUPCAKE = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent WAFFLE = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent PANCAKES = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent NETHER_COOKIE = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent CHOCOLATE_CHUNK_OATMEAL_COOKIE = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent PEANUT_BUTTER_JELLY_SANDWICH = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent OATS = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent ROASTED_SOYBEANS = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent SUGAR_COOKIE = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent PEPPERMINT = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent CANDY = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent CANDY_CORN = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent COOKED_PUMPKIN_SEEDS = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();
    public static final FoodComponent GHAST_COOKIE = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build();

    // DRIED_KELP 1 0.3F
    public static final FoodComponent PICKLES = new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).snack().build();
    public static final FoodComponent POPCORN = new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).snack().build();
    public static final FoodComponent WARPED_BERRIES = new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).snack().build();
    public static final FoodComponent CHICKEN_NUGGET = new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).snack().build();
    public static final FoodComponent COOKED_CHICKEN_NUGGET = new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).snack().build();
    public static final FoodComponent ROASTED_SUNFLOWER_SEEDS = new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).snack().build();

    // ENCHANTED_GOLDEN_APPLE 4 1.2F
    // GOLDEN_APPLE 4 1.2F
    public static final FoodComponent HAMBURGER = new FoodComponent.Builder().hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F).build();
    public static final FoodComponent VEGANBURGER = new FoodComponent.Builder().hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F).build();
    public static final FoodComponent JELLY_SANDWICH = new FoodComponent.Builder().hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F).build();
    public static final FoodComponent ROUND_CHEESE = new FoodComponent.Builder().hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F).build();
    public static final FoodComponent BACON_EGG_MUFFIN = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F).build();
    public static final FoodComponent NETHERITE_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F).build();
    public static final FoodComponent PORK_SAUSAGE_BURGER = new FoodComponent.Builder().hunger(4).saturationModifier(1.2F).build();
    public static final FoodComponent PULLED_BEEF_BURGER = new FoodComponent.Builder().hunger(4).saturationModifier(1.2F).build();
    public static final FoodComponent TUNA_SANDWICH = new FoodComponent.Builder().hunger(4).saturationModifier(1.2F).build();
    public static final FoodComponent GLOWBERRY_JELLY_SANDWICH = new FoodComponent.Builder().hunger(4).saturationModifier(1.2F).build();
    
    // GOLDEN_CARROT 6 1.2F
    public static final FoodComponent RICE = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();
    public static final FoodComponent PIZZA_SLICE = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();
    public static final FoodComponent PIZZA = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();
    public static final FoodComponent HOT_DOG = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();
    public static final FoodComponent POPCORN_BUCKET = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();
    public static final FoodComponent TACO = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();
    public static final FoodComponent CHICKEN_FAJITA = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();
    public static final FoodComponent BURRITO = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();
    public static final FoodComponent KEBAB = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();
    public static final FoodComponent BACON_EGG_SANDWICH = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();
    public static final FoodComponent BREAKFAST_SUB = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();
    public static final FoodComponent SAUSAGE_EGG_MUFFIN = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();
    public static final FoodComponent SAUSAGE_EGG_SANDWICH = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();

    // HONEY_BOTTLE 6 0.1F
    // MELON_SLICE 2 0.3F
    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build();
    public static final FoodComponent CHEESE_TOASTIE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build();
    public static final FoodComponent BUTTER = new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build();
    public static final FoodComponent SHROOMLIGHT_SLICES = new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build();
    public static final FoodComponent CHERRIES = new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build();

    // MUSHROOM_STEW 6 0.6F
    public static final FoodComponent NETHERWART_CHICKEN_SOUP = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent NETHERWART_MUSHROOM_SOUP = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent SPARKLING_WATER_BOTTLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();

    // MUTTON 2 0.3F
    // POISONOUS_POTATO 2 0.3F
    public static final FoodComponent POISONOUS_SWEET_POTATO = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0), 0.6F).build();

    // PORKCHOP 3 0.3F
    public static final FoodComponent BACON = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).meat().build();
    public static final FoodComponent HOT_DOG_SAUSAGE = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).meat().build();
    public static final FoodComponent SAUSAGE = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).meat().build();
    public static final FoodComponent HOGLIN_MEAT = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).meat().build();

    // POTATO 1 0.3F
    public static final FoodComponent WEDGES = new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).build();
    public static final FoodComponent ONION = new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).build();
    public static final FoodComponent COCONUT_MEAT = new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).build();

    // PUFFERFISH 1 0.1F
    public static final FoodComponent CIDER = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1200, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300, 2), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0), 1.0F).build();
    public static final FoodComponent WINE = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1200, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300, 2), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0), 1.0F).build();
    public static final FoodComponent BEER = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1200, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300, 2), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0), 1.0F).build();
    
    // PUMPKIN_PIE 8 0.3F
    public static final FoodComponent PIE = new FoodComponent.Builder().hunger(8).saturationModifier(0.3F).build();

    // RABBIT 3 0.3F
    // RABBIT_STEW 10 0.6F
    public static final FoodComponent SPAGHETTI = new FoodComponent.Builder().hunger(10).saturationModifier(0.6F).build();
    public static final FoodComponent ICE_CREAM_BOWL = new FoodComponent.Builder().hunger(10).saturationModifier(0.6F).build();
    public static final FoodComponent RAMEN_NOODLES = new FoodComponent.Builder().hunger(10).saturationModifier(0.6F).build();
    public static final FoodComponent CUSTARD = new FoodComponent.Builder().hunger(10).saturationModifier(0.6F).build();
    public static final FoodComponent SPAGHETTI_WITH_MEATBALLS = new FoodComponent.Builder().hunger(10).saturationModifier(0.6F).build();

    // ROTTEN_FLESH 4 0.1F
    public static final FoodComponent ROTTEN_PORKCHOP = new FoodComponent.Builder().hunger(4).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.8F).meat().build();

    // SALMON 2 0.1F
    // SPIDER_EYE 2 0.8F
    // SUSPICIOUS_STEW 6 0.6F
    public static final FoodComponent FUNGUS_STEW = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    
    // SWEET_BERRIES 2 0.1F
    // GLOW_BERRIES 2 0.1F
    // TROPICAL_FISH 1 0.1F

}
