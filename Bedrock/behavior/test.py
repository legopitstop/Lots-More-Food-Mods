"""
This script is used for testing this pack for common errors before it gets released.
"""
import json
import os
import glob
import logging
import sys
import re

PATH = os.path.dirname(os.path.realpath(__file__))
logging.basicConfig(format='[%(asctime)s] [%(name)s/%(levelname)s]: %(message)s', datefmt='%I:%M:%S',handlers=[logging.FileHandler('report.log',mode='w'),logging.StreamHandler(sys.stdout)], level=logging.INFO)

def items():
    PASSED = True
    for x in glob.glob(PATH+'/items/[!legacy]**/*.json', recursive=True):
        if os.path.isfile(x):
            with open(x, 'r') as r:
                data = json.load(r)

                if 'minecraft:item' in data:
                    if 'components' in data['minecraft:item']:
                        if 'minecraft:food' in data['minecraft:item']['components']: # is food
                            
                            if 'minecraft:use_animation' not in data['minecraft:item']['components']:
                                logging.warning("%s: Missing use_animation!", x)
                                PASSED = False
                            
                            if 'minecraft:use_duration' not in data['minecraft:item']['components']:
                                logging.warning("%s: Missing use_duration!", x)
                                PASSED = False

    if PASSED:
        logging.info("Items - SUCCESS")
    else:
        logging.info("Items - FAIL")


def blocks():
    PASSED = True
    for x in glob.glob(PATH+'/blocks/[!legacy]**/*.json', recursive=True):
        if os.path.isfile(x):
            with open(x, 'r') as r:
                data = json.load(r)

                if 'minecraft:block' in data:
                    if 'components' in data['minecraft:block']:
                        pass

    if PASSED:
        logging.info("Blocks - SUCCESS")
    else:
        logging.info("Blocks - FAIL")

# Obtainable by worldgen or legacy
ignore_groups = ['itemGroup.name.crop', 'itemGroup.name.seed', 'itemGroup.name.sapling', 'itemGroup.name.grass']
ignore = ['^squid$', '^shroomlight_slice$', '^bottled_', '^maple_sap_bucket$', '^breadsticks$', '^glass_shard$', '^pulp$']
recipe_remainders = {
    'morefood:jam': 'morefood:jar',
    'morefood:glowberry_jam': 'morefood:jar',
    'morefood:vanilla_extract': 'morefood:bottle',
    'morefood:milk_bottle': 'minecraft:glass_bottle',
    'morefood:cream_bottle': 'minecraft:glass_bottle',
    'morefood:cheese_bucket': 'minecraft:bucket',
    'morefood:jalapeno_cheese_bucket': 'minecraft:bucket',
    'morefood:box_of_chicken': 'morefood:chicken_select_box',
}

def recipes_result(name, res, results, passed):
    if isinstance(res, list):
        for r1 in results:
            aa = True
            for r2 in res:
                if r1['item'] == r2['item']:
                    aa = False
            if aa:
                logging.warning('%s: Needs results %s', name, ', '.join([x['item'] for x in results]))
                passed = False


def recipes():
    PASSED = True
    rs = []
    for x in glob.glob(PATH+'/recipes/**/*.json', recursive=True):
        if os.path.isfile(x):
            name = os.path.basename(x)
            rs.append(name.replace('.json', ''))

            with open(x) as f:
                data = json.load(f)
                # Check ingredients and results
                results = []
                if 'minecraft:recipe_shaped' in data:
                    res = data['minecraft:recipe_shaped']['result']
                    ing = data['minecraft:recipe_shaped']['key']
                    for k,v in ing.items():
                        item = v['item']
                        if item in recipe_remainders:
                            result = recipe_remainders[item]
                            results.append({'item':result})
                    
                    recipes_result(name, res, results, PASSED)

                if 'minecraft:recipe_shapeless' in data:
                    res = data['minecraft:recipe_shapeless']['result']
                    ing = data['minecraft:recipe_shapeless']['ingredients']
                    for v in ing:
                        item = v['item']
                        if item in recipe_remainders:
                            result = recipe_remainders[item]
                            results.append({'item':result})
                            
                    recipes_result(name, res, results, PASSED)




    for x in glob.glob(PATH+'/items/[!legacy]**/*.json', recursive=True):
        if os.path.isfile(x):
            with open(x, 'r') as r:
                data = json.load(r)
                group = data['minecraft:item']['description']['menu_category']['group']
                id = data['minecraft:item']['description']['identifier'].replace('morefood:', '')
                bl = True
                for x in ignore:
                    if len(re.findall(x, id)) != 0:
                        bl = False
                if bl and id not in rs and group not in ignore_groups:
                    logging.warning("%s: Missing recipe!", id)
                    PASSED = False

    if PASSED:
        logging.info("Recipes - SUCCESS")
    else:
        logging.info("Recipes - FAIL")

items()
blocks()
recipes()