# Ejercicio 19: Comparacion de arrays
lista_a = [10, 20, 30]
lista_b = [10, 20, 30]
lista_c = [30, 20, 10] # Mismos elementos, orden diferente
lista_d = [10, 20]     # Longitud diferente

print(f"A == B: {lista_a == lista_b}") # True
print(f"A == C: {lista_a == lista_c}") # False (el orden importa)
print(f"A == D: {lista_a == lista_d}") # False (la longitud importa)

#TODO: Algoritmo que dice si dos arrays son iguales
def iguales(lista1, lista2):
    #TODO: Necesito comparar para saber si son iguales
    if lista1 == lista2:
        print("Son iguales")
    elif len(lista1) != len(lista2):
        print("NO son iguales")
    elif sorted(lista1) == sorted(lista2):
        print("Son iguales")
    else:
        print("NO son iguales")

    
    
#TODO: Aqui creo las listas   
lista1 = [1,2,3]
lista2 = [2,4,1]

#TODO: LLamo a la funcion y le pido que imprima el resultado
iguales(lista1, lista2)




    
    
    #TODO: retorna un valor boleano
