# bush strawberry
tellraw @a[scores={fooddev=1}] {"rawtext":[{"text":"<dev> summoned: bush_strawberry"}]}
setblock ~2 ~ ~4 morefood:bush_strawberry
setblock ~2 ~ ~3 leaves 1
setblock ~2 ~1 ~3 leaves 1
setblock ~2 ~ ~2 leaves 1

setblock ~3 ~ ~4 leaves 1
setblock ~3 ~1 ~4 leaves 1
setblock ~3 ~ ~3 log 1
setblock ~3 ~1 ~3 leaves 1
setblock ~3 ~ ~2 leaves 1
setblock ~3 ~1 ~2 morefood:bush_strawberry

setblock ~4 ~ ~4 leaves 1
setblock ~4 ~ ~3 morefood:bush_strawberry
setblock ~4 ~1 ~3 leaves 1
setblock ~4 ~ ~2 leaves 1