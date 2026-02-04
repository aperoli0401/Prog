import act_16
import act_15

numeros = [14,10,20,78,40,73,60,54,87,90]
eleccion = 40
print("Búsqueda Lineal")
resultado=act_15.busquedaLineal(numeros, eleccion)
if resultado != -1:
    print("El numero",eleccion,"se encuentra en la posicion",(resultado))
else:
    print("Ese numero no se encuentra.")
print("Búsqueda Binaria")
resultado=act_16.busquedaBinaria(numeros, eleccion)
if resultado != -1:
    print("El numero",eleccion,"se encuentra en la posicion",(resultado))
else:
    print("Ese numero no se encuentra.")

numeros_ordenados = sorted(numeros)