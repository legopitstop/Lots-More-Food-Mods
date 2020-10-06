# bush pepper
tellraw @a[scores={fooddev=1}] {"rawtext":[{"text":"<dev> summoned: bush_pepper"}]}
setblock ~2 ~ ~4 morefood:bush_pepper
setblock ~2 ~ ~3 leaves 1
setblock ~2 ~1 ~3 leaves 1
setblock ~2 ~ ~2 leaves 1
setblock ~2 ~1 ~2 morefood:bush_pepper
setblock ~2 ~ ~1 leaves 1

setblock ~3 ~ ~4 fence 2
setblock ~3 ~1 ~4 fence 2
setblock ~3 ~ ~3 fence 2
setblock ~3 ~1 ~3 fence 2
setblock ~3 ~ ~2 fence 2
setblock ~3 ~1 ~2 fence 2
setblock ~3 ~ ~1 fence 2
setblock ~3 ~1 ~1 fence 2

setblock ~4 ~ ~4 leaves 1
setblock ~4 ~ ~3 leaves 1
setblock ~4 ~1 ~3 leaves 1
setblock ~4 ~ ~2 leaves 1
setblock ~4 ~1 ~2 morefood:bush_pepper
setblock ~4 ~ ~1 leaves 1