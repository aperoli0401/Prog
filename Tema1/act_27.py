import re
data ="""
Usuario: perez.juan
Email de contacto: juan.perez@dominio.com
Fecha de acceso: 15-09-2023
Código de cliente: AbC123456
Teléfono de emergencia: 601 234 567
Archivos encontrados: a_1.txt, b_22.py, c_333.pdf, d_4444.jpg
"""
patron_email = r'\S+@\S+\.\w+'
patron_digitos = r'\d\d-\d\d-\d\d\d\d'
patron_codigo = r'[A-Za-z]{3}[0-9]{6}'
patron_nombres = r'\S+_\S+.py'

print(re.findall(patron_email, data))
print(re.findall(patron_digitos, data))
print(re.findall(patron_codigo, data))
print(re.findall(patron_nombres, data)) 