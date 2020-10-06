# bush_gherkin
tellraw @a[scores={fooddev=1}] {"rawtext":[{"text":"<dev> summoned: bush_gherkin"}]}
setblock ~2 ~ ~4 leaves 2
setblock ~2 ~1 ~4 morefood:bush_gherkin
setblock ~2 ~ ~3 leaves 2
setblock ~2 ~1 ~3 leaves 2
setblock ~2 ~ ~2 leaves 2
setblock ~2 ~1 ~2 leaves 2

setblock ~3 ~ ~4 fence 5
setblock ~3 ~1 ~4 fence 5
setblock ~3 ~ ~3 fence 5
setblock ~3 ~1 ~3 fence 5
setblock ~3 ~ ~2 fence 5
setblock ~3 ~1 ~2 fence 5

setblock ~4 ~ ~4 leaves 2
setblock ~4 ~1 ~4 leaves 2
setblock ~4 ~ ~3 morefood:bush_gherkin
setblock ~4 ~1 ~3 leaves 2
setblock ~4 ~ ~2 leaves 2
setblock ~4 ~1 ~2 morefood:bush_gherkin