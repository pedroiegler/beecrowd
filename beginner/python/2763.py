string = input()

tokens = string.split(".")
tokens = [token.split("-") for token in tokens]

tokens = [item for sublist in tokens for item in sublist]

for token in tokens:
    print(token)
