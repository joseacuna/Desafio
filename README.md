# Desafio
Asume la existencia de una matriz de N * M (es decir no es necesariamente cuadrada), cada casilla de la matriz tiene un numero al azar entre 1 y 9. Necesito que desarrolles un algoritmo que sea capaz de encontrar el camino desde la posición [0][0] hasta [N][M], con de la suma de los dígitos  de cada casilla que compone el camino sume el numero mas pequeño posible (es decir el camino optimo) con las siguientes condiciones:
 - No se puede avanzar en diagonales
 - Se debe avanzar por posición por posición
 
por si no se entiende lo hago con un ejemplo de matriz sencillo:

```
  [ 1 ] [ 3 ] [ 2 ]
  [ 7 ] [ 2 ] [ 9 ]
  [ 6 ] [ 1 ] [ 0 ]
```
Existen múltiples formas de llegar de una esquina a otra, sin embargo, el camino que suma la menor cantidad es:
```
  [ * ] [  * ] [   ]
  [   ] [  * ] [   ]
  [   ] [  * ] [ * ]
```
Donde ese camino suma: 7  (1+3+2+1+0)
