# bush tomato
tellraw @a[scores={fooddev=1}] {"rawtext":[{"text":"<dev> summoned: bush_tomato"}]}
setblock ~2 ~ ~4 morefood:bush_tomato
setblock ~2 ~ ~3 leaves 2
setblock ~2 ~1 ~3 leaves 2
setblock ~2 ~ ~2 morefood:bush_tomato

setblock ~3 ~ ~4 fence 2
setblock ~3 ~1 ~4 fence 2
setblock ~3 ~ ~3 fence 2
setblock ~3 ~1 ~3 fence 2
setblock ~3 ~ ~2 fence 2
setblock ~3 ~1 ~2 fence 2

setblock ~4 ~ ~4 leaves 2
setblock ~4 ~ ~3 leaves 2
setblock ~4 ~1 ~3 leaves 2
setblock ~4 ~ ~2 morefood:bush_tomato