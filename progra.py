#Lógica del Juego
'''Valores del juego:
    0 = Nada
    1 = 1 Nivel
    2 = 2 Niveles
    3 = 3 Niveles
    L = Luz Amarilla
    R = Robot
    A = Luz Azul
'''

def ColocarPiso():
    evaluador = 0
    while(evaluador < 49):
        x = 0
        y = 0
        while (y <=6):
            while(x <=6):
                print("Inserte el valor de Piso (de 1 a 4)para el espacio: [",y,',',x,"] del mapa:")
                matriz[y][x] = int(input())
                evaluador +=1
                x+=1
            x=0
            y+=1
    Print()

def ColocarRobot():
    try:
        x = int(input('Digite el valor en X donde se desea colocar el Robot: '))
        y =  int(input('Digite el valor en Y donde se desea colocar el Robot: '))
        global pisoRobot
        pisoRobot = matriz[y][x]
        matriz[y][x] = 'RV'
    except:
        print('Valor de espacio invalido, intente de nuevo.')
        ColocarRobot()

def PosRobot():
    for i in range (0,7):
        for j  in range (0,7):
            if matriz[i][j] == 'RV' or matriz[i][j] == 'R>' or matriz[i][j] == 'R^' or matriz[i][j] == 'R<':
                pos = [i,j]
                return pos

def PosLuz():
    for i in range (0,7):
        for j  in range (0,7):
            if matriz[i][j] == 'L':
                pos = [i,j]
                return pos    
    
                
    
        
def ColocarLuz():
    global pisoLuz
    try:
        x = int(input('Digite el valor en X donde se desea colocar una Luz: '))
        y =  int(input('Digite el valor en Y donde se desea colocar una Luz: '))
        if (matriz[y][x] == 'RV'):
            print('No puede colocar una luz en el espacio inicial del Robot. Intente colocarla de nuevo.')
            return  ColocarLuz()
        else:
            pisoLuz.append(matriz[y][x])
            matriz[y][x] = 'L'
    except:
        print('Valor de espacio invalido, intente de nuevo.')
        ColocarLuz()
    MasLuces()

def MasLuces():
    try:
        seguir = input('¿Desea colocar más luces? ')
        if(seguir == 'si' or seguir == 'Si' or seguir == 'sí' or seguir == 'Sí'):
            ColocarLuz()
        elif(seguir != 'no' and seguir != 'No'):
            print('Respuesta inválida.')
            return MasLuces()
    except:
        print('Respuesta inválida.')
        return MasLuces()

def RotarRobot(restmov):
    pos = PosRobot()
    x = pos[1]
    y = pos[0]
    posRobot = matriz[y][x]
    if restmov[0] == 'rizq':
        if posRobot == 'RV':
            matriz[y][x] = 'R>'
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
        elif posRobot == 'R>':
            matriz[y][x] = 'R^'
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
        elif posRobot == 'R^':
            matriz[y][x] = 'R<'
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
        else:
            matriz[y][x] = 'RV'
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
    elif restmov[0] == 'rder':
        if posRobot == 'RV':
            matriz[y][x] = 'R<'
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
        elif posRobot == 'R>':
            matriz[y][x] = 'RV'
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
        elif posRobot == 'R^':
            matriz[y][x] = 'R>'
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
        else:
            matriz[y][x] = 'R^'
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
        
def Avanzar(restmov):
    global pisoRobot
    pR = pisoRobot
    pos = PosRobot()
    x = pos[1]
    y = pos[0]
    if matriz[y][x] == 'RV':
        try:
            if pR == matriz[y+1][x]:
                matriz[y][x] = pR
                pR = matriz[y+1][x]
                matriz[y+1][x] = 'RV'
                restmov.pop(0)
                print('\n')
                Print()
                pisoRobot = pR
                return Accion(restmov)
            else:
                restmov.pop(0)
                print('\n')
                Print()
                return Accion(restmov)
        except:
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
    elif matriz[y][x] == 'R>':
        try:
            if pR == matriz[y][x+1]:
                matriz[y][x] = pR
                pR = matriz[y][x+1]
                matriz[y][x+1] = 'R>'
                restmov.pop(0)
                print('\n')
                Print()
                pisoRobot = pR
                return Accion(restmov)
            else:
                restmov.pop(0)
                print('\n')
                Print()
                return Accion(restmov)
        except:
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
    elif matriz[y][x] == 'R^':
        try:
            if pR == matriz[y-1][x]:
                matriz[y][x] = pR
                pR = matriz[y-1][x]
                matriz[y-1][x] = 'R^'
                restmov.pop(0)
                print('\n')
                Print()
                pisoRobot = pR
                return Accion(restmov)
            else:
                restmov.pop(0)
                print('\n')
                Print()
                return Accion(restmov)
        except:
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
    elif matriz[y][x] == 'R<':
        try:
            if pR == matriz[y][x-1]:
                matriz[y][x] = pR
                pR = matriz[y][x-1]
                matriz[y][x-1] = 'R<'
                restmov.pop(0)
                print('\n')
                Print()
                pisoRobot = pR
                return Accion(restmov)
            else:
                restmov.pop(0)
                print('\n')
                Print()
                return Accion(restmov)
        except:
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)

