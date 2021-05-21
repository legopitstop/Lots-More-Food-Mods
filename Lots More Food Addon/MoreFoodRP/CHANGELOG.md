# CHANGELOG v1.6.0 (Bug Fix Update)

### General
- Rewritten all food blocks.
- All food blocks can be broken by pistons.
- If you pick block an "illegal" block item it will be removed from your inventory.
- Updated custom GUI's.
- Added support for upcoming addon "Just Another Furniture Addon" (Preview via Discord server)
- Hanging coconut now drops a coconut and has its proper texture. 
- Knifes are now like swords, breaks; webs, and bamboo, can be repaired in an anvil. Also gave them their respective tags. They shouldn't break blocks in creative mode.
- Wooden spoon is now like a shovel. (texture is subject to change)
- Plant block states have been changed, meaning all plant stages will be reset, Nothing a little bit of time and bonemeal could'nt fix.
- All plants (crop, bush, sapling) should now show growth particles when using bonemeal on the plant. It will still consume your bonemeal even if the plant is at its last stage.
- organized creative inventory items.
- morefood tag at the end of names is now gray.
- rewrote all loot tables, should be more organized.
- Drinks (like juice, ice crush, smoothie, etc) have a max stack of 16, like honey bottles.
- Gelatin is now only a recipe item, cannot be eaten
- Netherite apple now has a light purple name.
- Hanging fruit can now be placed on `minecraft:leaves2`
- When you break a mature hanging fruit it has a 30% chance to drop the sapling. This is until custom leaves are added.
- Sapling's voxel shape should now better match vanilla saplings.

### World Generation Changes
- There should be fewer/no buried crop plot structures.
- Changed up spawn rates. lowered crops, bush, and barn rates. Increased custom tree rates. (You are meant to have to explore to find all the plants)
- Changed up spawn locations for some structures. See the wiki for more.
- bushes will now spawn as Sweet Berry bushes do. (In small clumps instead of structures)
- Check the wiki to get more detailed information on the world generation! https://github.com/legopitstop/Lots-More-Food-Mods/wiki
- If you are having issues finding the world generation features make sure "Holiday Creator Features" and "Creation of Custom Biomes" are toggled on in the experimental gameplay section in the world creation menu.
- There are now 2 variants of trees. The old version and the new version that generate and will be randomly chosen from a sapling.

### NOTE
- If you cannot find the generated plants make sure **Experimental Gameplay**, Creation of custom biomes is toggled on! They will not generate if it is off!
- Custom trees use vanilla logs (for now). Under a custom tree, there will be a hanging plant. When fully grown you can right click to get the fruit/item drop.
- Some seeds can only be placed on grass/dirt. These are called "bushes". Other seeds can only be placed on farmland. These are called "crops"
- Some crops do not have a crop item. i.e. barley will always drop barley seeds because there is no barley drop.
- There are some issues with the saplings. For example; They will break any block that is in their way. This will be fixed in the next update, requires a complete redo of the tree structures.

### Recipes
- Added seed recipes for bushes. Renewable bushes to easily expand your farms. (the item that you get from clicking on the bush) -> seed

### Bug Fixes!
- [#9](https://github.com/legopitstop/Lots-More-Food-Mods/issues/9) Crafting issues
- [#10](https://github.com/legopitstop/Lots-More-Food-Mods/issues/10) Emerald knife has missing texture.
- [#11](https://github.com/legopitstop/Lots-More-Food-Mods/issues/11) Breaking a mature bush gives the wrong item/block.
- [#14](https://github.com/legopitstop/Lots-More-Food-Mods/issues/14) Some seeds are not placing
- [#19](https://github.com/legopitstop/Lots-More-Food-Mods/issues/19) Cake is too easy to break compared to vanilla cake. 
- [#20](https://github.com/legopitstop/Lots-More-Food-Mods/issues/20) Items that are "drinks" play the eating sound and animation. 
- [#21](https://github.com/legopitstop/Lots-More-Food-Mods/issues/21) Players do not get hunger/saturation when eating the custom cake.
- White wine 100% does not stack as it should.
- Items that should convert to a different item (potion converts to glass bottle after use.) do not work

## **Note**
that some blocks are being removed or their name has been changed. These blocks should automatically be converted into their new block or turned into air. If you find any issues consider reporting them through the issue tracker.

If you find any bugs with this update or any future updates please properly fill out a bug report. [Github Bug Tracker](https://github.com/legopitstop/Lots-More-Food-Mods/issues)
Have any other questions or concerns? Check out the FAQ! [Lot's More Food FAQ](https://github.com/legopitstop/Lots-More-Food-Mods/wiki/FAQ)