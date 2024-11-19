# Sumatoria de anillos en una matriz cuadratica

## Formulación del problema:

<div style="text-align: center;">
  <img src="IMAGENProblema.jpg" alt="Imagen del problema" width="700" />
</div>

## Metodología:

### Diseño del algoritmo:

Podemos comprender la resolución del problema mediante el siguiente pseudocodigo:

<div style="text-align: center;">
  <img src="Diagrama.jpg" alt="Imagen del diagrama" width="700" />
</div>

Acordé a los criterios del problema se debe generar una matriz cuadrática de tamaño "dimensión x dimensión", siendo la matriz cuadrática el valor "dimensión" (dim ≥ 1), dicho dato será el n° de filas y n° columnas de la matriz.

También los parámetros del problema exigen que cada elemento de la matriz contenga un número del 0 al 100 aplicado por aleatoriedad.

Con la matriz inicializada,el usuario debe ingresar el n° de anillo que desea su sumatoria, la sumatoria funcionara siempre que lo ingresado este dentro de la cantidad de anillos (dim/2 [redondeado]) en la matriz. 

<div style="text-align: center;">
  <img src="DEMOindices.gif" alt="Imagen del diagrama" width="700" />
</div>

Teniendo los valores de la "dimensión" y el "n° del anillo", es posible calcular los límites superior ("n° del anillo" - 1) e inferior (dim - "n° del anillo") del anillo, es decir, determinar su ubicación en coordenadas de matriz para realizar su recorrido dentro de la misma, así mismo la sumatoria.





### Implementación del algoritmo:

### Análisis del algoritmo:
