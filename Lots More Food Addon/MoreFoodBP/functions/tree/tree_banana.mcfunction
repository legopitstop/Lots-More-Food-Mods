# tree_banana
tellraw @a[scores={fooddev=1}] {"rawtext":[{"text":"<dev> summoned: tree_banana"}]}
# Logs
fill ~ ~ ~ ~ ~4 ~ log 1 keep
# Leaves
fill ~ ~3 ~-1 ~ ~4 ~1 leaves 3 keep
fill ~-1 ~3 ~ ~1 ~4 ~ leaves 3 keep
# fruit Leaves
setblock ~ ~5 ~ morefood:tree_banana
setblock ~ ~4 ~1 morefood:tree_banana
setblock ~1 ~2 ~ morefood:tree_banana