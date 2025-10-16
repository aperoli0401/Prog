def cuentaVocales(texto):
    cuenta = texto.count("aeiou") + texto.count("AEIOU")
    nuevoTexto = texto.replace("aeiou","x")
    nuevoTexto2 = texto.replace("AEIOU","X")
    return nuevoTexto2

frase = input("Dime una frase o una palabra: ")
print(cuentaVocales(nuevoTexto2))
    
