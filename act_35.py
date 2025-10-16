usuario_correcto = "aperoli"
contrasena_correcta = "aperolii"

nombre_usuario = input("Introduce tu nombre de usuario: ")
contrasena = input("Introduce tu contraseña: ")

contador = 0
for caracter in contrasena:
    contador += contrasena.count(caracter, contador, contador + 1)
if nombre_usuario == usuario_correcto:
    if contrasena == contrasena_correcta:
        if contador >= 8:
            print("Bienvenido", usuario_correcto)
        else:
            print("La contraseña debe tener al menos 8 caracteres.")
    else:
        print("Contraseña incorrecta.")
else:
    print("Usuario incorrecto.")
