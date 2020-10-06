# tea bush
tellraw @a[scores={fooddev=1}] {"rawtext":[{"text":"<dev> summoned: bush_tea"}]}
setblock ~1 ~ ~4 leaves

setblock ~2 ~ ~5 morefood:bush_tea
setblock ~2 ~ ~4 leaves
setblock ~2 ~1 ~4 leaves
setblock ~2 ~ ~3 leaves
setblock ~2 ~1 ~3 morefood:bush_tea
setblock ~2 ~ ~2 leaves

setblock ~3 ~ ~4 leaves
setblock ~3 ~ ~3 log
setblock ~3 ~1 ~3 leaves
setblock ~3 ~ ~2 leaves
setblock ~3 ~ ~1 morefood:bush_tea

setblock ~4 ~ ~3 leaves