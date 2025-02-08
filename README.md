# Calculadora IMC Java

## Resumen visual

Este programa calcula el Índice de Masa Corporal (IMC) de una persona a partir de su peso (en kg) y estatura (en metros), y luego determina si tiene un peso normal, inferior o superior al normal u obesidad, basándose en los rangos de la tabla.

## Tabla de interpretación del IMC

| IMC        | Resultado         |
| ---------- | ----------------- |
| < 16       | Delgadez severa   |
| [16-17)    | Delgadez moderada |
| [17-18.5)  | Delgadez leve     |
| [18.5-25)  | Peso normal       |
| [25-30)    | Sobrepeso         |
| [30-35)    | Obesidad leve     |
| [35-40)    | Obesidad moderada |
| >= 40      | Obesidad mórbida  |

## ¿Cómo funciona este programa?

1.  **Definición de valores:** El programa define valores fijos para el peso (70 kg) y la estatura (1.75 m).
2.  **Cálculo del IMC:** Se utiliza la fórmula mencionada anteriormente para calcular el IMC.
3.  **Interpretación del resultado:** Se compara el IMC calculado con los rangos de la tabla para determinar el resultado (delgadez, peso normal, sobrepeso, obesidad, etc.).
4.  **Presentación de resultados:** Se muestra en pantalla el IMC calculado y su correspondiente interpretación.

## Ejemplo de uso

El programa utiliza valores fijos para el peso (70 kg) y la estatura (1.75 m). La salida del programa es la siguiente:
* Tu índice de masa corporal (IMC) es: 22.86
* Esto significa que tienes: Peso normal


## Requisitos

*   Se debe realizar un test unitario de cada método usando TDD (cobertura mínima del 70%).
*   Cuidado con los commits.
