# dev_score
scoreboard objectives add fooddev dummy
scoreboard players set @p[scores={fooddev=1}] fooddev 0
tellraw @p[scores={fooddev=0}] {"rawtext":[{"text":"Toggled dev mode: OFF"}]}