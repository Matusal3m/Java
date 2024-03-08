from Calcula import Calcula

calc = Calcula

n1 = int(input('Insira um valor'))
n2 = int(input('Insira outro valor'))
operador = input('Escola a operação(+, -, * ou /)')
print(calc.calc(n1, n2, operador))