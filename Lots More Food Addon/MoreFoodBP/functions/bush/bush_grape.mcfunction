# bush_grape
tellraw @a[scores={fooddev=1}] {"rawtext":[{"text":"<dev> summoned: bush_grape"}]}
setblock ~1 ~ ~3 leaves 1

setblock ~2 ~ ~4 leaves 1
setblock ~2 ~ ~3 leaves 1
setblock ~2 ~ ~2 leaves 1

setblock ~3 ~ ~5 morefood:bush_grape
setblock ~3 ~ ~4 leaves 1
setblock ~3 ~1 ~4 leaves 1
setblock ~3 ~ ~3 log 2
setblock ~3 ~1 ~3 morefood:bush_grape
setblock ~3 ~ ~2 leaves 1

setblock ~4 ~ ~5 leaves 1
setblock ~4 ~ ~4 log 2
setblock ~4 ~1 ~4 leaves 1
setblock ~4 ~ ~3 leaves 1
setblock ~4 ~ ~2 leaves 1

setblock ~5 ~ ~4  leaves 1
setblock ~5 ~ ~3 morefood:bush_grape