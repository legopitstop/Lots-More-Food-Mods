# Made by: @Legopitstop
# Desc: Updates old blocks and item ID to the new ID
#
# Called By: tick.json

# Change vanilla
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 shroomlight replace morefood:shroomlight
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 warped_wart_block replace morefood:warped_wart_block

# Legacy
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 morefood:hanging_apple replace morefood:apple_hanging_fruit
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 morefood:hanging_banana replace morefood:banana_hanging_fruit
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 morefood:hanging_lemon replace morefood:lemon_hanging_fruit
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 morefood:hanging_olives replace morefood:olives_hanging_fruit
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 morefood:hanging_orange replace morefood:orange_hanging_fruit
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 morefood:hanging_plum replace morefood:plum_hanging_fruit
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 morefood:sweet_corn_crop replace morefood:corn_crop
execute as @a at @s run fill ~-10 ~-10 ~-10 ~10 ~10 ~10 morefood:sweet_corn_sack replace morefood:corn_sack

execute as @a[hasitem={item=morefood:milk_carton}] run give @s morefood:milk_bottle
execute as @a[hasitem={item=morefood:milk_carton}] run clear @s morefood:milk_bottle 0 1
execute as @a[hasitem={item=morefood:cream_carton}] run give @s morefood:cream_bottle
execute as @a[hasitem={item=morefood:cream_carton}] run clear @s morefood:cream_bottle 0 1
execute as @a[hasitem={item=morefood:cut_sweet_potato}] run give @s morefood:sweet_french_fries
execute as @a[hasitem={item=morefood:cut_sweet_potato}] run clear @s morefood:sweet_french_fries 0 1
execute as @a[hasitem={item=morefood:corn}] run give @s morefood:sweet_corn
execute as @a[hasitem={item=morefood:corn}] run clear @s morefood:sweet_corn 0 1
execute as @a[hasitem={item=morefood:applesauce}] run give @s morefood:apple_sauce
execute as @a[hasitem={item=morefood:applesauce}] run clear @s morefood:applesauce 0 1
execute as @a[hasitem={item=morefood:beef_sub}] run give @s morefood:beef_submarine_sandwich
execute as @a[hasitem={item=morefood:beef_sub}] run clear @s morefood:beef_sub 0 1
execute as @a[hasitem={item=morefood:beer_glass}] run give @s morefood:beer_mug
execute as @a[hasitem={item=morefood:beer_glass}] run clear @s morefood:beer_glass 0 1
execute as @a[hasitem={item=morefood:breakfast_sub}] run give @s morefood:breakfast_submarine_sandwich
execute as @a[hasitem={item=morefood:breakfast_sub}] run clear @s morefood:breakfast_sub 0 1
execute as @a[hasitem={item=morefood:chicken_sub}] run give @s morefood:chicken_submarine_sandwich
execute as @a[hasitem={item=morefood:chicken_sub}] run clear @s morefood:chicken_sub 0 1
execute as @a[hasitem={item=morefood:cooked_hotdog_sausage}] run give @s morefood:cooked_frankfurter_sausage
execute as @a[hasitem={item=morefood:cooked_hotdog_sausage}] run clear @s morefood:cooked_hotdog_sausage 0 1
execute as @a[hasitem={item=morefood:cooked_sausage}] run give @s morefood:cooked_breakfast_sausage
execute as @a[hasitem={item=morefood:cooked_sausage}] run clear @s morefood:cooked_sausage 0 1
execute as @a[hasitem={item=morefood:veganburger_patty}] run give @s morefood:cooked_veggie_burger_patty
execute as @a[hasitem={item=morefood:veganburger_patty}] run clear @s morefood:veganburger_patty 0 1
execute as @a[hasitem={item=morefood:cooked_wedges}] run give @s morefood:cooked_potato_wedges
execute as @a[hasitem={item=morefood:cooked_wedges}] run clear @s morefood:cooked_wedges 0 1
execute as @a[hasitem={item=morefood:cornflour}] run give @s morefood:corn_starch
execute as @a[hasitem={item=morefood:cornflour}] run clear @s morefood:cornflour 0 1
execute as @a[hasitem={item=morefood:corn_on_cob}] run give @s morefood:corncob
execute as @a[hasitem={item=morefood:corn_on_cob}] run clear @s morefood:corn_on_cob 0 1
execute as @a[hasitem={item=morefood:cut_bread}] run give @s morefood:bread_slice
execute as @a[hasitem={item=morefood:cut_bread}] run clear @s morefood:cut_bread 0 1
execute as @a[hasitem={item=morefood:cut_bread_with_cheese}] run give @s morefood:bread_slice_with_cheese
execute as @a[hasitem={item=morefood:cut_bread_with_cheese}] run clear @s morefood:cut_bread_with_cheese 0 1
execute as @a[hasitem={item=morefood:cut_bread_with_chocolate_peanut_butter}] run give @s morefood:bread_slice_with_chocolate_peanut_butter
execute as @a[hasitem={item=morefood:cut_bread_with_chocolate_peanut_butter}] run clear @s morefood:cut_bread_with_chocolate_peanut_butter 0 1
execute as @a[hasitem={item=morefood:cut_bread_with_glowberry_jam}] run give @s morefood:bread_slice_with_glowberry_jam
execute as @a[hasitem={item=morefood:cut_bread_with_glowberry_jam}] run clear @s morefood:cut_bread_with_glowberry_jam 0 1
execute as @a[hasitem={item=morefood:cut_bread_with_jalapeno_cheese}] run give @s morefood:bread_slice_with_jalapeno_cheese
execute as @a[hasitem={item=morefood:cut_bread_with_jalapeno_cheese}] run clear @s morefood:cut_bread_with_jalapeno_cheese 0 1
execute as @a[hasitem={item=morefood:cut_bread_with_jam}] run give @s morefood:bread_slice_with_jam
execute as @a[hasitem={item=morefood:cut_bread_with_jam}] run clear @s morefood:cut_bread_with_jam 0 1
execute as @a[hasitem={item=morefood:cut_bread_with_peanut_butter}] run give @s morefood:bread_slice_with_peanut_butter
execute as @a[hasitem={item=morefood:cut_bread_with_peanut_butter}] run clear @s morefood:cut_bread_with_peanut_butter 0 1
execute as @a[hasitem={item=morefood:cut_fries}] run give @s morefood:french_fries
execute as @a[hasitem={item=morefood:cut_fries}] run clear @s morefood:cut_fries 0 1
execute as @a[hasitem={item=morefood:donut_chocolate}] run give @s morefood:chocolate_doughnut
execute as @a[hasitem={item=morefood:donut_chocolate}] run clear @s morefood:donut_chocolate 0 1
execute as @a[hasitem={item=morefood:donut_coffee}] run give @s morefood:coffee_doughnut
execute as @a[hasitem={item=morefood:donut_coffee}] run clear @s morefood:donut_coffee 0 1
execute as @a[hasitem={item=morefood:donut_iced}] run give @s morefood:iced_doughnut
execute as @a[hasitem={item=morefood:donut_iced}] run clear @s morefood:donut_iced 0 1
execute as @a[hasitem={item=morefood:donut_pink_ice}] run give @s morefood:pink_ice_doughnut
execute as @a[hasitem={item=morefood:donut_pink_ice}] run clear @s morefood:donut_pink_ice 0 1
execute as @a[hasitem={item=morefood:donut_plain}] run give @s morefood:plain_doughnut
execute as @a[hasitem={item=morefood:donut_plain}] run clear @s morefood:donut_plain 0 1
execute as @a[hasitem={item=morefood:donut_strawberry}] run give @s morefood:strawberry_doughnut
execute as @a[hasitem={item=morefood:donut_strawberry}] run clear @s morefood:donut_strawberry 0 1
execute as @a[hasitem={item=morefood:donut_toffee}] run give @s morefood:toffee_doughnut
execute as @a[hasitem={item=morefood:donut_toffee}] run clear @s morefood:donut_toffee 0 1
execute as @a[hasitem={item=morefood:empty_icecrush_glass}] run give @s morefood:ice_crush_glass
execute as @a[hasitem={item=morefood:empty_icecrush_glass}] run clear @s morefood:empty_icecrush_glass 0 1
execute as @a[hasitem={item=morefood:empty_tumbler_glass}] run give @s morefood:tumbler_glass
execute as @a[hasitem={item=morefood:empty_tumbler_glass}] run clear @s morefood:empty_tumbler_glass 0 1
execute as @a[hasitem={item=morefood:fries}] run give @s morefood:french_fry_pot
execute as @a[hasitem={item=morefood:fries}] run clear @s morefood:fries 0 1
execute as @a[hasitem={item=morefood:glowberry_icecrush}] run give @s morefood:glowberry_ice_crush
execute as @a[hasitem={item=morefood:glowberry_icecrush}] run clear @s morefood:glowberry_icecrush 0 1
execute as @a[hasitem={item=morefood:hotdog}] run give @s morefood:hot_dog
execute as @a[hasitem={item=morefood:hotdog}] run clear @s morefood:hotdog 0 1
execute as @a[hasitem={item=morefood:hotdog_bun}] run give @s morefood:hot_dog_bun
execute as @a[hasitem={item=morefood:hotdog_bun}] run clear @s morefood:hotdog_bun 0 1
execute as @a[hasitem={item=morefood:hotdog_sausage}] run give @s morefood:frankfurter_sausage
execute as @a[hasitem={item=morefood:hotdog_sausage}] run clear @s morefood:hotdog_sausage 0 1
execute as @a[hasitem={item=morefood:icecream_banana}] run give @s morefood:banana_ice_cream
execute as @a[hasitem={item=morefood:icecream_banana}] run clear @s morefood:icecream_banana 0 1
execute as @a[hasitem={item=morefood:icecream_chocolate}] run give @s morefood:chocolate_ice_cream
execute as @a[hasitem={item=morefood:icecream_chocolate}] run clear @s morefood:icecream_chocolate 0 1
execute as @a[hasitem={item=morefood:icecream_cone}] run give @s morefood:ice_cream_cone
execute as @a[hasitem={item=morefood:icecream_cone}] run clear @s morefood:icecream_cone 0 1
execute as @a[hasitem={item=morefood:icecream_strawberry}] run give @s morefood:strawberry_ice_cream
execute as @a[hasitem={item=morefood:icecream_strawberry}] run clear @s morefood:icecream_strawberry 0 1
execute as @a[hasitem={item=morefood:icecream_toffee}] run give @s morefood:toffee_ice_cream
execute as @a[hasitem={item=morefood:icecream_toffee}] run clear @s morefood:icecream_toffee 0 1
execute as @a[hasitem={item=morefood:icecream_vanilla}] run give @s morefood:vanilla_ice_cream
execute as @a[hasitem={item=morefood:icecream_vanilla}] run clear @s morefood:icecream_vanilla 0 1
execute as @a[hasitem={item=morefood:icecrush_apple}] run give @s morefood:apple_ice_crush
execute as @a[hasitem={item=morefood:icecrush_apple}] run clear @s morefood:icecrush_apple 0 1
execute as @a[hasitem={item=morefood:icecrush_apple_raspberry}] run give @s morefood:apple_raspberry_ice_crush
execute as @a[hasitem={item=morefood:icecrush_apple_raspberry}] run clear @s morefood:icecrush_apple_raspberry 0 1
execute as @a[hasitem={item=morefood:icecrush_berry}] run give @s morefood:berry_ice_crush
execute as @a[hasitem={item=morefood:icecrush_berry}] run clear @s morefood:icecrush_berry 0 1
execute as @a[hasitem={item=morefood:icecrush_grape}] run give @s morefood:grape_ice_crush
execute as @a[hasitem={item=morefood:icecrush_grape}] run clear @s morefood:icecrush_grape 0 1
execute as @a[hasitem={item=morefood:icecrush_lemon}] run give @s morefood:lemon_ice_crush
execute as @a[hasitem={item=morefood:icecrush_lemon}] run clear @s morefood:icecrush_lemon 0 1
execute as @a[hasitem={item=morefood:icecrush_melon}] run give @s morefood:melon_ice_crush
execute as @a[hasitem={item=morefood:icecrush_melon}] run clear @s morefood:icecrush_melon 0 1
execute as @a[hasitem={item=morefood:icecrush_mixed_fruit}] run give @s morefood:mixed_fruit_ice_crush
execute as @a[hasitem={item=morefood:icecrush_mixed_fruit}] run clear @s morefood:icecrush_mixed_fruit 0 1
execute as @a[hasitem={item=morefood:icecrush_orange}] run give @s morefood:orange_ice_crush
execute as @a[hasitem={item=morefood:icecrush_orange}] run clear @s morefood:icecrush_orange 0 1
execute as @a[hasitem={item=morefood:icecrush_strawberry}] run give @s morefood:strawberry_ice_crush
execute as @a[hasitem={item=morefood:icecrush_strawberry}] run clear @s morefood:icecrush_strawberry 0 1
execute as @a[hasitem={item=morefood:ice_bowl}] run give @s morefood:ice_cream_bowl
execute as @a[hasitem={item=morefood:ice_bowl}] run clear @s morefood:ice_bowl 0 1
execute as @a[hasitem={item=morefood:jalapeno_round_cheese}] run give @s morefood:truckle_of_jalapeno_cheese
execute as @a[hasitem={item=morefood:jalapeno_round_cheese}] run clear @s morefood:jalapeno_round_cheese 0 1
execute as @a[hasitem={item=morefood:juice_apple}] run give @s morefood:apple_juice
execute as @a[hasitem={item=morefood:juice_apple}] run clear @s morefood:juice_apple 0 1
execute as @a[hasitem={item=morefood:juice_berry}] run give @s morefood:berry_juice
execute as @a[hasitem={item=morefood:juice_berry}] run clear @s morefood:juice_berry 0 1
execute as @a[hasitem={item=morefood:juice_grape}] run give @s morefood:grape_juice
execute as @a[hasitem={item=morefood:juice_grape}] run clear @s morefood:juice_grape 0 1
execute as @a[hasitem={item=morefood:juice_lemon}] run give @s morefood:lemon_juice
execute as @a[hasitem={item=morefood:juice_lemon}] run clear @s morefood:juice_lemon 0 1
execute as @a[hasitem={item=morefood:juice_melon}] run give @s morefood:melon_juice
execute as @a[hasitem={item=morefood:juice_melon}] run clear @s morefood:juice_melon 0 1
execute as @a[hasitem={item=morefood:juice_mixed_fruit}] run give @s morefood:mixed_fruit_juice
execute as @a[hasitem={item=morefood:juice_mixed_fruit}] run clear @s morefood:juice_mixed_fruit 0 1
execute as @a[hasitem={item=morefood:juice_orange}] run give @s morefood:orange_juice
execute as @a[hasitem={item=morefood:juice_orange}] run clear @s morefood:juice_orange 0 1
execute as @a[hasitem={item=morefood:juice_strawberry}] run give @s morefood:strawberry_juice
execute as @a[hasitem={item=morefood:juice_strawberry}] run clear @s morefood:juice_strawberry 0 1
execute as @a[hasitem={item=morefood:juice_tomato}] run give @s morefood:tomato_juice
execute as @a[hasitem={item=morefood:juice_tomato}] run clear @s morefood:juice_tomato 0 1
execute as @a[hasitem={item=morefood:milkshake_banana}] run give @s morefood:banana_milkshake
execute as @a[hasitem={item=morefood:milkshake_banana}] run clear @s morefood:milkshake_banana 0 1
execute as @a[hasitem={item=morefood:milkshake_chocolate}] run give @s morefood:chocolate_milkshake
execute as @a[hasitem={item=morefood:milkshake_chocolate}] run clear @s morefood:milkshake_chocolate 0 1
execute as @a[hasitem={item=morefood:milkshake_strawberry}] run give @s morefood:strawberry_milkshake
execute as @a[hasitem={item=morefood:milkshake_strawberry}] run clear @s morefood:milkshake_strawberry 0 1
execute as @a[hasitem={item=morefood:pie_apple}] run give @s morefood:apple_pie
execute as @a[hasitem={item=morefood:pie_apple}] run clear @s morefood:pie_apple 0 1
execute as @a[hasitem={item=morefood:pie_apple_raspberry}] run give @s morefood:apple_raspberry_pie
execute as @a[hasitem={item=morefood:pie_apple_raspberry}] run clear @s morefood:pie_apple_raspberry 0 1
execute as @a[hasitem={item=morefood:pie_base}] run give @s morefood:pie_crust
execute as @a[hasitem={item=morefood:pie_base}] run clear @s morefood:pie_base 0 1
execute as @a[hasitem={item=morefood:pie_berry}] run give @s morefood:berry_pie
execute as @a[hasitem={item=morefood:pie_berry}] run clear @s morefood:pie_berry 0 1
execute as @a[hasitem={item=morefood:pie_cheese}] run give @s morefood:cheese_pie
execute as @a[hasitem={item=morefood:pie_cheese}] run clear @s morefood:pie_cheese 0 1
execute as @a[hasitem={item=morefood:pie_chicken}] run give @s morefood:chicken_pie
execute as @a[hasitem={item=morefood:pie_chicken}] run clear @s morefood:pie_chicken 0 1
execute as @a[hasitem={item=morefood:pie_chocolate}] run give @s morefood:chocolate_pie
execute as @a[hasitem={item=morefood:pie_chocolate}] run clear @s morefood:pie_chocolate 0 1
execute as @a[hasitem={item=morefood:pie_lemon}] run give @s morefood:lemon_pie
execute as @a[hasitem={item=morefood:pie_lemon}] run clear @s morefood:pie_lemon 0 1
execute as @a[hasitem={item=morefood:pie_plum}] run give @s morefood:plum_pie
execute as @a[hasitem={item=morefood:pie_plum}] run clear @s morefood:pie_plum 0 1
execute as @a[hasitem={item=morefood:pie_pork}] run give @s morefood:pork_pie
execute as @a[hasitem={item=morefood:pie_pork}] run clear @s morefood:pie_pork 0 1
execute as @a[hasitem={item=morefood:pie_steak}] run give @s morefood:beef_pie
execute as @a[hasitem={item=morefood:pie_steak}] run clear @s morefood:pie_steak 0 1
execute as @a[hasitem={item=morefood:pie_strawberry}] run give @s morefood:strawberry_pie
execute as @a[hasitem={item=morefood:pie_strawberry}] run clear @s morefood:pie_strawberry 0 1
execute as @a[hasitem={item=morefood:pie_toffee}] run give @s morefood:toffee_pie
execute as @a[hasitem={item=morefood:pie_toffee}] run clear @s morefood:pie_toffee 0 1
execute as @a[hasitem={item=morefood:pizza_base}] run give @s morefood:pizza_crust
execute as @a[hasitem={item=morefood:pizza_base}] run clear @s morefood:pizza_base 0 1
execute as @a[hasitem={item=morefood:raw_hamburger_patty}] run give @s morefood:hamburger_patty
execute as @a[hasitem={item=morefood:raw_hamburger_patty}] run clear @s morefood:raw_hamburger_patty 0 1
execute as @a[hasitem={item=morefood:raw_squid}] run give @s morefood:squid
execute as @a[hasitem={item=morefood:raw_squid}] run clear @s morefood:raw_squid 0 1
execute as @a[hasitem={item=morefood:round_cheese}] run give @s morefood:truckle_of_cheese
execute as @a[hasitem={item=morefood:round_cheese}] run clear @s morefood:round_cheese 0 1
execute as @a[hasitem={item=morefood:raw_sausage}] run give @s morefood:breakfast_sausage
execute as @a[hasitem={item=morefood:raw_sausage}] run clear @s morefood:raw_sausage 0 1
execute as @a[hasitem={item=morefood:shroomlight_slices}] run give @s morefood:shroomlight_slice
execute as @a[hasitem={item=morefood:shroomlight_slices}] run clear @s morefood:shroomlight_slices 0 1
execute as @a[hasitem={item=morefood:smoothie_banana}] run give @s morefood:banana_smoothie
execute as @a[hasitem={item=morefood:smoothie_banana}] run clear @s morefood:smoothie_banana 0 1
execute as @a[hasitem={item=morefood:smoothie_berry}] run give @s morefood:berry_smoothie
execute as @a[hasitem={item=morefood:smoothie_berry}] run clear @s morefood:smoothie_berry 0 1
execute as @a[hasitem={item=morefood:smoothie_grape}] run give @s morefood:grape_smoothie
execute as @a[hasitem={item=morefood:smoothie_grape}] run clear @s morefood:smoothie_grape 0 1
execute as @a[hasitem={item=morefood:smoothie_mixed_fruit}] run give @s morefood:mixed_fruit_smoothie
execute as @a[hasitem={item=morefood:smoothie_mixed_fruit}] run clear @s morefood:smoothie_mixed_fruit 0 1
execute as @a[hasitem={item=morefood:smoothie_raspberry}] run give @s morefood:raspberry_smoothie
execute as @a[hasitem={item=morefood:smoothie_raspberry}] run clear @s morefood:smoothie_raspberry 0 1
execute as @a[hasitem={item=morefood:smoothie_strawberry}] run give @s morefood:strawberry_smoothie
execute as @a[hasitem={item=morefood:smoothie_strawberry}] run clear @s morefood:smoothie_strawberry 0 1
execute as @a[hasitem={item=morefood:soda_apple}] run give @s morefood:apple_soda
execute as @a[hasitem={item=morefood:soda_apple}] run clear @s morefood:soda_apple 0 1
execute as @a[hasitem={item=morefood:soda_berry}] run give @s morefood:berry_soda
execute as @a[hasitem={item=morefood:soda_berry}] run clear @s morefood:soda_berry 0 1
execute as @a[hasitem={item=morefood:soda_can_empty}] run give @s morefood:soda_can
execute as @a[hasitem={item=morefood:soda_can_empty}] run clear @s morefood:soda_can_empty 0 1
execute as @a[hasitem={item=morefood:soda_grape}] run give @s morefood:grape_soda
execute as @a[hasitem={item=morefood:soda_grape}] run clear @s morefood:soda_grape 0 1
execute as @a[hasitem={item=morefood:soda_lemon}] run give @s morefood:lemon_soda
execute as @a[hasitem={item=morefood:soda_lemon}] run clear @s morefood:soda_lemon 0 1
execute as @a[hasitem={item=morefood:soda_orange}] run give @s morefood:orange_soda
execute as @a[hasitem={item=morefood:soda_orange}] run clear @s morefood:soda_orange 0 1
execute as @a[hasitem={item=morefood:soda_strawberry}] run give @s morefood:strawberry_soda
execute as @a[hasitem={item=morefood:soda_strawberry}] run clear @s morefood:soda_strawberry 0 1
execute as @a[hasitem={item=morefood:sub_bun}] run give @s morefood:submarine_sandwich_bun
execute as @a[hasitem={item=morefood:sub_bun}] run clear @s morefood:sub_bun 0 1
execute as @a[hasitem={item=morefood:sweet_potato_fries}] run give @s morefood:sweet_french_fry_pot
execute as @a[hasitem={item=morefood:sweet_potato_fries}] run clear @s morefood:sweet_potato_fries 0 1
execute as @a[hasitem={item=morefood:veganburger}] run give @s morefood:veggie_burger
execute as @a[hasitem={item=morefood:veganburger}] run clear @s morefood:veganburger 0 1
execute as @a[hasitem={item=morefood:raw_veganburger_patty}] run give @s morefood:veggie_burger_patty
execute as @a[hasitem={item=morefood:raw_veganburger_patty}] run clear @s morefood:raw_veganburger_patty 0 1
execute as @a[hasitem={item=morefood:raw_wedges}] run give @s morefood:potato_wedges
execute as @a[hasitem={item=morefood:raw_wedges}] run clear @s morefood:raw_wedges 0 1
execute as @a[hasitem={item=morefood:wedges_pot}] run give @s morefood:potato_wedges_pot
execute as @a[hasitem={item=morefood:wedges_pot}] run clear @s morefood:wedges_pot 0 1

# remove 'illegal' items
clear @a morefood:apple_hanging_fruit
clear @a morefood:banana_hanging_fruit
clear @a morefood:lemon_hanging_fruit
clear @a morefood:olives_hanging_fruit
clear @a morefood:orange_hanging_fruit
clear @a morefood:plum_hanging_fruit
clear @a morefood:apple_sapling_block
clear @a morefood:banana_sapling_block
clear @a morefood:lemon_sapling_block
clear @a morefood:olive_sapling_block
clear @a morefood:orange_sapling_block
clear @a morefood:plum_sapling_block
clear @a morefood:palm_sapling_block
clear @a morefood:avocado_sapling_block
clear @a morefood:almond_sapling_block
