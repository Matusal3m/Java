class Calcula:
    def __init__(self, n1, n2, operador):
        n1.self = n1
        n2.self = n2
        operador.self = operador
        
    def calc(n1, n2, operador):
        if operador == '/':
            return n1 / n2 
        elif operador == '*':
            return n1 * n2
        elif operador == '-':
            return n1 - n2
        else:
            return n1 + n2
