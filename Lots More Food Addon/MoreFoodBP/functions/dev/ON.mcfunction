# dev_score
scoreboard objectives add fooddev dummy
scoreboard players set @p fooddev 1
tellraw @p[scores={fooddev=1}] {"rawtext":[{"text":"Toggled dev mode: ON"}]}