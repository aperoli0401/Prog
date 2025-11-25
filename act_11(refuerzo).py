
matriz = [
    ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I']
]


print("Matriz original:")
for fila in matriz:
    print(' '.join(fila))

fila_central = len(matriz) // 2
columna_central = len(matriz[0]) // 2
print("Elemento central:", matriz[fila_central][columna_central])

matriz[fila_central][columna_central] = 'X'

print("Matriz después de cambiar el elemento central por 'X':")
for fila in matriz:
    print(' '.join(fila))
