inventario = ["Manzanas","Platanos","Naranjas","Peras"]

inventario.append("uvas")
inventario.append("kiwis")

melones = ["melon1", "melon2"]
inventario.extend(melones)

inventario.insert(2, "platanos frescos")

producto_vendido = inventario.pop(-1)

inventario.remove("Peras")

emergencia = inventario[0:4]

print(inventario)
print(producto_vendido)
    