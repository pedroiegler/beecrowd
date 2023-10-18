def verificar_seguranca(cameras, i, j):
    cameras_ativadas = cameras[i][j] + cameras[i][j+1] + cameras[i+1][j] + cameras[i+1][j+1]
    return 'S' if cameras_ativadas >= 2 else 'U'

N = int(input())

cameras = []
for _ in range(N + 1):
    linha = list(map(int, input().split()))
    cameras.append(linha)

quadras = []
for i in range(N):
    linha_quadras = [verificar_seguranca(cameras, i, j) for j in range(N)]
    quadras.append(linha_quadras)

for linha_quadras in quadras:
    print("".join(linha_quadras))
