# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/), and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.7.0-rc1] (1.6.8) - 1/29/2024
If no issues arise this will be 1.7.0

### General
- Updated for Assets+ 1.6.0
- Reverted shroomlight and warped wart block changes from previous previews.

### Fixes
- #89 Sweet Corn Plants Unknown Blocks
- Poison berries now use the bush placing and breaking sounds
- Picking any hanging crop will give the player a sapling when in creative.
- Fixed cake with cherries having an invisible texture.
- MRE will now use a loot table instead of pre-defined meals.
- Fixed pancake and waffle recipes.
- You can now craft Sweet Corn Sacks using Sweet Corn.

### Added/Changes
- Added Cherry Leaves to Cherries recipe.
- Sweet Corn Crop is now 2 blocks tall.
- Fertile soil will now drop dirt when broken.
- The pancake mix recipe now gives 8 pancake mix.
- You can now get fried eggs from cooking turtle eggs.
- Changed knife recipes to match the new textures. Uses one stick instead of 2 black concrete.
- You can now craft stone knifes using blackstone and cobbled deepslate

## [1.7.0-pre7] (1.6.7) - 12/22/2023

Hello, Hope you all have a great Christmas and New Year! This is the last preview for 1.7.0 which will be released in early 2024 🎆🎆🎆. 

### General
- Added more textures by SuperSonic
  - Noodles
  - Oat Seeds
  - Oatmeal
  - Oatmeal Cookie
  - Olive Sapling
  - Onigiri
- Renamed more item ID's
   - corn -> sweet_corn
   - cut_sweet_fries -> sweet_french_fries
   - corn_flour -> corn_starch
   - milk_carton -> milk_bottle
   - cream_carton -> cream_bottle
- Added Pancake recipe
- Beverage recipes now only accept Water bottles instead of all potions.
- Jam and Glowberry Jam is no longer eatable and can't be stacked

### Items
- Removed Carton
- Added Smoothie Cup

### Recipes
Tweaked recipes: See Wiki for new recipes
* Waffle
* Jelly Sandwich
* Glowberry Jelly Sandwich
* Pasta
* Americano
* Beef Ravioli
* Beef Stew
* Beef Submarine Sandwich
* Bottled Beer
* Bottled White Wine
* Bottled Cider
* Breakfast Submarine Sandwich
* Burrito
* Cappuccino
* Cheese Tortellini
* Chicken Fajita
* Box of Chicken
* Chicken Soup
* Chicken Sub
* Vanilla Pudding
* Chocolate Pudding
* Sweet Corn
* Dark Chocolate
* Milk Chocolate
* White Chocolate
* Dough
* Milk Bottle
* Cream Bottle
* French Fry Pot
* Sweet French Fry Pot
* Ice Crush
* Pie
* Tumbler Glass
* Jar
* Wine Glass
* Beer Mug
* Ice Crush Glass
* Hot Cocoa
* Hot Coffee
* Hot Tea
* Ice Cream
* Macchiato
* Marshmallow
* Milkshake
* Mocha
* Onion Rings
* Jelly
* Pitta Bread
* Pretzel
* Ramen Noodles
* Round Cheese
* Salt
* Sausage Egg Muffin
* Sausage Egg Sandwich
* Toffee Latte
* Vanilla Latte
* Tortilla
* Trail Mix
* Wedges Pot
* Yeast
* Soda


## [1.7.0-pre6] (1.6.6) - 10/31/2023

### Before Updating
- Make sure to create a backup of your world before updating. This update renames some block and item IDs that could be lost.

