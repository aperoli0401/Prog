m = [[1,2,3], [4,5,6], [7,8,9]]

m2 = [[0,0,0], [0,0,0], [0,0,0]]
#print(matriz[1][2])
#print(matriz[1][1])
#print(matriz[1])
        
for fila in range(len(m)):
    for columna in range(len(m[fila])):
        if m[fila][columna] % 2 == 0:
            m2[fila][columna] = m[fila][columna]
            m[fila][columna] = 0

print("M: ")
for line in m:
    print(fila)
    
print("m2: ")
for line in m2:
    print(fila)