def Saltar(restmov):
    global pisoRobot
    pR = pisoRobot
    pos = PosRobot()
    x = pos[1]
    y = pos[0]
    if matriz[y][x]  =='RV':
        try:
            if pR > matriz[y+1][x] or pR < matriz[y+1][x]:
                matriz[y][x] = pR
                pR = matriz[y+1][x]
                matriz[y+1][x] = 'RV'
                restmov.pop(0)
                print('\n')
                Print()
                pisoRobot = pR
                return Accion(restmov)
            else:
                restmov.pop(0)
                print('\n')
                Print()
                return Accion(restmov)
        except:
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
    elif matriz[y][x] == 'R>':
        try:
            if pR > matriz[y][x+1] or pR < matriz[y][x+1]:
                matriz[y][x] = pR
                pR = matriz[y][x+1]
                matriz[y][x+1] = 'R>'
                restmov.pop(0)
                print('\n')
                Print()
                pisoRobot = pR
                return Accion(restmov)
            else:
                restmov.pop(0)
                print('\n')
                Print()
                return Accion(restmov)
        except:
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
    elif matriz[y][x] == 'R^':
        try:
            if pR > matriz[y-1][x] or pR < matriz[y-1][x]:
                matriz[y][x] = pR
                pR = matriz[y-1][x]
                matriz[y-1][x] = 'R^'
                restmov.pop(0)
                print('\n')
                Print()
                pisoRobot = pR
                return Accion(restmov)
            else:
                restmov.pop(0)
                print('\n')
                Print()
                return Accion(restmov)
        except:
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)
    elif matriz[y][x] == 'R<':
        try:
            if pR > matriz[y][x-1] or pR < matriz[y][x-1]:
                matriz[y][x] = pR
                pR = matriz[y][x-1]
                matriz[y][x-1] = 'R<'
                restmov.pop(0)
                print('\n')
                Print()
                pisoRobot = pR
                return Accion(restmov)
            else:
                restmov.pop(0)
                print('\n')
                Print()
                return Accion(restmov)
        except:
            restmov.pop(0)
            print('\n')
            Print()
            return Accion(restmov)

def ApagarLuz(restmov):
    global pisoRobot
    pR = pisoRobot
    pos = PosRobot()
    x = pos[1]
    y = pos[0]
    #if matriz[y][x]  =='RV':
    
            
def IngresarAccion(mov,contador):
    while contador <10 :
        x = input('Inserte acción: ')
        if x == 'rder' or x== 'rizq' or x=='a' or x=='s' or x== 'l':
            mov.append(x)
            contador = contador+1
        else:
            print('Acción ingresada inválida. Intente de nuevo. ')
            return IngresarAccion(mov,contador)
    print('\n')
    print(mov)
    print('\n')
    Print()
    Accion(mov)


def Accion(mov):
    while(mov != [ ]): 
        if mov[0] == 'rder' or mov[0] == 'rizq' :
            return RotarRobot(mov)
        elif (mov[0] == 'a'):
            return Avanzar(mov)
        elif (mov[0] == 's'):
            return Saltar(mov)
        '''
        elif  (mov[0]==l):
            return ApagarLuz()
            '''

            
def Print():
    for i in range(0,7):
        print(matriz[i])

matriz= [[0,0,0,0,0,0,0],
              [0,0,1,2,0,0,0],
              [0,0,0,1,0,0,0],
              [0,0,0,0,0,0,0],
              [0,0,0,0,0,0,0],
              [0,0,0,0,0,0,0],
              [0,0,0,0,0,0,0]]
cont = 0
mov = []
pisoRobot=0
pisoLuz=[]


#ColocarPiso()
ColocarRobot()
#ColocarLuz()
#RotarRobot(['rder',])
#PisoRobot(ColocarRobot())
#Print()
#print(pisoRobot)
IngresarAccion(mov,cont)
