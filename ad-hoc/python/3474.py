while True:
    try:
        valor_figurinha, num_integrantes = map(float, input().split())
        valor_por_integrante = valor_figurinha / num_integrantes
        print('%.2f' % valor_por_integrante)
    except EOFError:
        break
