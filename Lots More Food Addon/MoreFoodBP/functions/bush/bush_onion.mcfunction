# bush_onion
tellraw @a[scores={fooddev=1}] {"rawtext":[{"text":"<dev> summoned: bush_onion"}]}
setblock ~2 ~ ~4 morefood:bush_onion
setblock ~2 ~ ~3 fence 5
setblock ~2 ~1 ~3 fence 5
setblock ~2 ~ ~2 leaves 2

setblock ~3 ~ ~4 morefood:bush_onion
setblock ~3 ~1 ~4 leaves 2
setblock ~3 ~ ~3 fence 5
setblock ~3 ~1 ~3 fence 5
setblock ~3 ~ ~2 leaves 2
setblock ~3 ~1 ~2 morefood:bush_onion

setblock ~4 ~ ~4 leaves 2
setblock ~4 ~ ~3 fence 5
setblock ~4 ~1 ~3 fence 5
setblock ~4 ~ ~2 leaves 2