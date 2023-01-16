import sys

def sumar(a, b):
    return a + b

def restar(a, b):
    return a - b

def multiplicar(a, b):
    return a * b

def dividir(a, b):
    return a / b

if __name__ == '__main__':
    if len(sys.argv) != 4:
        print("Uso: calculador.py <operación> <número1> <número2>")
        sys.exit(1)

    operacion = sys.argv[1]
    a = float(sys.argv[2])
    b = float(sys.argv[3])

    if operacion == 'sumar':
        resultado = sumar(a, b)
    elif operacion == 'restar':
        resultado = restar(a, b)
    elif operacion == 'multiplicar':
        resultado = multiplicar(a, b)
    elif operacion == 'dividir':
        resultado = dividir(a, b)
    else:
        print("Operación no válida")
        sys.exit(1)

    print("Resultado:", resultado)
