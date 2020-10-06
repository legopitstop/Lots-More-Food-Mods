# bush_hops
tellraw @a[scores={fooddev=1}] {"rawtext":[{"text":"<dev> summoned: bush_hops"}]}
setblock ~2 ~ ~4 morefood:bush_hops
setblock ~2 ~ ~3 leaves
setblock ~2 ~ ~2 leaves

setblock ~3 ~ ~4 fence 2
setblock ~3 ~ ~3 fence 2
setblock ~3 ~ ~2 fence 2

setblock ~4 ~ ~4 leaves
setblock ~4 ~ ~3 morefood:bush_hops
setblock ~4 ~ ~2 morefood:bush_hops