# tree_banana
tellraw @a[scores={fooddev=1}] {"rawtext":[{"text":"<dev> summoned: tree_banana"}]}
# Logs
fill ~ ~ ~ ~ ~3 ~ stripped_birch_log 0 keep
setblock ~ ~ ~1 stripped_birch_log 0 keep
fill ~1 ~3 ~1 ~1 ~4 ~1 stripped_birch_log 0 keep
# Leaves
setblock ~1 ~5 ~1 leaves 2 keep
fill ~3 ~4 ~1 ~-1 ~4 ~1 leaves 2 keep
fill ~1 ~4 ~3 ~1 ~4 ~-1 leaves 2 keep
setblock ~-1 ~3 ~1 leaves 2 keep
setblock ~4 ~3 ~1 leaves 2 keep
setblock ~1 ~3 ~4 leaves 2 keep