### General
- Updated for 1.20.40
- Add unlock data to recipes.
- Squids should now only drop one squid item.
- Glow Squids will now drop squid
- Hanging crops can now be placed on mangroves and cherry leaves (won't pop off when updated).
- Wooden Tree Tap can now be placed on mangrove and cherry logs.
- #81 Update block and item IDs.
- Outdated items will show up as dirt with "legacy"

### Fixed
- Fixed a handful of food items that are not using the eating animation.
- World gen is now working and doesn't require "Creation of Custom Biomes"
- #78 Saplings Disappearing
- #72 Chicken Soup doesn't return a bucket.

### Added
- Cherry Sack
- Hanging Cherry
- Missing recipes that are on the Wiki

### Removed
- Sub Wrapper

## [1.7.0-pre5] (1.6.5) - 7-21-2023

### Known Issues
The following are issues with Minecraft that cannot be fixed.
- Diamond knives cannot be placed inside the smithing table to upgrade to netherite.
- The wooden tree tap has shading issues.
- To fill a cauldron using a maple sap bucket you will need to SNEAK + CLICK on the empty cauldron.

### General

- Updated for 1.20.21
- MRE is no longer stackable
- Resrouce and Behavior pack now uses translations and shows the version number.
- Netherite knife now requres a smithing template like all other netherite tools.
- You can now place a cauldron underneath a wooden tree tap and it will fill the cauldron.
- Alhocol bottles now have "uses" instead of percentage.
- Added potted watermint, spearmint and saplings.
- Pick-block should now give you the correct item.
- You can get dye from crops by placing 2 crop items anywhere in the crafting table.
- You can now obtain Shroomlight Slices and Warped Berries by breaking Shroomlight and Warped Wart Blocks. Use silk touch to obtain the block.

### Fixes/Removed
- MRE will now work when you click while holding it.
- Fixed text issues with the behavior, resource pack, and holiday features showing an `A`
- Covered apples now show the eating animation.
- Saplings will now fail to grow trees if a block is directly above the sapling.
- Saplings will now break blocks that are in the way instead of replacing them.
- Removed test "diamond" tree.
- Removed the farmhouse until jigsaws are working [MCPE-155321](https://bugs.mojang.com/browse/MCPE-155321)
- Removed the cherry on the Minecraft cake
- Removed legacy textures toggle from the resource pack
- Wooden Tree Taps can now only be placed on logs and will break when the log has been broken.

### New Items
- Cherries
- Cake with Cherry

## [1.7.0-pre4] (1.6.4) - 4-11-2023

- Updated for 1.19.73
- Requires Experimental Molang
- Uses v1.2.0 of assets plus
- More textures from SuperSonic
- Any blocks that run commands will no longer send feedback in chat.
- Removed legacy blocks.
- Fertile soil now uses the dirt texture for the side.

### Fixed

- #42 Palm Tree Leaves Disappearing
- #39 Wooden Tree Tap Not Working
- #56 Vanilla extract consumes a bottle when used
- #40 Missing or broken recipes
- The wooden spoon should now properly break shovel-like blocks
- The wooden spoon should get damaged when it breaks blocks
- Wooden Tree Tap should now properly give the player a maple sap bucket when collected.
- Fixed large bowl recipe.
- The Macchiato recipe now matches the wiki
- Added eating animation for some items

### Changes

- The wooden tree tap will now only increase its sap level when it is on a 2-log-high tree
- Adjusted after consumed item to better match the texture.
  - Hoglin Meat -> Bone
  - Cooked Hoglin Meat -> Bone
  - Onion Rings -> none
  - Orange & Strawberry Jelly -> none
  - Pasta -> Bowl
  - Peppermint Extract -> Glass Bottle
  - Popcorn Bucket -> Bucket
  - Syrup -> Glass Bottle
  - Ramen Noodles -> Large Bowl
  - Spaghetti -> none
  - Spaghetti w/ Meatballs -> none
  - Spinach Fettuccine -> none
  - Sweet Mashed Potatoes -> none
  - Tomato Puree -> none
  - Sweet Potato Wedges Pot -> Flower Pot
  - Potato Wedges Pot -> Flower Pot

### Removed
- Empty Wedges Pot (uses Flower Pot)
- Empty Popcorn Bucket (uses Bucket)

## [1.7.0-pre3] (1.6.3) - 5-17-2022

Lot's More Food 1.7.0 for 1.18.3 is just around the corner! This update introduces a handful of new items, blocks, structures, recipes, and more for the final few changes before this update is finally released.

- More new textures from SuperSonic.

### **Requirements**

- Assets Plus RP
- Experiments
  - Holiday Creator Features
  - Molang Features
  - Custom Biomes (for custom world generation)

### General

- Updated for 1.18.30
- Removed Soy Milk
- Hanging plants can now be placed on azalea and flowering azalea leaves.
- All Plants now use random tick speed. Increasing the tick speed will make plants grow faster.
- Garlic texture is now used for Garlic Bulb texture
- Changed Garlic texture to look like garlic cloves
- Mature (last stage) crops should now drop 1 crop item, and 1-2 seeds when broken.
- Improved plant stage increment, now uses MoLang instead of lots of event conditions, decreases file size and is more human-readable.
- Peanut Bush is now a crop, click on the "update" block to help it convert, or destroy it to drop one seed.
- Hanging Avocado now has a proper texture.
- All crops, bushes, and hanging plants now have 7 total stages but have the same number of visual stages. Check the wiki for more info
- Lighting a candle cake will now damage it.
- You can now light a candle cake with a fire charge.
- You can place any more food crops on Fertile Soil to prevent them from popping off when re-logging.
- Saplings can now be placed on dirt with roots (Rooted Dirt)
- Removed give functions, You can obtain all items, and blocks through /give or through creative inventory.
- Fixed an issue that when Holiday features are off console will print errors.
- Some hanging plants have updated textures to match their item form.
- MRE will no longer show the contents of the received menu.
- Cheese Spread is now stackable
- Removed custom UI
- Updated pack description.

### Wooden Tree Tap

- Uses `transform_item` event instead of the /give command.
- It will now use random tick speed instead of a set number of ticks to increase the sap level
- Placing a new tree tap will now have a sap level of 0 instead of 5.

### New Items

- Almond Sapling
- Garlic Bulb -> Garlic Crop
- Bean Seeds -> Bean Bush
- Cranberry Seeds -> Cranberry Bush
- Peppermint Seeds -> Peppermint Bush
- Watermint
- Spearmint
- Peppermint Extract
- Pulp
- Glass Shard
- Pretzel
- Fertile Soil

### Generation

- Almond Tree
- Bean Plot
- Cranberry Plot
- Watermint
- Spearmint
- Removed barns

### New Recipes

- Milk Bucket from Soybeans
- Gelatin
- Mashed Potatoes
- Sweet Mashed Potatoes
- Maple Muffin
- Maple Syrup Bucket
- Meal Ready To Eat
- Oatmeal
- Oatmeal Cookie
- Onion Rings
- Pancake Mix
- Peanut Butter Jelly Sandwich
- Pork Sausage Burger
- Pound Cake
- Pretzel Nuggets
- Pretzel Sticks
- Pulled Beef Burger
- Spaghetti With Meatballs
- Spinach Fettuccine
- Sugar Cookie
- Sweet Potato Fries
- Trail Mix
- Tortilla With Cheese
- Tortilla With Jalapeno Cheese
- Tortilla Chips
- Peppermint Ring
- Pretzel
- Glass from Glass Shard
- Glass Shard from Jar
- Glass Shard from Wine Glass
- Glass Shard from Beer Glass
- Glass Shard from Bottle
- Glass Shard from Empty Icecrush Glass
- Glass Shard from Empty Tumbler Glass
- Paper from Pulp
- Iron Nugget from Empty Soda Can
- Pulp from Hot Beverage Cup
- Pulp from Sub Wrapper
- Pulp from Fry Wrapper
- Pulp from Beverage Cup
- Pulp from Carton
- Garlic from Garlic Bulb

### Known Issues

- Tree Tap has a funky-looking texture

### Note

This preview version introduces a world generation that is subject to change. It is recommended to create a backup of your world before adding this add-on to your world.

---

## [1.7.0-pre2] (1.6.2) - 2-10-2022

### General

- Updated for 1.18.10
- Removed emerald knife
- All foods should be eatable
- cornflour is not eatable.
- You can now use the smithing table to upgrade your diamond knife to a netherite knife.

### Fixes

- Crop and tree tap blocks use the updated texture and have no model.
- Certain items have the same textures. [#35](https://github.com/legopitstop/Lots-More-Food-Mods/issues/35)

### Known Issues

- Crops pop off farmland in some cases. This is an issue that is not fixable through add-ons. (Mojang will have to fix it.)
- Tree taps behave and look weird.

---

## [1.7.0-pre1] (1.6.1) - 5-17-2021

### General

- min Minecraft version ( 1.17.30 )
- Blocks will now show up in the creative inventory.
- Added copper knife
- Added texture toggle to a resource pack. Default, The new textures by [SuperSonic](URL). Legacy, textures before v1.6.0. Legacy dev art, Textures that were used when More food was first released to the public.
- You can view all the new items, blocks, and recipes via the new Google Sheet. [View Recipes]( https://docs.google.com/spreadsheets/d/e/2PACX-1vS6vSEl2wLOzFk6hr15sV3QYFTPIUGMFx_Z0Oyeux36ta970iYemqWMpkKJEl8hDKZjtnGLd_nl-g0P/pubhtml)
- Blocks now have tags. ie; all plants have 'non_full' tag. all bushes can be placed on blocks with tags 'grass' and/or 'dirt' etc.
- You can now place candles on cakes.
- Added links to resource and behavior pack's description.
- All plants will now emit growth particles and use the bonemeal sound when bonemeal
- Bushes can now be bonemeal to stage 3 (last stage) without harvesting, You must not be holding bonemeal to harvest.

### New Stuff

#### 1.17 only

- breadsticks with glowberry jam
- crackers with glowberry jam
- cut bread with glowberry jam
- glowberry ice crush
- glowberry pie
- glowberry smoothie
- glowberry soda
- glowberry jam
- glowberry juice
- glowberry jelly sandwich

#### Plants

- avocado tree
- blueberry bush
- poison berry bush
- sweet potatoes, crop 
- buckwheat, crop
- cabbage, crop
- eggplant, crop
- oat, crop
- soybeans, crop
- spinach, crop

#### Items

- applesauce
- baked sweet potato
- beef ravioli
- beef stew
- blueberries
- blueberry seeds (bush)
- blueberry syrup
- buckwheat (crop)
- cabbage seeds (crop)
- chili
- cut sweet potato
- dark chocolate-covered apple
- eggplant
- eggplant seeds (crop)
- garlic
- guacamole
- large bowl
- maple sap bucket
- maple syrup
- maple syrup bucket
- mashed potatoes
- milk chocolate-covered apple
- oat seeds (crop)
- oatmeal
- oatmeal cookie
- oats
- pancake mix
- peanut butter
- peanut butter jelly sandwich
- poison berries (bush)
- poisonous sweet potato
- pulled beef burger
- raspberry syrup
- roasted soybeans
- soy flour
- soy milk
- soy oil
- soybeans (crop)
- spinach seeds (crop)
- strawberry syrup
- sunflower oil
- sweet mashed potatoes
- sweet potato (crop)
- sweet potato fries
- tortilla chips
- white chocolate-covered apple
- almonds
- beef goulash
- breadsticks
- breadsticks with peanut butter
- breadsticks with jam
- cappuccino drink mix
- cheese spread
- cheese tortellini
- chicken soup
- chocolate banana muffin
- chocolate chunk oatmeal cookie
- chocolate peanut butter
- chocolate protein drink
- chocolate protein drink mix
- chocolate pudding
- cocoa beverage
- cocoa beverage powder
- cornbread
- crackers
- crackers with cheese
- crackers with chocolate peanut butter
- crackers with jalapeno cheese
- crackers with jam
- crackers with peanut butter
- cut bread with cheese
- cut bread with chocolate peanut butter
- cut bread with jalapeno cheese
- cut bread with jam
- cut bread with peanut butter
- dried cranberries
- dried raisins
- garlic mashed potatoes
- grape beverage
- grape beverage powder
- hash browns
- jalapeno cheese bucket
- jalapeno cheese pie
- jalapeno cheese spread
- jalapeno cheese toastie
- jalapeno cheese wedge
- jalapeno round cheese
- lemon-lime beverage
- lemon-lime beverage powder
- maple muffin
- orange beverage
- orange beverage powder
- peanut butter
- peppermint ring
- pork sausage burger
- pound cake
- pretzel nuggets
- pretzel sticks
- roasted peanuts
- smoked almonds
- spaghetti with meatballs
- spinach fettuccine
- sugar cookies
- tortilla with cheese
- tortilla with jalapeno cheese
- trail mix
- tropical-punch beverage
- tropical-punch beverage powder
- tuna sandwich
- vanilla pudding
- wooden tree tap
  - Used to gather tree sap. Place on any log.
- meal ready-to-eat (MRE) 
  - when you click on the MRE it will give you one meal, check wiki for more.

#### Blocks

- Tree tap
- Sack of almond
- Sack of avocado
- Sack of banana
- Sack of barley
- Sack of bean
- Sack of blueberry
- Sack of blueberry seed
- Sack of buckwheat
- Sack of cabbage
- Sack of cabbage seed
- Sack of chocolate chunk oatmeal cookie
- Sack of coconut
- Sack of coffee bean
- Sack of corn cob
- Sack of corn
- Sack of cornflour
- Sack of cranberry
- Sack of eggplant
- Sack of eggplant seed
- Sack of flour
- Sack of garlic
- Sack of gherkin
- Sack of gherkin seed
- Sack of grape
- Sack of grape seed
- Sack of hops
- Sack of hops seed
- Sack of lemon
- Sack of lettuce
- Sack of lettuce seed
- Sack of nether cookie
- Sack of oat
- Sack of oat seed
- Sack of oatmeal cookie
- Sack of olives
- Sack of onion
- Sack of onion seed
- Sack of orange
- Sack of peanut
- Sack of peanut seed
- Sack of pepper
- Sack of pepper seed
- Sack of plum
- Sack of poison berry
- Sack of poisonous sweet potato
- Sack of raspberry
- Sack of raspberry seed
- Sack of rice
- Sack of rice seed
- Sack of soybean
- Sack of spinach
- Sack of spinach seed
- Sack of strawberry
- Sack of strawberry seed
- Sack of sugar cookie
- Sack of sweet potato
- Sack of tea leaf
- Sack of tea seed
- Sack of tomato
- Sack of tomato seed
- Sack of vanilla pod
- Sack of vanilla seed
- Sack of yeast

### Recipes

- recipes for all new items
- Added jam recipe.
- Added shroomlight slices to shroomlight recipe.

### Fixes

- fixed spamming of invalid var "varable.worldx" in console.

If you find any bugs with this update or any future updates please properly fill out a bug report. [Github Bug Tracker](https://github.com/legopitstop/Lots-More-Food-Mods/issues)
