original = [1,2,3,4,5]

copia1 = original.copy()
copia2 = original[0:4]
copia3 = [1,2,3,4,5]
copia4 = original

for i in range(len(original)):
    if len(original) != len(copia1):
        print("No son iguales")
    else:
        print("Son iguales")
        