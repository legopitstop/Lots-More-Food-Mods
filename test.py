# test data.json
import json

with open("data.json", "r") as f:
    data = json.load(f)

for i, j in data["editions"].items():
    for k in j["items"]:
        if k not in data["items"]:
            print(f"'{k}' is not in items definitions")

    for l in j["blocks"]:
        if l not in data["blocks"]:
            print(f"'{l}' is not in blocks definitions")
