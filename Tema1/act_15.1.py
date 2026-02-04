lista = ['22','49','43','67','9','65']
encontrar = input("Dime un numero: ")

def busqueda(encontrar,lista):
    for i  in range(len(lista)):
        if encontrar == lista[i]:
            return(i)
    return(-1)
    
busqueda(encontrar,lista)
print("El numero coincide con: ", busqueda(encontrar,lista))