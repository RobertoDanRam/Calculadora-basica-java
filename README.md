# Calculadora Básica (Actividad 8)

Programa de consola en Java que funciona como una calculadora interactiva. Permite al usuario realizar diversas operaciones matemáticas básicas con dos números de punto flotante, garantizando la estabilidad del programa mediante la validación continua de entradas.

**Autor:** Roberto Daniel Ramos Flores

## Características Principales

- **Operaciones Aritméticas:** Soporta suma, resta, multiplicación y división.
- **Operaciones Adicionales:** Permite elevar al cuadrado ambos números ingresados de forma simultánea.
- **Prevención de Errores Matemáticos:** Incluye una validación específica para evitar la división entre cero.
- **Validación de Entradas:** Utiliza el manejo de excepciones para asegurar que el usuario ingrese únicamente valores numéricos válidos, evitando que el programa colapse al introducir texto o caracteres especiales.
- **Ejecución Continua:** Implementa un bucle interactivo que permite al usuario realizar múltiples operaciones consecutivas sin necesidad de reiniciar la aplicación.

## Tecnologías Utilizadas

- **Lenguaje:** Java
- **Manejo de entrada:** `Scanner` (con lectura de caracteres y flotantes)
- **Control de flujo:** `switch`, `while`
- **Manejo de Excepciones:** `try-catch` (`InputMismatchException`)

## Estructura del Código

- `Calculadora.java`: Clase principal que contiene toda la lógica del programa.
  - `main(String[] args)`: Controla el flujo principal, el menú de operaciones y el bucle de continuidad.
  - `obtenerNumero(Scanner scanner, String mensaje)`: Método auxiliar modularizado que se encarga de solicitar un número al usuario y validar (mediante `try-catch`) que el formato
