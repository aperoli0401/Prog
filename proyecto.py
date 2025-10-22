#Piedra Papel Tijera

import random

piedra  = str("piedra")
papel = str("papel")
tijera = str("tijera")

juego = [piedra, papel, tijera] 

usuario = input("Elige entre piedra, papel o tijera: ")
rival  = (random.choice(juego))
    
print("El rival a elegido: ", rival)
   
if usuario == piedra and rival == piedra:
    print("Empate")
elif usuario == piedra and rival == papel:
    print("Perdiste")
elif usuario == piedra and rival == tijera:
    print("Ganaste")
elif usuario == papel and rival == piedra:
    print("Ganaste")
elif usuario == papel and rival == papel:
    print("Empate")
elif usuario == papel and rival == tijera:
    print("Perdiste")
elif usuario == tijera and rival == piedra:
    print("Perdiste")
elif usuario == tijera and rival == papel:
    print("Ganaste")
elif usuario == tijera and rival == tijera:
    print("Empate")
else:
    print("Elige algo del juego anda...")
