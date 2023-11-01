"""
This script is used for testing this pack for common errors before it gets released.
"""
import json
import os
import glob
import logging
import sys

PATH = os.path.dirname(os.path.realpath(__file__))
logging.basicConfig(format='[%(asctime)s] [%(name)s/%(levelname)s]: %(message)s', datefmt='%I:%M:%S',handlers=[logging.StreamHandler(sys.stdout)], level=logging.INFO)

def items():
    PASSED = True
    for x in glob.glob(PATH+'/items/**/*.json', recursive=True):
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
                                print(x, "failed")
                                logging.warning("%s: Missing use_duration!", x)
                                PASSED = False

    if PASSED:
        logging.info("Items - ✅")
    else:
        logging.info("Items - ❌")


def blocks():
    PASSED = True
    for x in glob.glob(PATH+'/blocks/**/*.json', recursive=True):
        if os.path.isfile(x):
            with open(x, 'r') as r:
                data = json.load(r)

                if 'minecraft:block' in data:
                    if 'components' in data['minecraft:block']:
                        pass

    if PASSED:
        logging.info("Blocks - ✅")
    else:
        logging.info("Blocks - ❌")

items()
blocks()