def busquedaLineal (lista, n):
    i = 0
    respuesta = -1
    while i < len(lista) and respuesta == -1:
        if lista[i] == n:
            respuesta = i
        i = i + 1 
    return(respuesta)