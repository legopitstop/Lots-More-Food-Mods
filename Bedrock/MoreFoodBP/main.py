from genericpath import isfile
import json
import os
from re import L

LOCAL = os.path.dirname(os.path.realpath(__file__))

FUNCTIONS = os.path.join(LOCAL, 'functions','give')

class Main():
    def __init__(self):
        self.item_files = []
        self.block_files = []

        self.items = []
        self.blocks = []

        # Make sure function dir is created
        os.makedirs(FUNCTIONS, exist_ok=True)
        
        # list all items
        self.list(os.path.join(LOCAL, 'items'), self.item_files)
        
        for item in self.item_files:
            try:
                opn = open(item)
                data = json.load(opn)
                opn.close()
                if 'minecraft:item' in data:
                    if 'description' in data['minecraft:item']:
                        if 'identifier' in data['minecraft:item']['description']:
                            id = data['minecraft:item']['description']['identifier']
                            self.items.append(id)

            except json.decoder.JSONDecodeError:
                print('ERROR:',item)

        self.create_functions('item',FUNCTIONS, self.items)

        # List all  blocks
        self.list(os.path.join(LOCAL, 'blocks'), self.block_files)

        for block in self.block_files:
            try:
                opn = open(block)
                data = json.load(opn)
                opn.close()
                if 'minecraft:block' in data:
                    if 'description' in data['minecraft:block']:
                        if 'identifier' in data['minecraft:block']['description']:
                            id = data['minecraft:block']['description']['identifier']
                            self.blocks.append(id)

            except json.decoder.JSONDecodeError:
                print('ERROR:',block)
    
        self.create_functions('block', FUNCTIONS, self.blocks)

    def list(self, dir:str, variable:list):
        """Lists all files in that dir"""
        if os.path.exists(dir) and os.path.isdir(dir):
            for file in os.listdir(dir):
                path = os.path.join(dir, file)
                if os.path.isfile(path):
                    variable.append(path)
                elif os.path.isdir(path):
                    self.list(path, variable)
        else:
            print('"%s" does not exist.', dir)

    def create_functions(self, name, path:str, items:list):
        # Split list into 36 item lists
        print('Creating %s functions'%(name))
        count=0
        num=0
        new_items = []
        for item in items:
            command = 'give @s %s\n'%(item)
            new_items.append(command)
            count+=1

            if count>=36:
                # save file
                wrt = open(os.path.join(path, name + str(num) + '.mcfunction'), 'a')

                for i in new_items: wrt.write(i)
                wrt.close()

                new_items = []
                count=0
                num+=1

if __name__ == '__main__':
    main = Main()