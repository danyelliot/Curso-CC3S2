import unittest
from calculador import sumar, restar, multiplicar, dividir

class TestCalculador(unittest.TestCase):
    def test_sumar(self):
        resultado = sumar(10, 5)
        self.assertEqual(resultado, 15)

    def test_restar(self):
        resultado = restar(10, 5)
        self.assertEqual(resultado, 5)

    def test_multiplicar(self):
        resultado = multiplicar(10, 5)
        self.assertEqual(resultado, 50)

    def test_dividir(self):
        resultado = dividir(10, 5)
        self.assertEqual(resultado, 2)

if __name__ == '__main__':
    unittest.main()

